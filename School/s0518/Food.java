package s0518;

public class Food {
	//��� ����
	String name; //���� �̸�
	private int price = 1000; //����
	int count; //����
	static int total_count; //��ü ����
	
	//������
	Food(){} //��������
	
	Food(String name1, int count1){
		name = name1;
		count = count1;
		total_count += count;
	}
	
	//�޼ҵ�
	void printFood() {
		//ex)) ���� 1000��*10��
		System.out.println(name + price + "��*" + count +"��");
		System.out.println("�� ����:" + total_count);
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price1) {
		price = price1;
		
	}
}
