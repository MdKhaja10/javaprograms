package programsNumbers;

public class ArmStrong {

	public static void main(String[] args) {
		int num=153;
		int rem,sum=0,armstrong;
		armstrong=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		System.out.println(sum);
		if(armstrong==sum) {
			System.out.println("the number is armstrong");
			
		}
		else {
			System.out.println(" the number is not armstrong");
		}
		

	}

}
