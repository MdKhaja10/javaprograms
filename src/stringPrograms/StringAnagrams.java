package stringPrograms;

import java.util.Arrays;

public class StringAnagrams {
	public static void isAnagram(String s1, String s2) {
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
			char[] arrs1=str1.toLowerCase().toCharArray();
			char[] arrs2=str2.toLowerCase().toCharArray();
			Arrays.sort(arrs1);
			Arrays.sort(arrs2);
			status=Arrays.equals(arrs1, arrs2);
			
		}
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
		
	}
	public static void main(String[] args) {
		isAnagram("Heart", "Earth");
	}

}
