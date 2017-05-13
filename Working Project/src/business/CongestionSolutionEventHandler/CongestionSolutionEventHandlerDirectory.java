/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionSolutionEventHandler;

import java.util.ArrayList;
import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 *
 * @author Swarup
 */
public class CongestionSolutionEventHandlerDirectory {
    private ArrayList<CongestionSolutionEventHandler> congestionSolutionEventHandlerList;

    public CongestionSolutionEventHandlerDirectory() {
        congestionSolutionEventHandlerList=new ArrayList<>();
    }

    public ArrayList<CongestionSolutionEventHandler> getCongestionSolutionEventHandlerList() {
        return congestionSolutionEventHandlerList;
    }

    public void setCongestionSolutionEventHandlerList(ArrayList<CongestionSolutionEventHandler> congestionSolutionEventHandlerList) {
        this.congestionSolutionEventHandlerList = congestionSolutionEventHandlerList;
    }
    
    public CongestionSolutionEventHandler addCongestionSolution(){
        CongestionSolutionEventHandler congestionSolution=new CongestionSolutionEventHandler();
        congestionSolutionEventHandlerList.add(congestionSolution);
        return congestionSolution;
    }
}
