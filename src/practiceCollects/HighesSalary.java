package practiceCollects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HighesSalary {

	public static void main(String[] args) {
		HashMap<String, Integer>hm=new HashMap();
		hm.put("india", 9000);
		hm.put("Telangana", 4000);
		hm.put("Kerala",3000 );
		hm.put("Karnataka", 8000);
		hm.put("TamilNadu",9500);
		hm.put("AndharPradesh", 3000);
		System.out.println(hm);
		highestSalarymap(hm);
		
	}
	public static void highestSalarymap(HashMap<String,Integer>hm) {
		int highestsalary=0;
		HashSet<Integer> contries=new HashSet();
		ArrayList<String>removecontryies=new ArrayList();
		for(Map.Entry<String, Integer>entry:hm.entrySet()) {
			int salary=entry.getValue();
			if(salary>highestsalary) {
				highestsalary=salary;
			}
			contries.add(salary);
		}
		for(Map.Entry<String, Integer>entry:hm.entrySet()) {
			if(entry.getValue()==highestsalary) {
				removecontryies.add(entry.getKey());
			}
		}
		
		System.out.println(highestsalary+" "+removecontryies);
		
	}
}
