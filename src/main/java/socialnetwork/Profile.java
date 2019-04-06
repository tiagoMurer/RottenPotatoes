package socialnetwork;

import socialnetwork.Publication;
import java.util.Collection;
import java.util.Date;

package socialnetwork;

public class Profile {
    private String id;
    private String name;
    private Date birthday;
    private int age; //tirar idade de birthday
    private Timeline timeline;
    private Collection<Profile> friends {
    }

    Profile(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
        //this.age = ???hoje - birthday???
        this.timeline = new Timeline(this); //ta certo isso?
    }

    public void addFriend(){
    }

    public void removeFriend(){

    }

    public void postThings(){
    }

    public void delThings(){

    }



}
