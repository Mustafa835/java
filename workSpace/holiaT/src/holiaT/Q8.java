package holiaT;

import unit4.collectionsLib.Node;

public class Q8 {

	public static  Node<Character> addToChain(Node<Character> chain, String s)
	{
        int i=0;
        if(s==null || s.length()==0|| s.isBlank()) 
        {
            return chain;
        }
        if(chain==null) 
        {
            chain = new Node<Character>(s.charAt(i++));
        }
        Node<Character> tmp = chain;
        while(tmp.getNext()!=null) 
        {
            tmp=tmp.getNext();
        }
        for(; i<s.length(); i++) 
        {
            tmp.setNext(new Node<Character>(s.charAt(i)));
            tmp = tmp.getNext();
        }
        return chain;
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
    
    public static void compressSequences(Node<Character> chain) 
    {
        if(chain ==null) {
            return;
        }
        while(chain!=null && chain.getNext()!=null) 
        {
            Node<Character> tmp = chain;
            while(tmp.getNext() != null&& tmp.getNext().getInfo().equals(tmp.getInfo())) 
            {
                tmp=tmp.getNext();
            }
            if(chain.getNext()!=tmp)
            {
                chain.setNext(tmp.getNext());
                tmp.setNext(null);
                chain = chain.getNext();
            }
            
        }
        
    }
    
    
    

	public static void insetIntoSortChain(Node<Integer> chain, int x ) 
	{
		
		Node<Integer> pos = chain;
		while(pos.getNext() != null)
		{
			if(pos.getInfo() > x)
			{
				pos = new Node<Integer>(x , chain);
			}
			
			else if(pos.getNext().getInfo() > x)
			{
				pos.setNext(new Node<Integer>(4,pos.getNext()));
			}
			pos=pos.getNext();
		}
		
	}
	
	
    public static void main(String[] args) {
        
     Node<Integer> n = new Node<Integer>(7, new Node<Integer>(5,new Node<Integer>(4)));
     //Node<Character> head=addToChain(null, "HHHHHEEEEELLLLLO");
     //printNode(head);
     //compressSequences(head);
     //printNode(head);
     // printNode(insetIntoSortChain(n, 2));
    }

}
