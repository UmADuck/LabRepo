package ua.lviv.iot.FirstProject;

import java.io.IOException;
import java.util.*;
import java.lang.*;

import ua.lviv.iot.FirstProject.Models.*;
import ua.lviv.iot.FirstProject.SportShop.EquipmentInfo;
import ua.lviv.iot.FirstProject.Manager.impl.EquipmentManager;

public class Main {
    public static void main(String[] args) throws IOException {

        EquipmentManager manager = new EquipmentManager();
        List<EquipmentInfo> availableEquipment = new LinkedList<EquipmentInfo>();

        EquipmentInfo Diving = new EquipmentInfo(
                Seasons.summer, SportNames.Diving,
                "mask, suit, scuba tank", 50, Sizes.S);

        EquipmentInfo Mountaineering = new EquipmentInfo(
                Seasons.winter, SportNames.Mountaineering,
                "thermal suit, tent, walking sticks",
                100, Sizes.L);

        EquipmentInfo Skydiving = new EquipmentInfo(
                Seasons.summer, SportNames.Skydiving,
                "parachute", 40, Sizes.M);

        availableEquipment.add(Diving);
        availableEquipment.add(Skydiving);
        availableEquipment.add(Mountaineering);

        manager.addEquipment(availableEquipment);


        System.out.println("available equipment");
        System.out.println(availableEquipment);
        manager.getEquipmentSortedByPrice(availableEquipment, true);
        System.out.println("available equipment sorted by price ");
        System.out.println(availableEquipment);
        List<EquipmentInfo> equipmentChosenBySeasonAndGender = manager.findEquipmentBySeasonsAndSizes(Sizes.S, Seasons.summer);
        System.out.println("summer equipment of size S");
        System.out.println(equipmentChosenBySeasonAndGender);
        manager.getEquipmentSortedBySize(equipmentChosenBySeasonAndGender, true);
        System.out.println("sorted by size equipment");
        System.out.println(equipmentChosenBySeasonAndGender);

        Writer.writeCSV(availableEquipment);
    }
}

