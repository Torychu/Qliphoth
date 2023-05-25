package s0525;

public class Account {
	String name;
	int no, balance; //���¹�ȣ, �ܰ�
	
	Account() {
		System.out.println("=====���� �߰�=====");
	}
	Account(String name, int no) {
		this();
		this.name = name;
		this.no = no;
	}
	Account(String name, int no, int balance) {
		this(name,no);
		this.balance = balance;
	}
	
	void printInfo() {
		System.out.println("[��������] ������:"+ name + " ���¹�ȣ:" + no + " �ܰ�:" + balance);
	}
	
	//inputMoney
	void inputMoney(int money) {
		balance += money;
		printInfo();
	}
	
	//outputMoney
	void outputMoney(int money) {
		if(money > balance) {
			System.out.println(name +"��" + money + "�� ��� ����-�����ܾ� " + balance +"��");
		}
		else {
			balance -= money;
		}
		printInfo();
	}
	
	public void printMenu() {
		System.out.println("�۾��� �����ϼ���\r\n"
				+ "1. �Ա�\n"
				+ "2. ���\n"
				+ "3. �ܰ���ȸ\n"
				+ "4. ����");
	}
}
