package ArraysDemoDeclarations;
public class MissingNum {

	public static void main(String[] args) {
		int a[]= {4,9,10,5,7,6};
	    for(int i=0;i<a.length;i++) {
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[i]>a[j]) {
	    			int temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    			
	    		}
	    		
	    	}
	    	
	    }
	    int sum=0;
	   for (int k=0;k<a.length;k++) {
		   sum=sum+a[k];
		   
	   }
	   System.out.println(sum);
	   int sum1=0;
	   for(int l=4;l<=10;l++) {
		   sum1=sum1+l;
		  
	   }
	   System.out.println(sum1);
	   System.out.println("the missing element "+ (sum1-sum));
		

	}

}
