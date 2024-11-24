package practiceCollects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {
	
	 public static void main(String[] args) {
		  HashMap<String, String>hm=new HashMap();
		     hm.put("khaja","english");
			 hm.put("smith","telugu");
			 hm.put("scot", "french");
			 hm.put("david", "spanish");
			 hm.put("albert", "japanese");
			 hm.put("robot", "telugu");
			 System.out.println(hm);
			 removeDup(hm);
			 System.out.println(hm);
			 
	   
	 }
	 public static void removeDup(HashMap<String, String>hm) {
		 HashSet<String> languages=new HashSet();
		 ArrayList<String> removes=new ArrayList();
		 for(Map.Entry<String, String>entry:hm.entrySet()) {
			 String language=entry.getValue();
			 if(languages.contains(language)) {
				 removes.add(entry.getKey());
			 }
			 else {
				 languages.add(language);
			 }
		 }
		 for(String key:removes) {
			 hm.remove(key);
	 }
	 
		 
	 }

}
