package business;

import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
import business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        for(Network network:networkList){
            if(network.getName().equals(username))
                return false;
        }
        return true;
//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }
//
//        for (Network network : networkList) {
//        }
//
//        return true;
    }
}