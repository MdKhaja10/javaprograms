package multipleInheritance;

public class Mobile {

	public static void main(String[] args) {
		FeaturePhone fphone=new FeaturePhone();
		SmartPhone sphone=new SmartPhone();
		System.out.println("-------------------Feature phone features---------------------");
		Features.dualSim();
		fphone.dailing();
		fphone.messaging();
		System.out.println("---------------------Smart phone features---------------------------");
		Addons.dualSim();
        sphone.dailing();
        sphone.messaging();
        sphone.mms();
        sphone.voiceCalling();
	}

}
