package ua.lviv.iot.FirstProject.Manager;

import java.util.List;

import ua.lviv.iot.FirstProject.Models.*;
import ua.lviv.iot.FirstProject.SportShop.*;

public interface IEquipmentManager {
    List<EquipmentInfo> findEquipmentBySeasonsAndSizes(Sizes Size, Seasons season);
    void getEquipmentSortedByPrice(List<EquipmentInfo> equipmentList, boolean isReversed);
    void getEquipmentSortedBySize(List<EquipmentInfo> equipmentList, boolean isReversed);
    void addEquipment(List<EquipmentInfo> equipmentList);
}
