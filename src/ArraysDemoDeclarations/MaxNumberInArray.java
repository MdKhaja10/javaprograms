package ArraysDemoDeclarations;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int a[]= {23,92,11,8,50,89,10};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {//for minimum number a[i]<min
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
