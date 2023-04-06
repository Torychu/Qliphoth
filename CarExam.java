package s0406;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car redCar = new Car();
		Car blueCar = new Car();
		
		redCar.car_name = "제네시스";
		redCar.price = 5000;
		redCar.brand="현대";
		redCar.velocity=30;
		
		blueCar.car_name = "510D";
		blueCar.price=8000;
		blueCar.brand="BMW";
		blueCar.velocity=40;
		
		redCar.run();
		redCar.vel_up(10);
		redCar.vel_up(10);
		redCar.stop();
		redCar.vel_down(40);
		redCar.vel_up(150);
		redCar.stop();
	}

}
