package ArraysDemoDeclarations;

public class SumofTwoArraysAndCount {
	public static void main(String[] args) {
		//int num=10;
		int count=0;
		int a[]= {1,9,1,9,1,2,5,8,3};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==10) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
