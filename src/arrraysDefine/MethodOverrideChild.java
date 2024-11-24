package arrraysDefine;

public class MethodOverrideChild {
	public static void main(String[] args) {
		//MethodOverRide r = new MethodOverRide();
		MethodOverRide r2= new ChildClassOveride();
		
		ChildClassOveride c=new ChildClassOveride();
		//ChildClassOveride c1=(ChildClassOveride) new MethodOverRide();
		//r.add(4, 9);
        r2.add(1,3);
      //  r2.add(22, 44,44);
		c.add(8,3,2);
		c.add(2, 3, 4);
		
		
	}

}
