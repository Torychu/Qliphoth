package s0608;

public class Truck extends Car{
	int ton;
	void speedUp() {
		velocity += 10;
		System.out.println("트럭속도 " + velocity + "증가");
	}
	
	void speedUpUP() {
		super.speedUp();
	}
}
