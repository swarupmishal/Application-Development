/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.CarDriverOrganization;
import business.Organization.Organization;
import business.Organization.SensorInputOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.SensorInputRole.SensorInputWorkAreaJPanel;

/**
 *
 * @author Swarup
 */
public class SensorInputRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SensorInputWorkAreaJPanel(userProcessContainer, account, (SensorInputOrganization)organization, enterprise); //To change body of generated methods, choose Tools | Templates.

    }
    
}
