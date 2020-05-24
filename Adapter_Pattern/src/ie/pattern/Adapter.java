package ie.pattern;

public class Adapter implements I_Target{
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		this.adaptee.adapted_request();
	}
}
