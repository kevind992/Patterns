package ie.pattern;

public class Runner {
	public static void main(String[] args) {
		I_Target target_1 = new Targetee();
		target_1.request();
		
		I_Target target_2 = new Adapter(new Adaptee());
		target_2.request();
	}
}
