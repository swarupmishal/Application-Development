/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Location;

import business.Route.Route;
import business.Route.RouteDirectory;
import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class Location {
    private String locationName;
    private RouteDirectory routeDirectory;
    
    public Location(){
        routeDirectory=new RouteDirectory();
    }

    public RouteDirectory getRouteDirectory() {
        return routeDirectory;
    }

    public void setRouteDirectory(RouteDirectory routeDirectory) {
        this.routeDirectory = routeDirectory;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return locationName;
    }
    
}
