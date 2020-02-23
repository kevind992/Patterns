package ie.pattern;

public class PhoneDisplay implements Observer{

	private WeatherStation station;
	
	public PhoneDisplay(WeatherStation ws) {
		this.station = ws;
	}
	
	public void update() {
		this.station.getTemp();
		System.out.println("Got Update!");
	}

}
