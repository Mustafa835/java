import java.util.Random;

public class RandomCircles {
	
	Circle[] circleArr;
	Random rand = new Random();
	
	
	public RandomCircles(int maxSize , int maxRadius)
	{
		int size = (int) (Math.random()*maxSize)+1;
		circleArr = new Circle[size];
		
		for (int i = 0; i < circleArr.length; i++)
		{
			
			
			int radius = (int)(Math.random()*maxRadius)+1;
			circleArr[i] = new Circle(radius,new Point(0,0));
		}
	}
	
	public double getTotalArea()
	{
		double totalArea= 0.0;
		
		for (int i = 0; i < circleArr.length; i++) 
		{		
				totalArea +=c.geterea();
		}
			return totalArea;
			
		}
	}

}
