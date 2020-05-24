package ie.patterns;

public class Invoker {

	I_Command on;
	I_Command off;
	
	public Invoker(I_Command on, I_Command off) {
		this.off = off;
		this.on = on;
	}
	
	public void click_on() {
		this.on.execute();
	}
	
	public void click_off() {
		this.off.execute();
	}
}
