package SportShop;

public class SportInfo {
    public String TimeOfYear;
    public String SportName;
    public String EquipmentItems;
    public double PriceInUah;
    public String Size;


    public SportInfo(String TimeOfYear, String SportName, String EquipmentItems,
                     double PriceInUah, String Size){
        this.TimeOfYear = TimeOfYear;
        this.SportName = SportName;
        this.EquipmentItems = EquipmentItems;
        this.PriceInUah = PriceInUah;
        this.Size = Size;
    }

    public String toString(){
        return null;
    }

}
