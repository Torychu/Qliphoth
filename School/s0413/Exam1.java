package s0413;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int [] num = new int[5];
		int max = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해주세요.");
		while(cnt < 5) {
			System.out.print(cnt+1+"번째 입력 : ");
			num[cnt] = sc.nextInt();
			if(max<num[cnt]) {
				max = num[cnt];
			}
			cnt++;
		}
		System.out.println("입력한 값들 중 최대값은" + max + "입니다.");
	}

}
