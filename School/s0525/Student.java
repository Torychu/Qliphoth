package s0525;

public class Student {
	
	//�������
	String name;
	int grade;
	
	//������ : �����ε�
	Student(){}
	Student(String name){
		this.name = name;
	}
	Student(String name ,int grade){
//		this.name = name;
		this(name);
		this.grade = grade;
	}
	
	//�޼ҵ�
	void print() {
		System.out.println("�̸�:"+name+" �г�:"+grade);
	}
	
	void print2() {
		System.out.println("�̸�:"+ getName() +" �г�:"+ getgrade());
	}
	
	//get
	String getName() {
		return name;
	}
	
	int getgrade() {
		return grade;
	}
	//set	
	void setName(String name) {
		this.name = name;
	}
	
	void setGrade(int grade) {
		this.grade = grade;
	}
}
