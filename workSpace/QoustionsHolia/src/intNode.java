
public class intNode {
	
	private int info =0;
	private intNode next = null;
	
	public intNode(int x)
	{
		this.setInfo(x);
	}
	public intNode(int x, intNode next)
	{
		this.setInfo(x);
		this.setNext(next);
	}
	public void setNext(intNode next)
	{
		this.next = next;
	}
	public void setInfo(int x)
	{
		this.info = x;
	}
	public intNode getNext()
	{
		return this.next;
	}
	public int getInfo()
	{
		return this.info;
	}
	

	public static void main(String[] args) {
		
		intNode chain1 = new intNode(7,new intNode(21,new intNode(4)));
		
		 
		
		
	}

}
