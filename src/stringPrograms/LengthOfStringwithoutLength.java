package stringPrograms;

public class LengthOfStringwithoutLength {
	public static void main(String[] args) {
		int count=0;
		String name="mohammed Khaja";
		String ch[]=name.split("");
		for(String splitchar:ch) {
			System.out.println(splitchar);
			count++;
		}
		System.out.println(count);
		//string lenght without using lenght method
	}
	
	
}
