package stringPrograms;

public class StringWordsAlphabeticalOrder {

	public static void main(String[] args) {
	   String str="hello welcome to testing";
	   String str1[]=str.split(" ");
	   for(int i=0;i<str1.length;i++) {
		   for(int j=0;j<str1.length;j++) {
			   if(str1[i].compareTo(str1[j])<0) {
				   String temp=str1[i];
				   str1[i]=str1[j];
				   str1[j]=temp;
			   }
		   }
	   }
	   for(int k=0;k<str1.length;k++) {
		   System.out.println(str1[k]);
	   }
	}

}
