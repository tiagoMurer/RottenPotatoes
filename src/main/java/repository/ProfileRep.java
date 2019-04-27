package repository;

import socialnetwork.Profile;

public class ProfileRep implements Repository{



    ProfileRep(){ }

    public Profile findById(String id) {
    	for(Profile profile : ProfileRep) {
    		if(profile.getId() == id) {
    			return profile;
    		}
    	}
    }

    public boolean isInRep(String id){
        for(Profile profile: ProfileRep) {
            if(profile.getId() == id){
                return true;
            }
        }
        return false;
    }

    public void add(Profile profile){

    }

    public void remove(String id){

    }

}
