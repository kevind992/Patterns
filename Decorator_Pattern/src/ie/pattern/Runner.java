package ie.pattern;

public class Runner {
	public static void main(String[] args) {
		
		ChristmasTree tree1 = new Tinsel(new ChristmasTreeImpl());
		System.out.println(tree1.decorate());
		
		ChristmasTree tree2 = new Tinsel(new BubbleLights(new ChristmasTreeImpl()));
		System.out.println(tree2.decorate());
		
	}
}
