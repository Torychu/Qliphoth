package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee;
		lee = new Student(); //2�ٷ� �ᵵ ��� ����
		
		kim.name = "����ȯ";
		kim.number = 20614;
		kim.phone = "010-0000-0000";
		kim.School = "�츮";
		System.out.println("�̸�:"+kim.name);
		System.out.println("�й�:"+kim.number);
		System.out.println("��ȭ:"+kim.phone);
		System.out.println("�б�:"+kim.School);
		
		lee.name = "�̸�";
		lee.number = 12345;
		lee.phone = "010-0101-0101";
		System.out.println("�̸�:"+lee.name);
		System.out.println("�й�:"+lee.number);
		System.out.println("��ȭ:"+lee.phone);
		System.out.println("�б�:"+lee.School);
		System.out.println("���л���:"+Student.count);
		
	}

}
