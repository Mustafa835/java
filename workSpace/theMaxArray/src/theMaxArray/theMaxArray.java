package theMaxArray;



public class theMaxArray {
	
	public static int findTheMaxDigit(int[] arr, int max)
	{
		if( max == arr.length-1)
		{
			return arr[max];
		}
		else 
		{
			int temp = findTheMaxDigit(arr, max+1);
			if (arr[max] > temp)
			{
				return arr[max];
			}
			return temp;
			
		}
	}
	
	
	
	public static int mysterySum(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		int sum = n;
		for (int i=1; i<n; i++)
		{
			sum = sum + mysterySum(i);
		}
		return sum;
	}
	
	
	public static int mystery(int n)
	{
		if (n < 10)
		{
			return n;
		}
		else 
		{
			int x = n % 10;
			int y = mystery(n/10);
			if (x > y)
				return x;
			else 
				return y;
		}
	}
	
	public static int tarbea(int num)
	{
		if (num == 1)
			return (1);
		else 
			return (tarbea(num - 1) + 2 * num -1);
	}
	
	
	public static int mystrey1(int num)
	{
		if(num < 10)
			return (num);
		else
		{
			int i =10;
			while (num%i != num)
				i*=10;
			return ((num %10) *i/10)+mystrey1(num/10);
		}
	}
		
	
	
	
	
	public static void main(String[] args) {
	
		//System.out.println(mysterySum(3));
		//System.out.println(mystery(24912));
		//System.out.println(mystrey1(122));
		int a = 13;
		System.out.println(a/2);
		

	}

}
