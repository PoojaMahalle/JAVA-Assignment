package hirerchical;

public class Son extends Father {
	
	String education;

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String toString()
	{
		return name+" "+surname+" "+age+" "+education;
	}
}
