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
			
		}
		return a[a.length-3];
		
	}
	public static void main(String[] args) {
		int a[]= {1,4,8,9,10,4,9};
		System.out.println("the second hightest number is "+highestnum(a));
		System.out.println("this code is for testing the expression of the sum of the systems");
	}

}
