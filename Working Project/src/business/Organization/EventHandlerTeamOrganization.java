/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.EventHandlerTeamRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class EventHandlerTeamOrganization extends Organization {
    public EventHandlerTeamOrganization()
    {
        super(Organization.OrganizationType.EventHandlerTeam.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new EventHandlerTeamRole());
        return roles;
    }
}
