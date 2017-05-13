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
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.CarDriverRole.CarDriverWorkAreaJPanel;

/**
 *
 * @author Swarup
 */
public class CarDriverRole extends Role{

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CarDriverWorkAreaJPanel(userProcessContainer, account, (CarDriverOrganization)organization, enterprise);
    }
    
}