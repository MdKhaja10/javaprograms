package practiceCollects;

public class Person {
	 private String name;
	    private String language;

	    public Person(String name, String language) {
	        this.name = name;
	        this.language = language;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', language='" + language + "'}";
	    }

}
