package programsNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=100;
		for(int i=2;i<num;i++) {
			boolean prime=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=true;
					break;
					
				}
			}
			if(prime==false) {
				System.out.print(" "+i);
			}
		}

	}

}
