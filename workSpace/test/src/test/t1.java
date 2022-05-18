package test;

import java.util.Random;

//
//interface Stam {
//public void addStam(String s);
//}
//class A {
//public static int num=2;
//private String str="K";
//
//public A() {
//num+= str.length();
//str+="U";
//System.out.println(this);
//}
//public void addStam(int x) {
// num += x;
//}
//public void subStam(int x) {
//num -= x;
//System.out.println(num);
//}
//public String toString() {
//return str + num;
//}
//}
//class B extends A implements Stam {
//public int num=1;
//private String str="RI";
//public B(int x) {
//num += super.num + x;
//str += super.toString();
//System.out.println(str + num);
//}
//public boolean equals(A a)
//{
//return a instanceof B && a.num == this.num;
//}
//public void addStam(String s) {
// str+=s;
//}
//}
//public class t1 {
//public static void main(String[] args) {
//A a1 = new A();
// B a2 = new B(3);
//B a3 = new B(7);
//System.out.println(a3);
////a2.subStam(a1.num);
////System.out.println(a2);
//a3.addStam("KU");
//System.out.println(a3.equals(a3));
//a1.subStam(2);
//}
//}



//public class t1 {
//public static void main(String[] args) {
//String str1 = "ABC DEF GHI JKL";
//String str2 = "BIBI";
//int i = str1.indexOf(' ');
//int j = str1.lastIndexOf(' ');
//System.out.println("i=" + i + ",j=" + j);
//System.out.println("|" + str1.substring(i + 1, j) + "|");
////System.out.println("|" + str1.split(" ")[3] + "|");
//str1 = str2.replace('B', str1.charAt(str1.length() - 2));
//System.out.println(str1);
////System.out.println(str1.replace('I', 'A'));
//}
//}





class Course {
	 private Str name;
	public Course (Str name)
	{
	this.name=name;
	}
	Str getName() { return name;}
	 }
	class Test {
	private int grade;
	private Str courseName;
	 public Test (Course c)
	 {
		 this.courseName = c.getName();
		 this.grade = (int) (( Math.random()*70)+30);
	 }
	 public Str getName()
	 {
		 return courseName;
	 }

	}
class Student{
	private Test[] tests;
	public Str studenName;
	public Student (Course [] courses ,Str studentName) throws Exception
	{
		this.studenName = studentName;
			   this.tests = new Test[courses.length];   
		   for (int i = 0; i < courses.length; i++)
		   {
			   tests[i] = new Test(courses[i]); 
		   }   
		}
}





