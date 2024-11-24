package stringPrograms;
public class StringWordsRevers {
	public static void main(String[] args) {
		
		String name = "hello welcome to Testing";
		String rev = "";
		for (int i = 0; i < name.length(); i++) {
			rev = name.charAt(i) + rev;
		}
		System.out.println(rev);// gnitseT ot emoclew olleh 	
		}
}
