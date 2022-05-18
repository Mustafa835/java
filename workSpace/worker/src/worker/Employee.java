package worker;

public class Employee {

	private String name;
	private int number=1000;
	private int maney;
	
	public Employee(String name,int maney)
	{
		this.maney = maney;
		this.name = name;
		this.number++;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}

	public int getManey()
	{
		return maney;
	}

	public void setManey(int maney)
	{
		this.maney = maney;
	}

	public String toString()
	{
		return "number: " +this.number +"name: " + this.name +"maney: "+ this.maney;
	}
	
	
	
}
