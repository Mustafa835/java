package cats;

public class StreetCat extends cat{
	
	private int hog;

	public StreetCat(int heigh, String name, String color,int hog) {
		super(heigh, name, color);
		this.hog = hog;
	}

	public int getHog() 
	{
		return hog;
	}

	public void setHog(int hog) 
	{
		this.hog = hog;
	}
	
	public String toString()
	{
		return super.toString() + "hog:" +getHog();
	}
	
	

}
