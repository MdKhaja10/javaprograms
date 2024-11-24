package arrraysDefine;

public class StringBufferStrignBuilderDemo {

	public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer("khaja");
	StringBuffer sb2=new StringBuffer("khaja");
	System.out.println(sb1==sb2);
	//sb1.append("mohammed");
	sb1.insert(0, "mohammed");
	System.out.println(sb1==sb2);
	StringBuffer sb3=new StringBuffer("mohammedkhaja");
	System.out.println(sb1==sb3);
	sb2.insert(0, "mohammed");
	System.out.println(sb2);
	System.out.println(sb1);
	System.out.println(sb2.compareTo(sb1));
	}

}
