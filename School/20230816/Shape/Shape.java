package Shape;

public abstract class Shape {
	private String name;
	protected static final double PI = 3.14;
	protected static int shapeCnt = 0;

	public Shape() { //생성자1
		shapeCnt++;
	}

	public Shape(String name) { //생성자2
		super();
		this.name = name;
	}
	
	public void draw() {
		System.out.println("["+name+"도형그리기]");
	}
	
	public abstract void calculateArea();
	public abstract void calculateRound();
	
	
	
	
}
