package programsNumbers;

public class CountOfNumbes {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		while(num!=0) {
			num=num/10;
			sum++;
		}
		System.out.println(sum);
	}

}
