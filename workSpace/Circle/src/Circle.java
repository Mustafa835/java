
import java.awt.Point;

public class Circle {
	
	private int rad;
	private Point point;
	
	public Circle(int rad,Point point)
	{
		this.rad = rad;
		this.point = new Point(point);
	}
	
	public Circle(Circle other) throws Exception
	{
		if(other == null)
		{
			throw new Exception("null Circle");
		}
		else 
		{
			this.rad = other.rad;
			this.point = new Point(other.point);
		}
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + this.rad;
		result += result * prime +this.point.hashCode();
		
		return result;
	}


	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (!(other instanceof Circle))
		{
			return false;
		}
		Circle c = (Circle) other;
		return this.rad == c.rad && this.point.equals(c.point);
	}
	
	
	public double getRad() 
	{
		return rad;
	}

	
	public Point getCenter() 
	{
		return point;
	}
	
	
	public double perimeter()
	{
		return Math.PI*2*rad;
	}
	
	
	public double erea()
	{
		return Math.PI*Math.pow(rad,2);
	}
	
	

}