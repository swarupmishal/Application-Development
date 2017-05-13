/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ConstructionManagerRole.ConstructionManagerWorkAreaJPanel;

/**
 *
 * @author Swarup
 */
public class ConstructionManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ConstructionManagerWorkAreaJPanel(userProcessContainer, account, (ConstructionManagerOrganization)organization, enterprise);
    }
    
}