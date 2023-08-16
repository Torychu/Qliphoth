package Shape;

public class Circle extends Shape {
	private int radius;
	
	public Circle() { //생성자1
		super();
	}
	
	public Circle(String name, int radius) { //생성자2
		super(name);
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("반지름" + radius+ "인 원을 그립니다.");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("반지름이" + radius + "인 원의 넓이는" + PI*radius*radius +"입니다.");
	}

	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		System.out.println("반지름이" + radius + "인 원의 둘레는" + PI*2*radius +"입니다.");
	}


}
