package comparable;

import java.util.ArrayList;

public class Theater {
    int id;
    String name;
    ArrayList<Movie> movie;
    
    Theater(int id,String name,ArrayList<Movie> movie)
    {
    	this.id=id;
    	this.name=name;
    	this.movie=movie;
    }
    
    public String toString()
    {
    	return id+" "+name+" "+movie;
    }
}
