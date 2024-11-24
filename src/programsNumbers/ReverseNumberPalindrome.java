package programsNumbers;

public class ReverseNumberPalindrome {

	public static void main(String[] args) {
		int num=121;
		int rem,sum=0,palindrome;
		palindrome=num;
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		if(palindrome==sum) {
			System.out.println("the number is palindrome");
			
		}
		else {
			System.out.println(" the number is not palindrome");
		}
		

	}

}
