package stringPrograms;

public class NoOfWordsInString {

	public static void main(String[] args) {
		String name= "welcome to java training by pawan sir";
		int count=1;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ' && name.charAt(i+1)!=1) {
				count++;
			}
		}
		System.out.println(count);
//		String name="welcome to java programming";
//		int count=1;
//		for(int i=0;i<name.length();i++) {
//			if(name.charAt(i)==' ' && name.charAt(i+1)!=1) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
	}
	

}
