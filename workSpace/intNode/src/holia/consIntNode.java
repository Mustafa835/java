package holia;

import unit4.collectionsLib.Node;

public class consIntNode {

	public static int getMax(intNode head)
	{
		int max = 0;
		intNode pos = head;
		while(pos != null)
		{
			if(pos.getInfo() > max)
			{
				max = pos.getInfo();
			}
			pos = pos.getNext();
		}
		return max;
	}
	
	
	public static int getMin(intNode head)
	{
		intNode current = head;
		int min = head.getInfo();
		while(current != null)
		{
			if(current.getInfo() < min)
			{
				min = current.getInfo();
			}
			current = current.getNext();
		}
		return min;
	}
	
	
	public int getSum(intNode head)
	{
		int sum = 0;
		while (head != null)
		{
			sum += head.getInfo();
			head = head.getNext();
		}
		
		return sum;
	}
	
	
	public static void insetIntoSortChain(intNode chain, int x ) 
	{
		
		intNode pos = chain;
		while(pos.getNext() != null)
		{
			if(pos.getInfo() > x)
			{
				pos = new intNode(x , chain);
			}
			
			else if(pos.getNext().getInfo() > x)
			{
				pos.setNext(new intNode(4,pos.getNext()));
			}
			pos=pos.getNext();
		}
		
	}
	
	public static <T> void printNode(Node<T> chain) 
    {
        if(chain==null) 
        {
            return;
        }
        while(chain!=null) 
        {
            System.out.print(chain.getInfo()+"->");
            chain=chain.getNext();
        }
        System.out.println("Null");
        
    }
	
	
	public static void main(String[] args) {
		
		intNode n = new intNode(7,new intNode(5,new intNode(4,new intNode(3))));
		System.out.println("the max Index is : " + getMax(n));
		System.out.println("the min Index is : " +getMin(n));
		
	//printNode(insetIntoSortChain(n, 2));
	}

}
