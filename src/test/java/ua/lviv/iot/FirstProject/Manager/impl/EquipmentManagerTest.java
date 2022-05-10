package ua.lviv.iot.FirstProject.Manager.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.FirstProject.Models.Seasons;

import ua.lviv.iot.FirstProject.SportShop.EquipmentInfo;

import java.util.LinkedList;
import java.util.List;

import static ua.lviv.iot.FirstProject.Models.Seasons.*;
import static ua.lviv.iot.FirstProject.Models.Sizes.*;
import static ua.lviv.iot.FirstProject.Models.SportNames.*;

class EquipmentManagerTest {

    public List<EquipmentInfo> equipmentInfo;

    public EquipmentManager equipmentManager;

    @BeforeEach
    void setUp() throws Exception {
        equipmentInfo = new LinkedList<>();
        equipmentInfo.add(new EquipmentInfo(spring, Biking, "trampoline", 500, XS));
        equipmentInfo.add(new EquipmentInfo(winter, Skiing, "Ski", 100, L));
        equipmentManager = new EquipmentManager();
        equipmentManager.addEquipment(equipmentInfo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEmptyManagerReturnNull() {
        nullResultTest(new EquipmentManager());
    }

    @Test
    void testManagerReturnNull() {
        nullResultTest(equipmentManager);
    }

    void nullResultTest(EquipmentManager equipmentManager) {
        var results = equipmentManager.findEquipmentBySeasonsAndSizes(XS, autumn);
        Assertions.assertNull(results);
    }

    void testFindSizeAndSeason() {
        var results = equipmentManager.findEquipmentBySeasonsAndSizes(XS, autumn);
        Assertions.assertEquals(1, results.size());
        Assertions.assertEquals(Seasons.autumn, results.get(0).getSeason());
    }

    void testReversedSortByPrice() {
        equipmentManager.getEquipmentSortedByPrice(equipmentInfo, true);
        Assertions.assertEquals(Seasons.spring, equipmentInfo.get(0).getSeason());
        Assertions.assertEquals(Seasons.winter, equipmentInfo.get(5).getSeason());
    }

    void testReversedSortBySize() {
        equipmentManager.getEquipmentSortedBySize(equipmentInfo, true);
        Assertions.assertEquals(Seasons.winter, equipmentInfo.get(0).getSeason());
        Assertions.assertEquals(Seasons.spring, equipmentInfo.get(5).getSeason());
    }

    void testSortByPrice() {
        equipmentManager.getEquipmentSortedByPrice(equipmentInfo, false);
        Assertions.assertEquals(Seasons.winter, equipmentInfo.get(0).getSeason());
        Assertions.assertEquals(Seasons.spring, equipmentInfo.get(5).getSeason());
    }

    void testSortBySize() {
        equipmentManager.getEquipmentSortedBySize(equipmentInfo, false);
        Assertions.assertEquals(Seasons.spring, equipmentInfo.get(0).getSeason());
        Assertions.assertEquals(Seasons.winter, equipmentInfo.get(5).getSeason());
    }

}