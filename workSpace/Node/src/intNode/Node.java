package intNode;

public class Node<T> {

	private T info;
	private Node<T> next;
	
	public Node(T x)
	{
		this.info = x;
		this.next = null;
	}
	
	public Node(T x, Node<T> next)
	{
		this.info = x;
		this.next = next;
	}
	
	public Node<T> getNext()
	{
		return this.next;
	}
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public void setInfo(T x)
	{
		this.info = x;
	}
	
	public T getInfo()
	{
		return this.info;
	}
	
	public String toString()
	{
		return this.info.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
