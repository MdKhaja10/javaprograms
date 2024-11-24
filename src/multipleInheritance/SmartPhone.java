package multipleInheritance;

public class SmartPhone implements Features,Addons{
	public void dailing() {
		System.out.println("Smart phone is Dailing");
	}
	public void messaging() {
		System.out.println("Smart phone is messaging");
	}
	public void voiceCalling() {
		System.out.println("Smart phone is voice calling");
	}
	public void mms() {
		System.out.println("Smart phone is sending mms");
		Addons.memoryCard();
	}
	

}
