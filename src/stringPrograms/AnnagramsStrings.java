package stringPrograms;

import java.util.Arrays;

public class AnnagramsStrings {

	public static void main(String[] args) {
//		String str="listen";
//		String str1="silent";
//		str=str.toLowerCase();
//		str1=str1.toLowerCase();
//		if(str.length()==str1.length()) {
//		char strchar[]=str.toCharArray();
//		char str1char[]=str1.toCharArray();
//		Arrays.sort(strchar);
//		Arrays.sort(str1char);
//		boolean result=Arrays.equals(strchar, str1char);
//		if(result) {
//			System.out.println(str +" and "+str1 + " are anagram");
//		}
//		else {
//			System.out.println(str +" and "+str1 + " are not anagram");
//		}
//	
//		}	
//		else {
//			System.out.println(str +" and "+str1 + " are not anagram");
//			
//		}
		
		String name="silent";
		String name2="listen";
		if(name.length()==name2.length()) {
			char strchar[]=name.toCharArray();
			char strchar2[]=name2.toCharArray();
			Arrays.sort(strchar);
			Arrays.sort(strchar2);
			boolean result=Arrays.equals(strchar, strchar2);
			System.out.println(result);
				
//			if(result) {
//				System.out.println(" two strings are anagrams");
//			}
//			else {
//				System.out.println("tow strings are not anagrams");
//			}
//			
		}
//		

	}

}
