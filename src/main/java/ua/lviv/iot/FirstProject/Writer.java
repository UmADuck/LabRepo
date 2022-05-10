package ua.lviv.iot.FirstProject;

import ua.lviv.iot.FirstProject.SportShop.EquipmentInfo;

import java.util.List;
import java.io.*;


public class Writer extends EquipmentInfo {

    public static void writeCSV(List<EquipmentInfo> equipment) throws IOException {
        try (FileWriter writer = new FileWriter("result.scv")) {
            String previousClassName = "";
            for (var Equipment : equipment) {

                writer.write(Equipment.getHeaders());
                writer.write("\r\n");

                writer.write(Equipment.toCSV());
                writer.write("\r\n");
            }
        }
    }
}