package s0525;

public class Student {
	
	//멤버변수
	String name;
	int grade;
	
	//생성자 : 오버로딩
	Student(){}
	Student(String name){
		this.name = name;
	}
	Student(String name ,int grade){
//		this.name = name;
		this(name);
		this.grade = grade;
	}
	
	//메소드
	void print() {
		System.out.println("이름:"+name+" 학년:"+grade);
	}
	
	void print2() {
		System.out.println("이름:"+ getName() +" 학년:"+ getgrade());
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
