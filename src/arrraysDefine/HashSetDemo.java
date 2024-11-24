package arrraysDefine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set2=new HashSet();//first method of declaration
		Set set1=new HashSet();//second method of declaration
		HashSet<Object>myset=new HashSet<Object>();//third method of declaration for all data types
		myset.add("Welcome");
		myset.add(124);
		myset.add(12.4);
		myset.add(true);
		myset.add(false);
		myset.add('A');
		myset.add(123456543.55f);
		myset.add(null);//only one null is allowed
		myset.add(null);
		myset.add("Welcome");//duplicate elements are not allowed
		System.out.println(myset);//does not allow indexing while printing
		//removing element from the hashset
		myset.remove(true);
		System.out.println(myset);
		System.out.println(myset.size());
		//retrieving the elements is not possible, it is only possible when we convert hashset into arraylist
		ArrayList<Object>mylist=new ArrayList<Object>(myset);
		System.out.println(mylist.get(6));
		//retrieving the elements in hashset using enhance for loop
		System.out.println("using enhance for loop");
		for(Object x: myset) {
			System.out.println(x);
		}
		System.out.println("using iterator ");
		/*
		 * Iterator<Object> it=myset.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		System.out.println(myset.isEmpty());
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
		

	}

}
