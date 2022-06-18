package containment;

import java.util.Arrays;

public class Movie {
     int m_id,boxofficecol;
     String m_name;
     Actor act[];
	
     
     public int getM_id() {
		return m_id;
	}


	public void setM_id(int m_id) {
		this.m_id = m_id;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public int getBoxofficecol() {
		return boxofficecol;
	}


	public void setBoxofficecol(int boxofficecol) {
		this.boxofficecol = boxofficecol;
	}


	public Actor[] getAct() {
		return act;
	}


	public void setAct(Actor[] act) {
		this.act = act;
	}


	public String toString()
     {
    	 return m_id+" "+m_name+" "+boxofficecol+Arrays.toString(act);
     }
}
