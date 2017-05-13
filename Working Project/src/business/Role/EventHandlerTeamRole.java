/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.EventHandlerTeamOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.EventHandlerTeamRole.EventHandlerTeamWorkAreaJPanel;

/**
 *
 * @author Swarup
 */
public class EventHandlerTeamRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventHandlerTeamWorkAreaJPanel(userProcessContainer, account, (EventHandlerTeamOrganization)organization, enterprise);
    }
    
}
