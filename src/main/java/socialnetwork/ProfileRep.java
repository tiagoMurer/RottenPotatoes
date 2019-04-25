package socialnetwork;

import com.sun.tools.javac.jvm.Profile;

import java.util.Collection;

public class ProfileRep implements Repository{
    
    public findById(String id) {
    	for(Profile profile:ProfileRepository) {
    		if(profile.id == id) {
    			return profile;
    		}
    	}
    	
    	System.out.println("Usuário não encontrado");
    	return false;
    }

}
