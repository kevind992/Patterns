package ie.patterns;

public class Facade_Shape_Maker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public Facade_Shape_Maker() {
		
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
		
	}
	
	public void draw_circle() {
		this.circle.draw();
	}
	
	public void draw_rectangle() {
		this.rectangle.draw();
	}
	
	public void draw_square() {
		this.square.draw();
	}
	
}
