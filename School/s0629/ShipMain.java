package s0629;

public class ShipMain extends Ship{
	
	String shipname; //���̸�
	int p_count; //�°���
	int l_amount; //���� ����
	
	public static void main(String[] args) {
		ShipMain s1 = new ShipMain();
		s1.l_amount = 100;
		s1.p_count = 200;
		
		System.out.println("�ִ� �°���" + s1.p_count + "�Դϴ�.");
		System.out.println("�ִ� ���緮��" + s1.l_amount + "�Դϴ�.");
	}

	@Override
	int Passenger() {
		// TODO Auto-generated method stub
		return p_count;
	}

	@Override
	int Luggage() {
		// TODO Auto-generated method stub
		return l_amount;
	}
}
