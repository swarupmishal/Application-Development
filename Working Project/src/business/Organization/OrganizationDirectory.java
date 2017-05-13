/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.ConstructionManager.getValue())){
            organization = new ConstructionManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.EventHandlerTeam.getValue())){
            organization = new EventHandlerTeamOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.CarDriver.getValue())){
            organization = new CarDriverOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.SensorInput.getValue())){
            organization = new SensorInputOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public boolean checkIfUsernameIsUnique(OrganizationType type){
        for (Organization ua : organizationList){
            if (ua.getSupportedRole().equals(type.getValue()))
                return false;
        }
        return true;
    }
}