package stringPrograms;

public class NameReverse {

	public static void main(String[] args) {
		String name="Khaja";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
		
		}
		System.out.println(rev);
		System.out.println("new programm is added to the string name");

	}

}
