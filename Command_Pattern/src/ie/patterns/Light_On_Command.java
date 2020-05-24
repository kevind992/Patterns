package ie.patterns;

public class Light_On_Command implements I_Command{
	
	public void execute() {
		System.out.println("Light On Command Executed!");
	}

	public void unexecute() {
		System.out.println("Light On Command Unexecuted!");
	}
}
