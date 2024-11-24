package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Class1 {
	/*
	 * static int a =10; // int b=20; public static void main(String[] args) {
	 * //static int a=20; int b=a+10;
	 * 
	 * 
	 * 
	 * Class1 a1= new Class1(); Class1 a2=new Class1();
	 * 
	 * System.out.println("Value of  static variable a from a1 object: "+a1.a++);
	 * System.out.println("Value of  static variable a from a1 object: "+a1.b++);
	 * 
	 * System.out.println("Value of  static variable a from a1 object: "+a2.a++);
	 * System.out.println("Value of  static variable a from a1 object: "+a2.b++);
	 * 
	 * System.out.println(b); }
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.removeAll(new ArrayList<>(Arrays.asList(1,3,4,5)));
		System.out.println(a);
	}
}
