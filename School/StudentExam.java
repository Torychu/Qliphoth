package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee;
		lee = new Student(); //2줄로 써도 상관 없음
		
		kim.name = "정윤환";
		kim.number = 20614;
		kim.phone = "010-0000-0000";
		kim.School = "우리";
		System.out.println("이름:"+kim.name);
		System.out.println("학번:"+kim.number);
		System.out.println("전화:"+kim.phone);
		System.out.println("학교:"+kim.School);
		
		lee.name = "이리";
		lee.number = 12345;
		lee.phone = "010-0101-0101";
		System.out.println("이름:"+lee.name);
		System.out.println("학번:"+lee.number);
		System.out.println("전화:"+lee.phone);
		System.out.println("학교:"+lee.School);
		System.out.println("총학생수:"+Student.count);
		
	}

}
