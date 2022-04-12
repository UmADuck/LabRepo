import java.util.*;
import java.lang.*;
import java.io.*;

import SportShop.EquipmentInfo;

public class Main {

    public static void main(String args[]){

        EquipmentInfo Diving = new EquipmentInfo(
                "summer", "diving",
                "mask, suit, scuba tank" );

        EquipmentInfo Mountaineering = new EquipmentInfo(
                "winter", "mountaineering",
                "thermal suit, tent, walking sticks" );

        EquipmentInfo Skydiving = new EquipmentInfo(
                "summer", "Skydiving",
                "parachute" );

        System.out.println(Diving);
        System.out.println(Mountaineering);
        System.out.println(Skydiving);
    }
}
