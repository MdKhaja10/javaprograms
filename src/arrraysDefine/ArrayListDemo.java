package arrraysDefine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list2=new ArrayList();// one method of declaration
		List list1= new ArrayList();//second method of declaration
		ArrayList <Object> mylist=new ArrayList<Object>();//Third Method of declaration used for any kind of datatypes
		mylist.add("Welcome");
		mylist.add(124);
		mylist.add(12.4);
		mylist.add(true);
		mylist.add(false);
		mylist.add('A');
		mylist.add(123456543.55f);
		mylist.add(null);
		mylist.add(null);
		mylist.add("Welcome");
		System.out.println(mylist);
		//remove elements from array
		mylist.remove(4);
		mylist.remove(null);
		System.out.println(mylist);
		//insert element
		mylist.add(5,false);
		System.out.println(mylist);
		//set method is used to update the value
		mylist.set(5, true);
		System.out.println(mylist);
		//fetching single element from the arraylist
		System.out.println(mylist.get(5));
		//getting the size of the elements in arraylist
		System.out.println(mylist.size());
		//fetching the arraylist elements using for loop
		for(int i=0;i<mylist.size();i++) {
			System.out.println("using for loop "+ mylist.get(i));
		}
		for(Object x:mylist) {
			System.out.println("using enhanced for loop"+ x);
		}
		
		//remove multiple elements from arraylist
		ArrayList<Object> mylist1=new ArrayList<Object>();
		mylist1.add("Welcome");
		mylist1.add(true);
		mylist1.add(null);
		mylist.removeAll(mylist1);
		System.out.println(mylist);
		System.out.println(mylist.isEmpty());
		mylist.clear();
		System.out.println(mylist.isEmpty());
			
		
	}

}