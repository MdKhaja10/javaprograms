package arrraysDefine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map1=new HashMap();//first method of declaration
		Map map2=new HashMap();//second Method of declaration
		HashMap<Integer, String>hm=new HashMap<Integer,String>();//third method of declaration for all data types
		hm.put(101, "john");
		hm.put(102, "sena");
		hm.put(103, "william");
		hm.put(104, "samson");
		hm.put(105, "dhoni");
		hm.put(101, "william");
		hm.put(106, null);
		hm.put(107, null);
		System.out.println(hm);
		//getting the hashmap size
		System.out.println(hm.size());//hashset size
		hm.remove(106);
		hm.remove(107, null);
		System.out.println(hm);
		System.out.println(hm.get(105));//retrieving the particular value using key
		System.out.println(hm.keySet());//retrieving all the keys
		System.out.println(hm.values());//retrieving all the values
		System.out.println(hm.entrySet());//retrieving all the key and value pairs
		System.out.println("**************** "+" using enhance for loop");
		for(Object k: hm.keySet()) { //using enhance for loop for retreiving the elements normal for loop is not possible because it should not follow insertion index order
			System.out.println(k+" "+hm.get(k));
			
		}
		System.out.println("**************** "+" using iterator");
		//using iterator for retrieving elements
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}

}
