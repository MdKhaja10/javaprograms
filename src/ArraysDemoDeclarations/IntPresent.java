package ArraysDemoDeclarations;

public class IntPresent {
	public static void main(String[] args) {
		int a[]= {23,92,11,8,50,89,10};
		int num=12;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				found=true;
				break;
		
			}
		}
		if(found) {
			System.out.println("the number is found");
		}
		else {
			System.out.println("the number is not found");
		}
		
	}

}
