/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Route;

import business.CongestionProblem.CongestionProblem;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Swarup
 */
public class Route implements Comparable<Route>{
    private String routeName;
    private int distance;
    private boolean congestion;
    private static int congestionCount=1;
    private String congestionProblem;
    private String constructionSolution;
    private String eventHandlerSolution;
    private Date requestDate;
    private Date resolveDate;
    private UserAccount sender;
    private UserAccount receiver;
    private CongestionProblem congestionProblem1;
    private int probCount=0;

    public int getProbCount() {
        return probCount;
    }

    public void setProbCount(int probCount) {
        this.probCount = probCount;
    }

//    public static int getProbCount() {
//        return probCount;
//    }
//
////    public Route() {
////        congestionCount++;
//    public static void setProbCount(int probCount) {
//        Route.probCount = probCount;
//    }
    
    public void incrementProbCount(){
        probCount++;
    }

//    }
    public UserAccount getSender() {
        return sender;
    }

    public static int getCongestionCount() {
        return congestionCount;
    }

    public static void setCongestionCount(int congestionCount) {
        Route.congestionCount = congestionCount;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public CongestionProblem getCongestionProblem1() {
        return congestionProblem1;
    }

    public void setCongestionProblem1(CongestionProblem congestionProblem1) {
        this.congestionProblem1 = congestionProblem1;
    }

    public boolean isCongestion() {
        return congestion;
    }

    public void setCongestion(boolean congestion) {
        this.congestion = congestion;
        ++congestionCount;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getCongestionProblem() {
        return congestionProblem;
    }

    public void setCongestionProblem(String congestionProblem) {
        this.congestionProblem = congestionProblem;
    }
    
    public void incrementProblemOccurence(){
        congestionCount++;
    }

    public String getConstructionSolution() {
        return constructionSolution;
    }

    public void setConstructionSolution(String constructionSolution) {
        this.constructionSolution = constructionSolution;
    }

    public String getEventHandlerSolution() {
        return eventHandlerSolution;
    }

    public void setEventHandlerSolution(String eventHandlerSolution) {
        this.eventHandlerSolution = eventHandlerSolution;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Override
    public String toString() {
        return routeName;
    }
    
    @Override
    public int compareTo(Route t) {
        int qty=((Route)t).getProbCount();
        return qty-this.getProbCount();
    }
    
}
