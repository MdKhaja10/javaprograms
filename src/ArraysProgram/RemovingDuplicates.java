package ArraysProgram;

import java.util.HashSet;
import java.util.TreeSet;

public class RemovingDuplicates {
	public static void  removeDupl(int a[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		TreeSet<Integer> treeset=new TreeSet(set);
		
		System.out.print("[");
		for(Integer num:treeset) {
			System.out.print(num+" ");
		}
		System.out.println("]");	
	}
	public static void main(String[] args) {
		int a[]= {10,20,20,30,40,80,10,50,70,50,60};
		removeDupl(a);
	}

}
