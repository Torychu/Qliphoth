package s0525;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "��κ�";
		kim.grade = 1;
		
		Student lee = new Student("�̷κ�");
		lee.grade = 2;
		
		//
		
		Student jung = new Student("���κ�",1);
//		System.out.println(jung.name);
//		System.out.println(jung.grade);
		kim.print();
		lee.print();
		jung.print();
	}

}
