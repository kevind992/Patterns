package ie.patterns;

public class Runner {
	public static void main(String[] args) {
		
		Facade_Shape_Maker shape_maker = new Facade_Shape_Maker();
		
		shape_maker.draw_circle();
		shape_maker.draw_rectangle();
		shape_maker.draw_square();
		
	}
}
