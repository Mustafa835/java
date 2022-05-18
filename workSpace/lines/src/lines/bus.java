package lines;

public class bus {
	
	private int number ;
	private String src ;
	private String dist ;
	
	public bus(int num , String src , String dist)
	{
		this.src = src ;
		this.dist = dist ; 
		this.number = num;
	}
	public void setnumber(int number)
	{
		this.number = number;
	}
	public void setSrc(String src)
	{
		this.src = src;
	}
	public void setDist(String dist)
	{
		this.dist = dist;
	}
	public int getNumber()
	{
		return this.number;
	}
	public String getSrc()
	{
		return this.src;
	}
	public String getDist()
	{
		return this.dist;
	}




}
