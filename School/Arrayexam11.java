package s0323;
import java.util.Scanner;
public class Arrayexam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.print("���� �Է� : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		System.out.println("�հ� : " + sum);
		avg = sum/5.0;
		System.out.printf("��� : %.1f", avg);
	}

}
