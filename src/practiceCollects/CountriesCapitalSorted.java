package practiceCollects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class CountriesCapitalSorted {
	
	
	    public static void main(String[] args) {
	        HashMap<String, String> countriesAndCapitals = new HashMap<>();
	        countriesAndCapitals.put("USA", "Washington");
	        countriesAndCapitals.put("France", "Paris");
	        countriesAndCapitals.put("Germany", "Berlin");
	        countriesAndCapitals.put("Spain", "Madrid");
	        countriesAndCapitals.put("Japan", "Tokyo");
	        countriesAndCapitals.put("AnotherCountry", "Paris"); // Duplicate capital

	        System.out.println("Original HashMap: " + countriesAndCapitals);

	        TreeMap<String, String> uniqueCountriesAndSorted = removeDuplicatesAndSortByCountry(countriesAndCapitals);

	        System.out.println("Sorted and unique countries with their capitals: " + uniqueCountriesAndSorted);
	        System.out.println("Total unique countries: " + uniqueCountriesAndSorted.size());
	    }

	    public static TreeMap<String, String> removeDuplicatesAndSortByCountry(HashMap<String, String> countriesAndCapitals) {
	        HashSet<String> seenCapitals = new HashSet<>();
	        TreeMap<String, String> uniqueCountriesAndSorted = new TreeMap<>();

	        for (Map.Entry<String, String> entry : countriesAndCapitals.entrySet()) {
	            String country = entry.getKey();
	            String capital = entry.getValue();

	            if (!seenCapitals.contains(capital)) {
	                seenCapitals.add(capital);
	                uniqueCountriesAndSorted.put(country, capital);
	            }
	        }

	        return uniqueCountriesAndSorted;
	    
	}


}
