package ArraysDemoDeclarations;

public class CountOfDuplicateArray {

	public static void main(String[] args) {
		int a[]= {78,22,46,94,22,78,46};
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("the duplicate value in the given array is "+a[i]);
					found=true;
					break;
				}
			}
		}
		if(found==false) {
			System.out.println("there is no duplicate values");
		}
		
	}

}
