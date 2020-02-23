package ie.pattern;

public class Tinsel extends TreeDecorator{

	public Tinsel(ChristmasTree tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}
	
	public String decorate() {
		return super.decorate() + decorateTreeWithTinsel();
	}
	
	private String decorateTreeWithTinsel() {
		return " with Tinsel";
	}

}
