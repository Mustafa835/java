
public class Queue<T>{
	
	private Node<T> first;
	private Node<T> last;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(T x){
		if(first == null){
			first = new Node<T>(x);
			last=first;
		}
		else{
			last.setNext(new Node<T>(x));
			last = last.getNext();
		}
	}
	
	public T remove(){
		Node<T> temp = first;
		first=first.getNext();
		T info = temp.getInfo();;	
		temp.setNext(null);
		return info;
	}
	
	public T head(){
		return first.getInfo();
	}
	
	public String toString(){
		Node<T> pointer = first;
		StringBuffer str = new StringBuffer("[");
		while(pointer!=null){
			str.append(pointer.getInfo()+",");
			pointer=pointer.getNext();
		}
		str.deleteCharAt(str.length()-1);
		return str+"]";
	}
	


}
