package s0601;

public class EngHello extends Greeting {
	
	public String name = "Mr.Hong";
	public void sayHello() {
		System.out.println(name +" Nice to meet you");
	}
	
	void æ»≥Á«œººø‰() {
		super.sayHello();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.æ»≥Á«œººø‰();
		}

}
