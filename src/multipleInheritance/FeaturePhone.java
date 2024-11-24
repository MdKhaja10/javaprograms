package multipleInheritance;

public class FeaturePhone implements Features{
	public void dailing() {
		System.out.println("Feature phone is Dailing");
		Features.memoryCard();
	}
	public void messaging() {
		System.out.println("Feature phone is messaging");
	}

}
