package programsNumbers;

public class PrimNumber {

	public static void main(String[] args) {
		int num=17;
		boolean prime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=true;
				break;
				
			}
			
		}
		if(!prime) {
			System.out.println("the number is a prime");
		}else {
			System.out.println("the number is not a prime");
		}

	}

}
