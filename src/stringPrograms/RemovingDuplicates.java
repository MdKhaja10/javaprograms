package stringPrograms;

public class RemovingDuplicates {

	public static void main(String[] args) {
		String name="khaja";
		String rev="";
		for(int i=0;i<name.length();i++) {
			boolean found=false;
			for(int j=0;j<rev.length();j++) {
				if(name.charAt(i)==rev.charAt(j)) {
					found=true;
					break;
				}
			}
			if(found==false) {
				rev=rev.concat(String.valueOf(name.charAt(i)));
			}
		}
		System.out.println(rev);
		for(int i=0;i<rev.length();i++) {
			int count=0;
			for(int j=0;j<name.length();j++) {
				if(rev.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			System.out.println(rev.charAt(i)+" occurs "+count+" times");
		}
	}

}
