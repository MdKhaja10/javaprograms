package stringPrograms;

public class StringMiddleCharacter {

	public static void main(String[] args) {
		String name="welcomee";
		String middlechar=getMiddleChars(name);
		System.out.println(middlechar);
		
	}
	public static String getMiddleChars(String name) {
		int length=name.length();
		System.out.println(length);
		if(length%2==0) {
			int mid=length/2;
			return name.substring(mid-1,mid+1);
		}else {
			int mid=length/2;             
			return name.substring(mid,mid+1);
		}
		
		
	}

}
