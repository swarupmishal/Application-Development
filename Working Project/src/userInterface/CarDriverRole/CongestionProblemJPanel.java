/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CarDriverRole;

import business.CongestionProblem.CongestionProblem;
import business.CongestionProblem.CongestionProblemDirectory;
import business.Enterprise.Enterprise;
import business.Location.Location;
import business.Location.LocationDirectory;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.EventHandlerTeamOrganization;
import business.Organization.Organization;
import business.Route.Route;
import business.UserAccount.UserAccount;
import business.WorkQueue.CongestionSolutionWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Swarup
 */
public class CongestionProblemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private LocationDirectory locationDirectory;
    private CongestionProblemDirectory congestionProblemDirectory;
    private Enterprise enterprise;
    /**
     * Creates new form NewJPanel
     */
    public CongestionProblemJPanel(JPanel userProcessContainer, CongestionProblemDirectory congestionProblemDirectory, LocationDirectory locationDirectory,UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.locationDirectory=locationDirectory;
        this.congestionProblemDirectory=congestionProblemDirectory;
        this.enterprise=enterprise;
//        addCongestionProblems();
        populateComboBox();
        populateProblemTypeComboBox();
    }
    
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
    
    public void populateComboBox(){
        destinationComboBox.removeAllItems();
        for(Location location: locationDirectory.getLocationList())
        {
            destinationComboBox.addItem(location);
        }
        populateFinalCongestionProblemTable();
    }
    
    public void populateProblemTypeComboBox(){
        problemTypeComboBox.removeAllItems();
        for(CongestionProblem congestionProblem: congestionProblemDirectory.getCongestionProblemList())
        {
            problemTypeComboBox.addItem(congestionProblem);
        }
//        populateCongestionProblemTable();
    }
    
    public void populateFinalCongestionProblemTable(){
        DefaultTableModel defaultTableModel=(DefaultTableModel)congestionProblemTable.getModel();
        Location destinationLocation=(Location)destinationComboBox.getSelectedItem();
        defaultTableModel.setRowCount(0);
        if(destinationLocation!=null)
        {
            for(Route route:destinationLocation.getRouteDirectory().getRouteList()){
                Object row[]=new Object[7];
                row[0]=route;
                row[1]=route.isCongestion();
                row[2]=route.getCongestionProblem();
                row[3]=route.getRequestDate();
                row[4]=route.getResolveDate();
                row[5]=route.getSender();
                row[6]=route.getReceiver();
                defaultTableModel.addRow(row);
            }
        }
    }
    
    public int decideProblemType(String test)
    {
        if(test.equals("Traffic Jam")||test.equals("Bad Traffic Signal")||test.equals("Too much Freight")||test.equals("Bottleneck")||test.equals("Traffic due to Parking")||test.equals("One way Needed")){
            return 1;
        }
        else{
            return 0;
        }
    }

//    public void populateCongestionProblemTable(){
//        DefaultTableModel defaultTableModel=(DefaultTableModel)congestionProblemTable.getModel();
//        Location destinationLocation=(Location)destinationComboBox.getSelectedItem();
//        defaultTableModel.setRowCount(0);
//        if(destinationLocation!=null)
//        {
//            for(Route route:destinationLocation.getRouteDirectory().getRouteList()){
//                Object row[]=new Object[5];
//                row[0]=route;
//                row[1]=route.isCongestion();
////                row[2]=route.getDistance();
//                defaultTableModel.addRow(row);
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        congestionProblemTable = new javax.swing.JTable();
        btnReportProblem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        destinationComboBox = new javax.swing.JComboBox();
        problemTypeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        congestionProblemTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        congestionProblemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route Name", "Congested?", "Type of Problem", "Start date", "End date", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(congestionProblemTable);

        btnReportProblem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReportProblem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Working Project\\report-edit-icon.png")); // NOI18N
        btnReportProblem.setText("Report Problem");
        btnReportProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportProblemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Select Destination:");

        destinationComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        destinationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destinationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationComboBoxActionPerformed(evt);
            }
        });

        problemTypeComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        problemTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Problem Type:");

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Swarup\\Documents\\NetBeansProjects\\Project\\back-icon.png")); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Select Congestion Problem:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(backJButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReportProblem)
                            .addComponent(problemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportProblem)
                    .addComponent(backJButton1))
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportProblemActionPerformed
        // TODO add your handling code here:
        int selectedRow=congestionProblemTable.getSelectedRow();
        if(selectedRow>=0){
            Route route=(Route)congestionProblemTable.getValueAt(selectedRow,0);
            CongestionProblem congestionProblem=(CongestionProblem) problemTypeComboBox.getSelectedItem();
            if(route.isCongestion()==false){
            String test=congestionProblem.getProblemName();
            route.setCongestionProblem(test);
            route.incrementProbCount();
            congestionProblem.incrementProbConCount();
            route.incrementProblemOccurence();
            congestionProblem.incrementProblemOccurrence();
            int decidingFactor=decideProblemType(test);
            
            CongestionSolutionWorkRequest congestionSolutionWorkRequest=new CongestionSolutionWorkRequest();
            congestionSolutionWorkRequest.setRoute(route);
            congestionSolutionWorkRequest.setProblem(test);
            Date date= new Date();
            congestionSolutionWorkRequest.setRequestDate(date);
            congestionSolutionWorkRequest.setSender(userAccount);
            route.setRequestDate(date);
            route.setCongestion(true);
            route.setCongestionProblem(test);
            route.setSender(userAccount);
            if(decidingFactor==1){
                Organization org=null;
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof EventHandlerTeamOrganization){
                        org=organization;
                        break;
                    }
                }
                if(org!=null){
                    org.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    populateFinalCongestionProblemTable();
                    JOptionPane.showMessageDialog(null, "Congestion Problem reported successfully", "Succes", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                Organization org=null;
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof ConstructionManagerOrganization){
                        org=organization;
                        break;
                    }
                }
                if(org!=null){
                    org.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(congestionSolutionWorkRequest);
                    populateFinalCongestionProblemTable();
                    JOptionPane.showMessageDialog(null, "Congestion Problem reported successfully", "Succes", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Congestion already Present", "Can't add new Congestion", JOptionPane.ERROR_MESSAGE);
        }}
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnReportProblemActionPerformed

    private void destinationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationComboBoxActionPerformed
        // TODO add your handling code here:
        populateFinalCongestionProblemTable();
    }//GEN-LAST:event_destinationComboBoxActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnReportProblem;
    private javax.swing.JTable congestionProblemTable;
    private javax.swing.JComboBox destinationComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox problemTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
