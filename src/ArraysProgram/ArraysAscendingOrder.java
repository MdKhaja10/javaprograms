package ArraysProgram;

public class ArraysAscendingOrder {

	public static void main(String[] args) {
		 System.out.print("[");
	  int a[]= {6,3,7,4,0,1,2,5};
	  for(int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i]>a[j]) {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  
			  }
			 
		  }
		  System.out.print(a[i]+","+" ");
		 
	  }
	  System.out.println("]");
	}

}
