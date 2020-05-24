package ie.patterns;

public class Light_Off_Command implements I_Command{
	public void execute() {
		System.out.println("Light Off Command Executed!");
	}

	public void unexecute() {
		System.out.println("Light Off Command Unexecuted!");
	}

}
