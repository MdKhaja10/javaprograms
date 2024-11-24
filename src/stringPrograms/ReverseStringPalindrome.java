package stringPrograms;

public class ReverseStringPalindrome {

	public static void main(String[] args) {
		String name="khaja";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(rev)) {
			System.out.println("the string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}

	}

}
