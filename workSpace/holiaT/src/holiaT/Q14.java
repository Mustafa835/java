package holiaT;

import unit4.collectionsLib.Node;

public class Q14 {
	
	public static void main(String[] args)
	{
        Node<Character> head = new Node<Character>('&',new Node<Character>('@',new Node<Character>('#',new Node<Character>('$',new Node<Character>('%')))));
        System.out.println(head);
        System.out.println("removed:"+removeItemAt(1,head));
        
    }
    public static<T> T getItemAt(int k, Node<T> head)
    {    
        if(k<1 || head==null) {
            return null;
        }
        
        if(k==1) {
            return head.getInfo();
        }
        return getItemAt(--k, head.getNext());
    }
    
public static<T> T removeItemAt(int k, Node<T> head)
	{
        
        if(k<1 || head==null) {
            return null;
        }
        
        if(k==1) {
             T info = head.getInfo();
             if(!head.hasNext()) {
                 head.setInfo(null);
             }
             else {
                 head = head.getNext();
             }
             System.out.println(head);
             return info;
        }
        return getItemAt(--k, head.getNext());
    }
}


