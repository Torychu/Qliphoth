package s0525;

public class Account {
	String name;
	int no, balance; //계좌번호, 잔고
	
	Account() {
		System.out.println("=====계정 추가=====");
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
		System.out.println("[계좌정보] 예금주:"+ name + " 계좌번호:" + no + " 잔고:" + balance);
	}
	
	//inputMoney
	void inputMoney(int money) {
		balance += money;
		printInfo();
	}
	
	//outputMoney
	void outputMoney(int money) {
		if(money > balance) {
			System.out.println(name +"님" + money + "원 출금 실패-현재잔액 " + balance +"원");
		}
		else {
			balance -= money;
		}
		printInfo();
	}
	
	public void printMenu() {
		System.out.println("작업을 선택하세요\r\n"
				+ "1. 입금\n"
				+ "2. 출금\n"
				+ "3. 잔고조회\n"
				+ "4. 종료");
	}
}
