package stringPrograms;

public class RemovingSpecialCharNum {

	public static void main(String[] args) {
		String name="khaja!@#$%^&*()";
		String afterSpecChar="";
		afterSpecChar=name.replaceAll("[^A-Za-z]", "");
		System.out.println(afterSpecChar);
	}

}