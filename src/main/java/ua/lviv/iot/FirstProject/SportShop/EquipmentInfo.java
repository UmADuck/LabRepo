package ua.lviv.iot.FirstProject.SportShop;

import ua.lviv.iot.FirstProject.Models.*;

public class EquipmentInfo extends SportInfo {
    private String equipmentItems;
    private int priceInUah;
    private Sizes size;

    public EquipmentInfo(Seasons season, SportNames sportName, String equipmentItems,
                         int priceInUah, Sizes size) {
        super();
        this.equipmentItems = equipmentItems;
        this.priceInUah = priceInUah;
        this.size = size;
        this.season = season;
        this.sportName = sportName;
    }

    public Sizes getSize(){return(size);}
    public void setSize(Sizes size){this.size = size;}
    public String getEquipmentItems(){return(equipmentItems);}
    public void setEquipmentItems(String equipmentItems){this.equipmentItems = equipmentItems;}
    public int getPriceInUah(){return(priceInUah);}
    public void setPriceInUahPrice(int priceInUah){this.priceInUah = priceInUah;}

    @Override
    public String toString() {
        return this.sportName + ":(Season: " + this.season
                + ", EquipmentItems: " + this.equipmentItems
                + ", PriceInUah: " + this.priceInUah
                + ", Size: " + this.size + ")";
    }
}

