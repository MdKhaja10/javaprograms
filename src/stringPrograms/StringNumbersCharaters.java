package stringPrograms;

public class StringNumbersCharaters {

	public static void main(String[] args) {
		String name="45khaja123mohammed98moin84";
		StringBuilder letters= new StringBuilder();
		StringBuilder nonletters=new StringBuilder();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isLetter(ch)) {
			letters.append(ch);
			}
			else {
				nonletters.append(ch);
			}
		}
		System.out.println(letters);
		System.out.println(nonletters);
		
	}

}
