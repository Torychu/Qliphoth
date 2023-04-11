package s0323;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력 : ");
		a = sc.nextInt();
		System.out.print("b 입력 : ");
		b = sc.nextInt();
		System.out.print("연산자 입력 : ");
		c = sc.next().charAt(0);
		
		if (c == '+')
			System.out.printf("%d + %d = %d",a,b,a+b);
		else if (c == '-')
			System.out.printf("%d - %d = %d",a,b,a-b);
		else if (c == '*')
			System.out.printf("%d * %d = %d",a,b,a*b);
		else if (c == '/')
			System.out.printf("%d / %d = %d",a,b,a/b);
		

//		if (a%2 == 0)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");			
	}

}
