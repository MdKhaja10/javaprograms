package ArraysDemoDeclarations;

public class SumAverageArray {

	public static void main(String[] args) {
		int a[]= {23,92,11,8,50,89,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		float average;
		average=sum/a.length;
		System.out.println(average);
	}

}
