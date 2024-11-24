package stringPrograms;

public class StringNumbersCount {

	public static void main(String[] args) {
		String name="1234javaDevoper345";
		int sum=1;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9') {
				sum+=name.charAt(i)-'0';
				//sum*=name.charAt(i)-'0';
			}
		}
		System.out.println(sum);
		//System.out.println(sum);

	}

}
