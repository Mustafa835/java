package examp1;

class A {
	public int w;
	private static String str="K";
	
	public A() {		
		str+="B";
		w+=str.length();
		str+=w;
	}
	
	public String toString() {
		return str.charAt(w-2) + "P";
	}
}

class B extends A{
	public static int w=2;
	private  String str="W";
	
	public B(int x) {
	     w+= super.w;
		 str+=super.toString() + w;
	}
	public String toString() {
		return super.toString() + str;
	}
}


public class Q1 {

	public static void main(String[] args) {
		A a = new A();
		A a2=  new B(1);
		System.out.println(a);
		System.out.println(a.w);
		System.out.println(a2);
		System.out.println(a2.w);
		B b = new B(2);
		System.out.println(b);
	
	}
}
 
