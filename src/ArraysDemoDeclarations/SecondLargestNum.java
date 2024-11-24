package ArraysDemoDeclarations;

public class SecondLargestNum {
	/*
	 * public static int secondLargestNum(int a[]) { for(int i=0;i<a.length;i++) {
	 * for(int j=i+1;j<a.length;j++) { if(a[i]>a[j]) { int temp=a[i]; a[i]=a[j];
	 * a[j]=temp; } } //System.out.println(a[i]);
	 * 
	 * } return a[a.length-2];
	 * 
	 * } public static void main(String[] args) { int a[]= {10,20,30,40,50,90,90};
	 * System.out.println("the second largest element in the given array is "
	 * +secondLargestNum(a)); }
	 */
	
	public static int fifthlargges(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		System.out.print(a[i]+ " ");
		}
		return a[a.length-1];
		
	}
	public static void main(String[] args) {
		int a[]= {2,6,1,3,5,4,9,8,10,7};
		System.out.println("the second largest number in the given array is"+fifthlargges(a));
	}
	

}
