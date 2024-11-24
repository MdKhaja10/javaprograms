package multipleInheritance;

public interface Addons {
	void voiceCalling();
	void mms();
	public static void dualSim() {
		System.out.println("smart phone supports only dual sim but not memory card");
	}
	 static void memoryCard() {
		 System.out.println("smart phone supports only one sim and memory card");
	 }

}
