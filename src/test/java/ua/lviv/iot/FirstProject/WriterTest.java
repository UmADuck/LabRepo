package ua.lviv.iot.FirstProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.FirstProject.SportShop.EquipmentInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class WriterTest {

    @Test
    public void writeCSV(List<EquipmentInfo> equipment) throws IOException {
        try (
                FileReader expectedReader = new FileReader("expected.csv")) {
            BufferedReader expectedBR = new BufferedReader((expectedReader));
            FileReader actualReader = new FileReader("result.csv");
            BufferedReader actualBR = new BufferedReader(actualReader);
            {
                Assertions.assertEquals(expectedBR.readLine(), actualBR.readLine());
            }
        }
    }
}
