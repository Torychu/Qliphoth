package s0518;

public class foodmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Food donut = new Food();
//		donut.name = "ũ������ ũ�� ����";
//		donut.count = 10;
//		donut.printFood();
		
		Food juice = new Food("������ �ֽ�", 10);
		juice.printFood();
		
		Food coffee = new Food("ī���", 5);
		coffee.printFood();
		int ���� = coffee.getPrice();
		System.out.println("����:" + ����);
	}
	

}
