package s0406;

public class Car {
	//�������
	String car_name; //���̸�
	int price; //����
	String brand;
	static int count = 0; //�� ���� ����
	int velocity = 0;
	boolean running = false;
	
	//������ 
	Car(){
		count++;
	}
	
	//�޼ҵ�
	void run() {
		running=true;
		System.out.println(car_name+": �������Դϴ�.");
	}
	void stop() {
		running=false;
		if (running==false)
			return;
		System.out.println(car_name+": �����Ͽ����ϴ�.");
	}
	void vel_up(int value) { //value ��ŭ �ӵ� ����
		if (running==true) {
			velocity += value;
			if (velocity >= 100) {
				System.out.println("�ִ� �ӵ��� 100�Դϴ�.");
				velocity = 100;
			}
			
			System.out.println(car_name+" �ӵ�:"+velocity);
		}
		else{
			System.out.println("�õ��� �ɾ��ּ���.");
			return;
		}
		
	}
	void vel_down(int value) { //value ��ŭ �ӵ� ����
	if (running==true) {
		velocity -= value;
		System.out.println(car_name+" �ӵ�:"+velocity);
		}
	else{
		System.out.println("�õ��� �ɾ��ּ���.");
		return;
	}
	}
}
