package stringPrograms;

public class LengthOfEachWord {

	public static void main(String[] args) {
		String name="hellow world welcome to testing";
		 name=name+" ";
		// System.out.println(name+"344");
		int start=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch==' ') {
				String sub=name.substring(start, i);
				System.out.println(sub+" - "+sub.length());
				start=i+1;
			}
			
		}
	}

}
