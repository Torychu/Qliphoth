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
			System.out.print("학생" + (i+1) + " 이름 입력");
			name[i] = sc.next();
			for(int j = 0 ; j < 3; j++) {
				System.out.print("성적" + (j+1) + " 입력");
				score[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 2; i++) {
			sum = 0;
			for(int j = 0;j <3; j++)
				sum += score[i][j];
			avg = sum/3.0;
			System.out.print(name[i] + "학생의 총점은 "+ sum + "점이고,");
			System.out.printf("평균은 %.2f점 입니다.",avg);
			System.out.println("");
			
			if(avg>=90)
				System.out.println(name[i] + "학생의 학점은 A입니다.");
			else if(avg>=80)
				System.out.println(name[i] + "학생의 학점은 B입니다.");
			else if(avg>=70)
				System.out.println(name[i] + "학생의 학점은 C입니다.");
			else if(avg>=60)
				System.out.println(name[i] + "학생의 학점은 D입니다.");
			else
				System.out.println(name[i] + "학생의 학점은 F입니다.");
		}
	}
//		Scanner sc = new Scanner(System.in);
//		String name[] = new String[2];
//		int score[] = new int[3];
//		int score_sub[] = new int[2];
//		int sum = 0;
//		double avg;
//		for(int i = 0; i < 2;i++) {
//			System.out.println("학생" + i+1 +"이름 입력 :");
//			name[i] = sc.next();
//			for(int j = 0;j < 3;j++) {
//				System.out.println("성적"+j+"입력 : ");
//				score[j] = sc.nextInt();
//				score_sub[i]
//			}
//			System.out.println("*******입력완료******");
//			System.out.println(name[0]+"학생의 총점은 "+ score_sub[0] + "이고, 평균은 " + score_sub[0]/2 + "입니다.");
//			if(score_sub[0]/2 >= 90) {
//				System.out.println(name[0]+"학생의 학점은 A입니다.");
//			}
//			else if(score_sub[0]/2 >= 80) {
//				System.out.println(name[0]+"학생의 학점은 B입니다.");
//			}
//			
//		}
//	}
		
		
}
