package stringPrograms;

public class StringAlphabeticalOrder {
	public static void main(String[] args) {
		String name="zyxwvutsrqponmlkjihgfedcba";
	   char ch[]=name.toCharArray();
	   char temp;
	   int i=0;
	   while(i<ch.length) {
		   int j=i+1;
		   while(j<ch.length) {
			   if(ch[i]>ch[j]) {
				   temp=ch[i];
				   ch[i]=ch[j];
				   ch[j]=temp;
			   }
			   j=j+1;
		   }
		   i=i+1;
	   }
	   System.out.println(ch);
	}

}
