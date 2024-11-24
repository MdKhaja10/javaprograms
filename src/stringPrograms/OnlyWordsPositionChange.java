package stringPrograms;

import java.util.Arrays;
import java.util.List;

public class OnlyWordsPositionChange {

	public static void main(String[] args) {
		String name = "core java";
//		String reverse[] = name.split(" ");
		List<String> reverse = Arrays.asList(name.split(" "));
		System.out.println(reverse.size());
		StringBuffer reversedword = new StringBuffer();
		for (int i = reverse.size() - 1; i >= 0; i--) {
			reversedword.append(reverse.get(i));
			if (i != 0) {
				reversedword.append(" ");
			}

		}
		System.out.println(reversedword);
		
	/*	String name1="core java";
		String reverse[]=name.split(" ");
		System.out.println(reverse.length);
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<reverse.length;i++) {
                buffer.append(reverse[i]);
                if(i!=0) {
                	buffer.append(" ");
                }
			
		}
		System.out.println(buffer);*/
	}

}
