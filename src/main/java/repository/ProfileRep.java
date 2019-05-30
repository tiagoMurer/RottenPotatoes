package repository;

import java.util.HashSet;

import socialnetwork.Profile;

public class ProfileRep implements Repository{

	private HashSet<Profile> profiles = new HashSet<>();

    ProfileRep(){ }

    public Profile findById(String id) {
    	for(Profile profile : profiles) {
    		if(profile.getId() == id) {
    			return profile;
    		}
    	}
    	return null;
    }

    public boolean isInRep(String id){
        for(Profile profile : profiles) {
            if(profile.getId() == id){
                return true;
            }
        }
        return false;
    }

	public void add(Object item) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Object item) {
		// TODO Auto-generated method stub
		
	}

}
