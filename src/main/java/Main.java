package main.java;

import java.util.*;
import java.lang.*;
import java.util.stream.Stream;


import main.java.Models.Seasons;
import main.java.Models.Sizes;
import main.java.Models.SportNames;
import main.java.SportShop.EquipmentInfo;
import main.java.Manager.impl.EquipmentManager;

public class Main {
    public static void main(String args[]){

        EquipmentManager manager = new EquipmentManager();
        List<EquipmentInfo> availableEquipment = new LinkedList<EquipmentInfo>();

        EquipmentInfo Diving = new EquipmentInfo(
                Seasons.summer, SportNames.Diving,
                "mask, suit, scuba tank", 50, Sizes.S);

        EquipmentInfo Mountaineering = new EquipmentInfo(
                Seasons.winter, SportNames.Mountaineering,
                "thermal suit, tent, walking sticks",
                100, Sizes.L );

        EquipmentInfo Skydiving = new EquipmentInfo(
                Seasons.summer, SportNames.Skydiving,
                "parachute", 40, Sizes.M );

        availableEquipment.add(Diving);
        availableEquipment.add(Skydiving);
        availableEquipment.add(Mountaineering);

        manager.addEquipment(availableEquipment);


        System.out.println("available equipment");
        System.out.println(availableEquipment);
        manager.getEquipmentSortedByPrice(availableEquipment, true);
        System.out.println("available equipment sorted by price ");
        System.out.println(availableEquipment);
        List<EquipmentInfo> equipmentChoosenBySeasonAndGender = manager.findEquipmentBySeasonsAndSizes(Sizes.S, Seasons.summer);
        System.out.println("summer equipment of size S");
        System.out.println(equipmentChoosenBySeasonAndGender);
        manager.getEquipmentSortedBySize(equipmentChoosenBySeasonAndGender, true);
        System.out.println("sorted by size equipment");
        System.out.println(equipmentChoosenBySeasonAndGender);

    }
}
