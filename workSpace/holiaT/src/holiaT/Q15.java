package holiaT;

import unit4.collectionsLib.Node;

public class Q15 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node<Character> head = new Node<Character>('&',new Node<Character>('@',new Node<Character>('#',new Node<Character>('$',new Node<Character>('%')))));
        printNode(head);
        printNode(reverse(head));
    }
    
    public static<T> Node<T> reverse(Node<T> head) {
        Node<T> temp = new Node<T>(head.getInfo());
        head = head.getNext();
          
        while(head.hasNext()) {
            Node<T> rest = new Node<T>(head.getInfo(),temp);
            temp=rest;
            head=head.getNext();
        }
        if(head!=null) {
            head.setNext(temp);
        }
         return head;
    }
    
    public static <T> void printNode(Node<T> chain) {
        if(chain==null) {
            return;
        }
        while(chain!=null) {
            System.out.print(chain.getInfo()+"->");
            chain=chain.getNext();
        }
        System.out.println("Null");
        
    }
}


