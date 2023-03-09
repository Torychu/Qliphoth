package s0309;

import java.lang.*;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		System.out.println("Hello" + "java!");
		System.out.println("제 나이는" + 19 + " 살");
		System.out.println("3과 4를 결합:" + 3 + 4);
		System.out.println("3과 4를 결합:" + (3 + 4));
//		System.out.println("나는 "안녕"하고 말했다");
		System.out.println("나는 \"안녕\"하고 말했다");
		
		Scanner s = new Scanner(System.in);
		System.out.println("나이를 입력:");
		int age = s.nextInt();
		System.out.println("나이:" + age);
	}

}
