package Polymorphism;

public class Calculations {
   public void add(int a, int b) {
	   int c=a+b;
	   System.out.println(c);
   }
   public void add(int a, int b, int c) {
	   int f=a+b+c;
	   System.out.println(f);
	   
   }
   public static void main(String[] args) {
	Calculations c=new Calculations();
	c.add(10,70);
	c.add(80, 89,87);
}
}
