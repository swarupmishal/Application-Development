/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.CongestionProblem;

/**
 *
 * @author Swarup
 */
public class CongestionProblem implements Comparable<CongestionProblem>{
    private String problemName;
    private int probConCount=0;
    private static int problemOccurrence=0;
    
    public void incrementProbConCount(){
        probConCount++;
    }

    public int getProbConCount() {
        return probConCount;
    }

    public void setProbConCount(int probConCount) {
        this.probConCount = probConCount;
    }

    public CongestionProblem() {
        problemOccurrence++;
    } 

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public int getProblemOccurrence() {
        return problemOccurrence;
    }

    public void incrementProblemOccurrence() {
        problemOccurrence++;
    }

    @Override
    public String toString() {
        return problemName;
    }

    @Override
    public int compareTo(CongestionProblem t) {
        int qty=((CongestionProblem)t).getProbConCount();
        return qty-this.getProbConCount();
    }
    
    

}
