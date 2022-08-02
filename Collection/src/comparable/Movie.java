package comparable;

public class Movie implements Comparable<Movie>{

	 int m_id,boxofficecol,rating;
     String m_name;
     
     Movie(int m_id,String m_name,int boxofficecol,int rating)
     {
    	 this.m_id=m_id;
    	 this.m_name=m_name;
    	 this.boxofficecol=boxofficecol;
    	 this.rating=rating;
     }
     
     public String toString()
     {
    	 return m_id+" "+m_name+" "+boxofficecol+" "+rating;
     }
     
     public int compareTo(Movie m)
     {
    	 if(this.rating>m.rating)
    		 return 1;
    	 else if(this.rating<m.rating)
    		 return -1;
    	 else
    		 if(this.m_id>m.m_id)
    			 return 1;
    		 else if(this.m_id<m.m_id)
    			 return -1;
    	      return 0;
     }
}
