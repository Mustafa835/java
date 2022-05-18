package holia;

public class intNode {
	
	private int info;
	private intNode next;
	
	public intNode (int x)
	{
		this.info= x;
		this.next= null;
	}

	public intNode(int x, intNode next)
	{
		this.info =x;
		this.next= next;
	}
	
	public intNode getNext()
	{
		return (this.next);
	}
	
	public void setNext(intNode next)
	{
		this.next= next;
	}
	
	public int getInfo()
	{
		return(this.info);
	}
	
	public void setInfo(int x)
	{
		this.info = x;
	}
	
	public String string()
	{
		return ""+this.info;
	}
	
}
