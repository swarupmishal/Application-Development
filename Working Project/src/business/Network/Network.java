/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author raunak
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
