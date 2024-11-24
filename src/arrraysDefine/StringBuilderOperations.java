package arrraysDefine;

public class StringBuilderOperations {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("khaja");
		System.out.println(sb);
		sb.insert(0, "mohammed");
		System.out.println(sb);
		//
		StringBuilder sb1=new StringBuilder("mohammedkhaja");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb.compareTo(sb1));
		sb.insert(10, "w");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

	}

}
