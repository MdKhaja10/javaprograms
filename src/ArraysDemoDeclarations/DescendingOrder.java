package ArraysDemoDeclarations;

public class DescendingOrder {

	public static void main(String[] args) {
		int a[]= {23,92,11,8,50,89,10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
			
		}
		System.out.println("********************************");
		for(int k=0;k<a.length;k++) {
			if(a[k]%2==0) {
				System.out.print(a[k]+" ");
				
			}
		}

	}

}
