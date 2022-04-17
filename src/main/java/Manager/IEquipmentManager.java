package main.java.Manager;

import java.util.List;

import main.java.Models.*;
import main.java.SportShop.EquipmentInfo;

public interface IEquipmentManager {
    List<EquipmentInfo> findEquipmentBySeasonsAndSizes(Sizes Size, Seasons season);
    void getEquipmentSortedByPrice(List<EquipmentInfo> equipmentList, boolean isReversed);
    void getEquipmentSortedBySize(List<EquipmentInfo> equipmentList, boolean isReversed);
    void addEquipment(List<EquipmentInfo> equipmentList);
}
