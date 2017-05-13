/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionSolutionConstruction;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class CongestionSolutionConstructionDirectory {
    private ArrayList<CongestionSolutionConstruction> congestionSolutionConstructionList;

    public CongestionSolutionConstructionDirectory() {
        congestionSolutionConstructionList=new ArrayList<>();
    }
    
    public ArrayList<CongestionSolutionConstruction> getCongestionSolutionConstructionList() {
        return congestionSolutionConstructionList;
    }

    public void setCongestionSolutionConstructionList(ArrayList<CongestionSolutionConstruction> congestionSolutionConstructionList) {
        this.congestionSolutionConstructionList = congestionSolutionConstructionList;
    }
    
    public CongestionSolutionConstruction addCongestionSolutionConstruction(){
        CongestionSolutionConstruction congestionSolutionConstruction=new CongestionSolutionConstruction();
        congestionSolutionConstructionList.add(congestionSolutionConstruction);
        return congestionSolutionConstruction;
    }
}
