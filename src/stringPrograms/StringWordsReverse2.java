package stringPrograms;

public class StringWordsReverse2 {

	public static void main(String[] args) {
		String name="hellow world welcome to testing";
		String name1[]=name.split(" ");
		String revwords="";
		for(String word:name1) {
			String words="";
			for(int i=0;i<word.length();i++) {
				words=word.charAt(i)+words;
			}
			revwords=revwords+words+" ";
			
		}
		System.out.println(revwords);
	}

}
