package arrraysDefine;

public class Occurances {

	public static void main(String[] args) {
		//removing occurances
		/*
		 * String name="khaja"; String rev=""; for(int i=0;i<name.length();i++) {
		 * boolean found= false; for(int j=0;j<rev.length();j++) {
		 * if(name.charAt(i)==rev.charAt(j)) { found=true; break; } } if(found==false) {
		 * rev=rev.concat(String.valueOf(name.charAt(i))); } } System.out.println(rev);
		 * for(int i=0;i<rev.length();i++) { int count=0; for(int
		 * j=0;j<name.length();j++) { if(rev.charAt(i)==name.charAt(j)) { count++; } }
		 * System.out.println(rev.charAt(i)+" occurs "+count+" times"); }
		 */
//only occurances count
		/*String name1 = "khaja";
		for (int i = 0; i < name1.length(); i++) {
			int count = 0;
			for (int j = 0; j < name1.length(); j++) {
				if (name1.charAt(i) == name1.charAt(j)) {
					count++;
				}
			}
			System.out.println(name1.charAt(i) + " occurs " + count + " times");
		}*/
		
		//reverse of a String and palindrome
		/*String name="aha";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}*/
		/*String name="welcome to java";
		String splitword[]=name.split(" ");
		String rev="";
		for(String w:splitword) {
			String reversewords="";
			for(int i=0;i<w.length();i++) {
				reversewords=w.charAt(i)+reversewords;
			}
			rev=rev+reversewords+" ";
			
			}
		
		System.out.println(rev);
		String sub="";
		for(int i=0;i<rev.length();i++) {
			//if(rev.charAt(i)!=' ') {
				sub=rev.charAt(i)+sub;
			//}
		}
		System.out.println(sub);
		String sum="welcome to java";
		String sumrev="";
		for(int i=0;i<sum.length();i++) {
			sumrev=sum.charAt(i)+sumrev;
			
		}
		System.out.println(sumrev);*/
	//perfect number	
	/*	int num=28;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}
		if(num==sum) {
			System.out.println("the number is perfect number");
		}
		else {
			System.out.println("the number is not perfect number");
		}*/
		//Strong number
		/*int num=145;
		int sum=0;
		int rem;
		int strong;
		strong =num;
		while(num!=0) {
			rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				//int fact=1;
				fact=fact*i;
			}
			num=num/10;
			sum=sum+fact;
		}
		System.out.println(sum);
		if(strong==sum) {
			System.out.println("the number is a perfect");
		}
		else {
			System.out.println("the number is not a perfect");
		}*/
		/*int leapyear=2020;
		if(leapyear%4==0) {
			System.out.println("the year is a leap year");
		}
		else if(leapyear%4==0 && leapyear%100!=0) {
			System.out.println("the year is a leap year");
		}
		else {
			System.out.println("the year is not leap year");		
				
		}  */
		String name="sailaja";
		String lakshmi;
		lakshmi=name;
		if(name.equals(lakshmi)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}
	

}
