package repository;

import socialnetwork.Profile;

public class ProfileRep implements Repository{
    
    public findById(String id) {
    	for(Profile profile : ProfileRepository) {
    		if(profile.id == id) {
    			return profile;
    		}
    	}
    	
    	System.out.println("Usu�rio n�o encontrado");
    	return false;
    }

}
