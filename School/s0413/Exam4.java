package s0413;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[2];
		int score[][] = new int[2][3];
		int sum = 0;
		double avg;
		
		for(int i = 0; i < 2; i++){
			System.out.print("�л�" + (i+1) + " �̸� �Է�");
			name[i] = sc.next();
			for(int j = 0 ; j < 3; j++) {
				System.out.print("����" + (j+1) + " �Է�");
				score[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 2; i++) {
			sum = 0;
			for(int j = 0;j <3; j++)
				sum += score[i][j];
			avg = sum/3.0;
			System.out.print(name[i] + "�л��� ������ "+ sum + "���̰�,");
			System.out.printf("����� %.2f�� �Դϴ�.",avg);
			System.out.println("");
			
			if(avg>=90)
				System.out.println(name[i] + "�л��� ������ A�Դϴ�.");
			else if(avg>=80)
				System.out.println(name[i] + "�л��� ������ B�Դϴ�.");
			else if(avg>=70)
				System.out.println(name[i] + "�л��� ������ C�Դϴ�.");
			else if(avg>=60)
				System.out.println(name[i] + "�л��� ������ D�Դϴ�.");
			else
				System.out.println(name[i] + "�л��� ������ F�Դϴ�.");
		}
	}
//		Scanner sc = new Scanner(System.in);
//		String name[] = new String[2];
//		int score[] = new int[3];
//		int score_sub[] = new int[2];
//		int sum = 0;
//		double avg;
//		for(int i = 0; i < 2;i++) {
//			System.out.println("�л�" + i+1 +"�̸� �Է� :");
//			name[i] = sc.next();
//			for(int j = 0;j < 3;j++) {
//				System.out.println("����"+j+"�Է� : ");
//				score[j] = sc.nextInt();
//				score_sub[i]
//			}
//			System.out.println("*******�Է¿Ϸ�******");
//			System.out.println(name[0]+"�л��� ������ "+ score_sub[0] + "�̰�, ����� " + score_sub[0]/2 + "�Դϴ�.");
//			if(score_sub[0]/2 >= 90) {
//				System.out.println(name[0]+"�л��� ������ A�Դϴ�.");
//			}
//			else if(score_sub[0]/2 >= 80) {
//				System.out.println(name[0]+"�л��� ������ B�Դϴ�.");
//			}
//			
//		}
//	}
		
		
}
