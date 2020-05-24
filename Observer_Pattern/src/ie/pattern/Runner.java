package ie.pattern;

public class Runner {
	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		PhoneDisplay pd = new PhoneDisplay(station);
		PhoneDisplay pd2 = new PhoneDisplay(station);
		
		station.add(pd);
		station.add(pd2);

		station.setTemp();
	}
}
