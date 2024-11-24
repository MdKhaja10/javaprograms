package programsNumbers;

public class LeapYear {

	public static void main(String[] args) {
		int year=2025;
		if(year%4==0) {
			System.out.println("the year is leap year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println(" the year is leap year");
			
		}
		else {
			System.out.println(" the year is not leap year");
		}
	}

}
