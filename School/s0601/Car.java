package s0601;

public class Car {
	private String name;
	protected String color;
	int velocity;
	public String company;
	Car(){
		System.out.println("Car�⺻������");
	}
	
	Car(String name){
		System.out.println("Car������2");
	}

	
	void speedUp() {
		velocity += 5;
		System.out.println("�ӵ�����: " + velocity);
	}
	
	void speedDown() {
		velocity -= 5;
		System.out.println("�ӵ�����: " + velocity);
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}
