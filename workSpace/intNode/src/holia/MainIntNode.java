package holia;

public class MainIntNode {

	public static void main(String[] args) {

		intNode n = new intNode(5);
		intNode n1 = new intNode(7,n);
		intNode n2 = new intNode(4,n1);
		intNode temp = new intNode(56,n.getNext());
		n.setNext(temp);
		temp.toString();
	}

}
