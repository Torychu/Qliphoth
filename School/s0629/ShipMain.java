package s0629;

public class ShipMain extends Ship{
	
	String shipname; //배이름
	int p_count; //승객수
	int l_amount; //짐의 무게
	
	public static void main(String[] args) {
		ShipMain s1 = new ShipMain();
		s1.l_amount = 100;
		s1.p_count = 200;
		
		System.out.println("최대 승객은" + s1.p_count + "입니다.");
		System.out.println("최대 적재량은" + s1.l_amount + "입니다.");
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
