package ArraysProgram;

public class SecondHightestNum {
	
	public  static int highestnum(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);
			
		}
		return a[a.length-3];

		// here we can any number of program length
	}
	public static void main(String[] args) {
		int a[]= {2,6,1,3,5,4,9,8,10,7};
		System.out.println("the second hightest number is "+highestnum(a));
		System.out.println("this code is for testing the expression of the sum of the systems");
	}

}
