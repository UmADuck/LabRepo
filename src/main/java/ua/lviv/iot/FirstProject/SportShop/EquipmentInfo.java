package ua.lviv.iot.FirstProject.SportShop;

import lombok.*;
import ua.lviv.iot.FirstProject.Models.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EquipmentInfo extends SportInfo {
    private String equipmentItems;
    private int priceInUah;
    private Sizes size;

    public EquipmentInfo(Seasons season, SportNames sportName, String equipmentItems,
                         int priceInUah, Sizes size) {
        super(season, sportName);
        this.equipmentItems = equipmentItems;
        this.priceInUah = priceInUah;
        this.size = size;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "equipmentItems, " + "priceInUah, " + "size";
    }

    public String toCSV() {
        return super.toCSV() + "equipment items: " + equipmentItems
                + ", price in UAH: " + priceInUah + ", size: " + size;
    }


    @Override
    public String toString() {
        return this.sportName + ":(Season: " + this.season
                + ", EquipmentItems: " + this.equipmentItems
                + ", PriceInUah: " + this.priceInUah
                + ", Size: " + this.size + ")";
    }
}

