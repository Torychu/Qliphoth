package s0406;

public class Car {
	//멤버변수
	String car_name; //차이름
	int price; //가격
	String brand;
	static int count = 0; //총 소유 차량
	int velocity = 0;
	boolean running = false;
	
	//생성자 
	Car(){
		count++;
	}
	
	//메소드
	void run() {
		running=true;
		System.out.println(car_name+": 운행중입니다.");
	}
	void stop() {
		running=false;
		if (running==false)
			return;
		System.out.println(car_name+": 정차하였습니다.");
	}
	void vel_up(int value) { //value 만큼 속도 증가
		if (running==true) {
			velocity += value;
			if (velocity >= 100) {
				System.out.println("최대 속도는 100입니다.");
				velocity = 100;
			}
			
			System.out.println(car_name+" 속도:"+velocity);
		}
		else{
			System.out.println("시동을 걸어주세요.");
			return;
		}
		
	}
	void vel_down(int value) { //value 만큼 속도 감소
	if (running==true) {
		velocity -= value;
		System.out.println(car_name+" 속도:"+velocity);
		}
	else{
		System.out.println("시동을 걸어주세요.");
		return;
	}
	}
}
