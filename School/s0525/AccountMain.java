package s0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account user = new Account("�Ű�ȭ" , 456789, 10000);
		user.printInfo();
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		while(true) {
			user.printMenu();
			int menu = sc.nextInt();
			if(menu==4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}else if(menu==1) {
				System.out.println("�Ա��� �ݾ�:");
				money = sc.nextInt();
				user.inputMoney(money);
			}else if(menu==2) {
				System.out.println("����� �ݾ�:");
				money = sc.nextInt();
				user.outputMoney(money);
			}else if(menu==3) {
				user.printInfo();
			}
		}
	}

}
