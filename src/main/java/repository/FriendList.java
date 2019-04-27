package repository;

import socialnetwork.Profile

public class FriendList implements Repository{

    Profile owner;

    FriendList(Profile owner){
        this.owner = owner;
    }
}

    public void add(Profile profile){

    }
    public void remove(Profile profile){

    }

    public boolean isInRep(String id){
        for(Profile profile: ProfileRep) {
            if(profile.getId() == id){
                return true;
            }
        }
        return false;
}
