package s0518;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("��κ�");
//		System.out.println("�̸�:" + kim.getName());
		kim.setgrade(1);
//		System.out.println("�г�:" + kim.getgrade());
//		jang.setgrade(2);
		
		System.out.println("�̸�:" +kim.getName());
		System.out.println("�л���" + Student.getCount());
		
		Student jang = new Student();
		jang.setName("�����");
		System.out.println("�̸�:" + jang.getName());
		System.out.println("�л���" + Student.getCount());
	}

}
