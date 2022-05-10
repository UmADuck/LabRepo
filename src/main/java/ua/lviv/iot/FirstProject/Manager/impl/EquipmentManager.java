package ua.lviv.iot.FirstProject.Manager.impl;

import ua.lviv.iot.FirstProject.Manager.IEquipmentManager;
import ua.lviv.iot.FirstProject.Models.*;
import ua.lviv.iot.FirstProject.SportShop.*;

import java.util.*;
import java.util.stream.Collectors;

public class EquipmentManager implements IEquipmentManager {
    private Map<String, List<SportInfo>> equipmentMap = new HashMap<>();

    @Override
    public List<EquipmentInfo> findEquipmentBySeasonsAndSizes(Sizes Size, Seasons season) {
        List<EquipmentInfo> tempEquipment = new LinkedList<>();
        List<SportInfo> tempSport = new LinkedList<>();
        List<EquipmentInfo> result = new LinkedList<>();

        for (List<SportInfo> sport : equipmentMap.values()) {
            tempSport.addAll(sport.stream().filter(item -> item instanceof EquipmentInfo).collect(Collectors.toList()));
        }
        System.out.println(tempSport);
        for (SportInfo sport : tempSport) {
            tempEquipment.add((EquipmentInfo) sport);
        }
        System.out.println(tempEquipment);
        result.addAll(tempEquipment.stream()
                .filter(item -> ((item.getSeason().equals(season) || item.getSeason().equals(Seasons.summer)) &&
                        (item.getSize().equals(Size) || item.getSize().equals(Sizes.S))))
                .collect(Collectors.toList()));
        if (result.isEmpty())
            return null;
        else return result;
    }

    @Override
    public void addEquipment(List<EquipmentInfo> equipmentList) {
        equipmentList.forEach(equipment -> {
            String equipmentName = equipment.getEquipmentItems();
            var existingEquipment = equipmentMap.computeIfAbsent(equipmentName, k -> new LinkedList<SportInfo>());
            existingEquipment.add(equipment);
        });
    }

    @Override
    public void getEquipmentSortedByPrice(List<EquipmentInfo> equipmentList, boolean isReversed) {
        if (isReversed) {
            equipmentList.sort(Collections.reverseOrder(Comparator.comparing(EquipmentInfo::getPriceInUah)));
        } else {
            equipmentList.sort(Comparator.comparing(EquipmentInfo::getPriceInUah));
        }
    }

    @Override
    public void getEquipmentSortedBySize(List<EquipmentInfo> equipmentList, boolean isReversed) {
        if (isReversed) {
            var desiredOrder = Arrays.asList(Sizes.XS, Sizes.S, Sizes.M, Sizes.L, Sizes.XL);
            Comparator<Sizes> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
            equipmentList.sort(Comparator.comparing(EquipmentInfo::getSize, sizeOrder));
        } else {
            var desiredOrder = Arrays.asList(Sizes.XL, Sizes.L, Sizes.M, Sizes.S, Sizes.XS);
            Comparator<Sizes> sizeOrder = Comparator.comparingInt(desiredOrder::indexOf);
            equipmentList.sort(Comparator.comparing(EquipmentInfo::getSize, sizeOrder));
        }
    }
}


