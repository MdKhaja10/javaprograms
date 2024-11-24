package stringPrograms;

public class RemovingVowels {

	public static void main(String[] args) {
		String name="apple";
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				System.out.print(ch);
			}
		}
		
	}

}
