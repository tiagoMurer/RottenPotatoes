package socialnetwork;

import java.util.LinkedList;

public class Timeline {

    private Profile owner; // de quem a timeline é

    public LinkedList<Publication> publication_queue = new LinkedList<Publication>();//fila de publicações

    Timeline(Profile owner){
        this.owner = owner;
    }

    public void post(){ //publicar
    }

    public void deletePost(){ //deletar publicação

    }
}
