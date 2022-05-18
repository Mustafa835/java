
public class Point {
	
	private int x;
	private int y;
	public Point (int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Point(Point Other)
	{
		this(Other.x,Other.y);
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	

}
