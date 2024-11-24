package ArraysDemoDeclarations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemovingDuplicateArrayUnSort {
		/*public static int removeDuplicates(int a[],int n) {
			if(n==0||n==1) {
				return n;
			}
			int j=0;
			for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					a[j++]=a[i];
				}
			}
			a[j++]=a[n-1];
			return j;
		}
		public static void main(String[] args) {
			int a[]= {10,20,30,40,50,60,70,80,90,100,20,10,30,20 };//for unsort and sort array we use same program
			Arrays.sort(a);
			int length=a.length;
			length=removeDuplicates(a, length);
			System.out.print("[");
			for(int i=0;i<length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("]");
				
		}*/
		 

//public class RemovingDuplicateArrayUnSort {
			public static void removeDuplicates(int[] a) {
				HashSet<Integer> set = new HashSet<>();
				for (int i = 0; i < a.length; i++) {
					set.add(a[i]);
				}
				TreeSet<Integer> treeSet = new TreeSet<>(set);
				System.out.print("[");
				for (Integer num : treeSet) {
					System.out.print(num + " ");
				}
				System.out.println("]");
			
		}

			public static void main(String[] args) {
				int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 20, 10, 30, 20 };
				removeDuplicates(a);

			}
}