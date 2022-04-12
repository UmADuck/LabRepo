package SportShop;

public class EquipmentInfo extends SportInfo {

    public EquipmentInfo(String TimeOfYear, String SportName, String EquipmentItems) {
        super(TimeOfYear, SportName, EquipmentItems, 100.5, "Adult");
    }

    @Override
    public String toString() {
        return  SportName+":(TimeOfYear: " + TimeOfYear
                +", EquipmentItems: " + EquipmentItems
                +", PriceInUah: " + PriceInUah
                +", Size: " + Size + ")";
    }
}

