/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Route;

import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class RouteDirectory {
    private ArrayList<Route> routeList;
    
    public RouteDirectory()
    {
        routeList=new ArrayList<>();
    }

    public ArrayList<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(ArrayList<Route> routeList) {
        this.routeList = routeList;
    }
    
    public Route addRoute()
    {
        Route route=new Route();
        routeList.add(route);
        return route;
    }
    
}
