package s0713;

public class StringExam {
	public static void main(String[]args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("1.3버전째 문자를 출력하시오 : "+str.charAt(2));
		System.out.println("2.str과 ABC를 비교하시오 : " + str.compareTo("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("3.str이 mno를 포함? : " + str.contains("mno"));
		System.out.println("4.str이 비어있는가? : " + str.isEmpty());
		System.out.println("5.str의 길이는? : " + str.length());
		System.out.println("6.abc를 ABC로 바꾸시오 : " + str.replace("abc", "ABC"));
		System.out.println("7.str에서 cde만 추출하시오 : " + str.substring(2,5));
		System.out.println("8.str을 대문자로 바꾸시오. : " + str.toUpperCase());
		
		String a = "123";
		System.out.println(Integer.parseInt(a)+1);
		
		Integer i = 123;
		System.out.println(i.doubleValue());
		
		System.out.println(Integer.parseInt(a));
		
		int j = -555;
		System.out.println(Math.abs(j));
		System.out.println(Math.max(345, 356));
		for(int k = 0; k < 5; k++)
			System.out.println(Math.round(Math.random()*100));
	}

}
