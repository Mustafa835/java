package cats;

public class SiamiCat extends cat{
	private String eating;
	
	public SiamiCat(int heigh,String color,String name,String eating)
	{
		super(heigh,name,color);
		this.eating = eating;
	}

	public String getEating() 
	{
		return eating;
	}

	public void setEating(String eating) 
	{
		this.eating = eating;
	}
	
	public String toString()
	{
		return super.toString() + "eating: " +getEating();
	}

}
