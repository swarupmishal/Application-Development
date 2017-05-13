/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Location;

import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class LocationDirectory {
    private ArrayList <Location> locationList;
    
    public LocationDirectory()
    {
        locationList=new ArrayList<>();
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList<Location> locationList) {
        this.locationList = locationList;
    }
    
    public Location addLocation()
    {
        Location location=new Location();
        locationList.add(location);
        return location;
    }
}
