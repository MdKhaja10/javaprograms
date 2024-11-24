package multipleInheritance;

public interface A {
     void Adisplay();
}


class Main1{
	public static void main(String[] args) {
		AB ab=new AB();
		ab.Adisplay();
		ab.Bdisplay();
	}

}