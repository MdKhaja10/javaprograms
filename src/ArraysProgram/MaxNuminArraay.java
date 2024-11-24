package ArraysProgram;

public class MaxNuminArraay {

	public static void main(String[] args) {
		int a[]= {9,32,5,2,45,8,10};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
			
		}
		}
			System.out.println(max);
			
	}

}
