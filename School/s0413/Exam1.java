package s0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int [] num = new int[5];
		int max = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է����ּ���.");
		while(cnt < 5) {
			System.out.print(cnt+1+"��° �Է� : ");
			num[cnt] = sc.nextInt();
			if(max<num[cnt]) {
				max = num[cnt];
			}
			cnt++;
		}
		System.out.println("�Է��� ���� �� �ִ밪��" + max + "�Դϴ�.");
	}

}
