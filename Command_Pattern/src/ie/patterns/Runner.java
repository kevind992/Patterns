package ie.patterns;

public class Runner {

	public static void main(String[] args) {
	
		Invoker remote = new Invoker(new Light_On_Command(), new Light_Off_Command());
		
		remote.click_on();
		remote.click_off();
		
	}
}
