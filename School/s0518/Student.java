package s0518;

public class Student {
	private String name;
	private int grade;
	static int count;
	
	Student() {
		count++;
	}
	
	static int getCount() {
		return count;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getgrade() {
		return grade;
		}
	
	void setgrade(int grade) {
		this.grade = grade;
	}
	
	void print() {
		System.out.println("�л��� �̸��� " + name + "�̰�, " + grade + "�г��Դϴ�.");
	}
}
