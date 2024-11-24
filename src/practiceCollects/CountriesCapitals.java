package practiceCollects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountriesCapitals {
	public static void main(String[] args) {
		HashMap<String, String>hm=new HashMap();
			hm.put("india", "Delhi");
			hm.put("Telangana", "Hyderabad");
			hm.put("Kerala", "Kochi");
			hm.put("Karnataka", "Bangaluru");
			hm.put("TamilNadu","chennai");
			hm.put("AndharPradesh", "Hyderabad");
			System.out.println(hm);
			removeDup(hm);
			System.out.println(hm);
		
	}

	public static void removeDup(HashMap<String,String>hm) {
		HashSet<String>states=new HashSet();
		ArrayList<String>remove=new ArrayList();
		for(Map.Entry<String, String>entry:hm.entrySet()) {
			String state=entry.getValue();
			if(states.contains(state)) {
				remove.add(entry.getKey());
			}else {
				states.add(state);
			}
			
		}
		for(String key:remove) {
			hm.remove(key);
		}
	}
}
