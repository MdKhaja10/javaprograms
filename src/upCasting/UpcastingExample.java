package upCasting;

public class UpcastingExample {

	public static void main(String[] args) {
		Parent obj1 =  new Child();  
	    Parent obj3= new Parent();
	      Parent obj2 = new Child();   
	      obj1.PrintData();  
	      obj2.PrintData(); 
	      obj3.PrintData();
	   }  	

}
