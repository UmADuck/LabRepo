package ua.lviv.iot.FirstProject.SportShop;

import ua.lviv.iot.FirstProject.Models.*;

public abstract class SportInfo {
    protected Seasons season;
    protected SportNames sportName;

    public SportInfo(Seasons timeOfYear, SportNames sportName){
        this.season = timeOfYear;
        this.sportName = sportName;
    }

    public SportInfo() {

    }

    public Seasons getSeason(){return(season);}
    public SportNames getSportName(){return(sportName);}
    public void setSeason(Seasons season){this.season = season;}
    public void setSportName(SportNames sportName){this.sportName = sportName;}



    public String toString(){
        return null;
    }

}
