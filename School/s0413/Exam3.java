package s0413;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		int month;
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		switch (month){
		case 2:
			day = 28;
			break;
		case 4,6,9,11:
			day = 30;
			break;
		default:
			day = 31;
			break;
		}
		System.out.println(month+"월은 " + day + "일입니다.");
	}

}
