package ie.pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherStation implements Obserable{

	private ArrayList<Observer> observers;
	private int temp;
	
	public WeatherStation () {
		observers = new ArrayList<>();
	}
	
	public void add(Observer o) {
		this.observers.add(o);
		System.out.println("Added..");
	}

	public void remove(Observer o) {
		this.observers.remove(o);
		System.out.println("Removed..");
	}

	public void notify_() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
	
	public int getTemp() {		
		return this.temp;
	}
	
	public void setTemp() {
		Scanner in = new Scanner(System.in);
        this.temp = in.nextInt();
        in.close();
        notify_();
	}
}