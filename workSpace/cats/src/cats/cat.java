package cats;

public class cat {
	private String name;
	private int heigh ;
	private String color ;
	
	public cat(int heigh,String name,String color)
	{
		this.color = color;
		this.heigh =heigh;
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setHeigh(int heigh)
	{
		this.heigh = heigh;
	}
	
	public int getHeigh()
	{
		return this.heigh;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return "name:" +getName() +"color: " +getColor()+ "heigh: " +getHeigh() ;
	}
	
	
	
	
	
	
	
	
	
	
	
}


