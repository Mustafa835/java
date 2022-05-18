package animal;

public class replit extends animal {
	
	private int znav;
	
	public replit(String animal_name, int old, boolean isPredetor,int klori,int znav)
	{
		super(animal_name, old, isPredetor, klori);
		this.znav = znav;
	}

	public int getZnav() 
	{
		return znav;
	}

	public void setZnav(int znav) 
	{
		this.znav = znav;
	}

	
	public String toString() {
		return "replit [ Animal_name=" + getAnimal_name() + ", Old=" + getOld()
				+ ", isPredetor=" + isPredetor() + ", Klori=" + getKlori() + "znav=" + znav +"]";
	}
	

}
