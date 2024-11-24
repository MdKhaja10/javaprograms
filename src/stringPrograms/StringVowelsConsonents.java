package stringPrograms;

public class StringVowelsConsonents {

	public static void main(String[] args) {
		String s1="Khaja";
		int vowels1=0;
		int consonents1=0;
		StringBuilder s11=new StringBuilder();
		StringBuilder s12=new StringBuilder();
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			char ch1=s1.charAt(i);
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
				s11.append(ch1);
				vowels1++;
			}
			else if (ch1>='a' && ch1<='z'){
				s12.append(ch1);
				consonents1++;
				
			}
		}
		System.out.println(vowels1);
		System.out.println(consonents1);
		
		System.out.println(s11);
		System.out.println(s12);
//		String name="java developer";
//		StringBuilder vowels=new StringBuilder();
//		StringBuilder consonents=new StringBuilder();
//		name=name.toLowerCase();
//		for(int i=0;i<name.length();i++) {
//			char ch=name.charAt(i);
//			if(name.charAt(i)=='a' || name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o'||name.charAt(i)=='u') {
//				vowels.append(ch);
//			
//			}
//			 else if (ch >= 'a' && ch <= 'z') { // Check if it's a consonant
//				 consonents.append(ch);
//		}
//		}
//		 System.out.println("Vowels: " + vowels.toString());
//		 System.out.println("Consonants: " + consonents.toString());
	}

}
