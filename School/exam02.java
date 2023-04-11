package s0316;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		if(str1 == str2)
//			System.out.println("같은 주소");
//		else
//			System.out.println("다른 주소");
		String str3 = "abc";
		String str4 = "abc";
		if(str3==str4)
			System.out.println("같은 주소");
		else
			System.out.println("다른 주소");
		str3 = "qqq";
		System.out.println(str4);
		double a = 1.1;
		double b = 0.1;
		if(a+b == 1.2)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		
	}

}
