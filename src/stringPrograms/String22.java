package stringPrograms;

import java.util.Arrays;

public class String22 {
public static void main(String[] args) {
	

//		String empty="";
//		String name="000120560000";
//		int start=0;
//		for(int i=0;i<name.length();i++) {
//			if(name.charAt(i)!='0') {
//				start=i;
//				break;
//			}
//		}
//		System.out.println(start);
//		int end=name.length()-1;
//		for(int i=name.length()-1;i>=0;i--) {
//			if(name.charAt(i)!='0') {
//				end=i;
//				break;
//			}
//		}
//		for(int i=start;i<end;i++) {
//			empty+=name.charAt(i);
//		}
//		System.out.println(empty);
	
	String str="123405000";
	String str1="";
	
	int index=0;
	
	
	
	
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		if(ch!='0') {
			index=i;
			break;
		}
		
	}
	str=str.substring(0,index+1);
	System.out.println(str);
	
	
		
}

}