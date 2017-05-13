/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionProblem;

import EDU.purdue.cs.bloat.file.Code;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class CongestionProblemDirectory {
    private ArrayList<CongestionProblem> congestionProblemList;
    
    public CongestionProblemDirectory()
    {
        congestionProblemList=new ArrayList<>();
    }

    public ArrayList<CongestionProblem> getCongestionProblemList() {
        return congestionProblemList;
    }

    public void setCongestionProblemList(ArrayList<CongestionProblem> congestionProblemList) {
        this.congestionProblemList = congestionProblemList;
    }
    
    public CongestionProblem addCongestionProblem()
    {
        CongestionProblem congestionProblem=new CongestionProblem();
        congestionProblemList.add(congestionProblem);
        return congestionProblem;
    }
    
//    public void setCongestionProblemList(){
//        CongestionProblem cp1=new CongestionProblem();
//        congestionProblemList.add(cp1);
//        cp1.setProblemName("Traffic Jam");
//        CongestionProblem cp2=new CongestionProblem();
//        cp2.setProblemName("Bad Traffic Signal");
//        congestionProblemList.add(cp2);
//        CongestionProblem cp3=new CongestionProblem();
//        cp3.setProblemName("Work Zone");
//        congestionProblemList.add(cp3);
//        CongestionProblem cp4=new CongestionProblem();
//        cp4.setProblemName("Natural Calamity");
//        congestionProblemList.add(cp4);
//        CongestionProblem cp5=new CongestionProblem();
//        cp5.setProblemName("Too much Freight");
//        congestionProblemList.add(cp5);
//        CongestionProblem cp6=new CongestionProblem();
//        cp6.setProblemName("Traffic at Intersections");
//        congestionProblemList.add(cp6);
//        CongestionProblem cp7=new CongestionProblem();
//        cp7.setProblemName("Bottleneck");
//        congestionProblemList.add(cp7);
//        CongestionProblem cp8=new CongestionProblem();
//        cp8.setProblemName("Traffic due to Parking");
//        congestionProblemList.add(cp8);
//        CongestionProblem cp9=new CongestionProblem();
//        cp9.setProblemName("Road Damaged");
//        congestionProblemList.add(cp9);
//        CongestionProblem cp10=new CongestionProblem();
//        cp10.setProblemName("One way Needed");
//        congestionProblemList.add(cp10);
//        
//    }
//    public void addCongestionProblems()
//    {
//        CongestionProblem cp1=congestionProblemDirectory.addCongestionProblem();
//        cp1.setProblemName("Traffic Jam");
//        CongestionProblem cp2=congestionProblemDirectory.addCongestionProblem();
//        cp2.setProblemName("Bad Traffic Signal");
//        CongestionProblem cp3=congestionProblemDirectory.addCongestionProblem();
//        cp3.setProblemName("Work Zone");
//        CongestionProblem cp4=congestionProblemDirectory.addCongestionProblem();
//        cp4.setProblemName("Natural Calamity");
//        CongestionProblem cp5=congestionProblemDirectory.addCongestionProblem();
//        cp5.setProblemName("Too much Freight");
//        CongestionProblem cp6=congestionProblemDirectory.addCongestionProblem();
//        cp6.setProblemName("Traffic at Intersections");
//        CongestionProblem cp7=congestionProblemDirectory.addCongestionProblem();
//        cp7.setProblemName("Bottleneck");
//        CongestionProblem cp8=congestionProblemDirectory.addCongestionProblem();
//        cp8.setProblemName("Traffic due to Parking");
//        CongestionProblem cp9=congestionProblemDirectory.addCongestionProblem();
//        cp9.setProblemName("Road Damaged");
//        CongestionProblem cp10=congestionProblemDirectory.addCongestionProblem();
//        cp10.setProblemName("One way Needed");
//        
//        
//    }
    
}
