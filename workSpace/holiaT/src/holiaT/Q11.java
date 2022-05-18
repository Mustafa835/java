package holiaT;
import unit4.collectionsLib.Node;

public class Q11 {
	
	
	public static <T> Node<Integer> margChain(Node<Integer> chain1 , Node<Integer>chain2)
	{
		Node<Integer> marged;
		if(chain1 == null)
		{
			return chain2;
		}
		if(chain2 == null)
		{
			return chain1;
		}
		if(chain1.getInfo()<chain2.getInfo())
		{
			marged = chain1;
			chain1 = chain1.getNext();
		}
		else
		{
			marged = chain2;
			chain2 = chain2.getNext();
		}
		Node<Integer> tmp = marged;
		while(chain1 != null && chain2 != null)
		{
			if(chain1.getInfo()<chain2.getInfo())
			{
				tmp.setNext(chain1);
				chain1=chain1.getNext();
			}
			else
			{
				tmp.setNext(chain2);
				chain2=chain2.getNext();
			}
			tmp = tmp.getNext();
		}
		if(chain1 == null)
		{
			tmp.setNext(chain2);
		}
		else
		{
			tmp.setNext(chain1);
		}
		
		return marged;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
