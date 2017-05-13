/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import business.Role.SensorInputRole;
import java.util.ArrayList;

/**
 *
 * @author Swarup
 */
public class SensorInputOrganization extends Organization{

    public SensorInputOrganization() {
        super(Organization.OrganizationType.SensorInput.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new SensorInputRole());
        return roles;
    }
    
}
