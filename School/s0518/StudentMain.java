package s0518;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("김로봇");
//		System.out.println("이름:" + kim.getName());
		kim.setgrade(1);
//		System.out.println("학년:" + kim.getgrade());
//		jang.setgrade(2);
		
		System.out.println("이름:" +kim.getName());
		System.out.println("학생수" + Student.getCount());
		
		Student jang = new Student();
		jang.setName("장발장");
		System.out.println("이름:" + jang.getName());
		System.out.println("학생수" + Student.getCount());
	}

}
