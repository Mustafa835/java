package holiaT;

import unit4.collectionsLib.Queue;

public class Q9 {
	
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Queue<Integer> q = new Queue<Integer>();
	        q.insert(1);
	        q.insert(2);
	        q.insert(3);
	        q.insert(4);
	        q.insert(5);
	        System.out.println(size(q));
	        System.out.println(q);
	    }
	    
	    public static <T> int size(Queue<T> q) {
	        if(q.isEmpty() || q==null) {
	            return 0;
	        }
	        Queue<T> temp = new Queue<T>();
	        int count = 0;
	        while(!q.isEmpty()) {
	            temp.insert(q.remove());
	            count++;
	        }
	        while(!temp.isEmpty()) { //  return the data to original queue 
	            q.insert(temp.remove());
	            
	        }
	        temp=null;
	        return count;
	    }
	    
	    
	}

