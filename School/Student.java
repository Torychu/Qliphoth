package s0406;

public class Student {
		//��� ����(�Ӽ�)
		String name; //�̸�
		int number; //�й�
		String phone; //��ȭ��ȣ
		static String School = "����κ�";
		static int count = 0;
		//������
		Student(){
			count++; 
			System.out.println("������:" + count);
		}
		//�޼ҵ�
	}
