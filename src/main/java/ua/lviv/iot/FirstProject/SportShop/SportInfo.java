package ua.lviv.iot.FirstProject.SportShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.lviv.iot.FirstProject.Models.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public abstract class SportInfo {
    protected Seasons season;
    protected SportNames sportName;

    public String getHeaders() {
        return "Seasons, " + "SportNames, ";
    }

    public String toCSV() {
        return "Season: " + season + ", SportName" + sportName + ", ";
    }
}
