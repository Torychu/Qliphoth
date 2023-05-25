package s0525;

public class Employee {
	String name;
	int no;
	int age;
	
	public Employee() {
	}
	public Employee(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getNo() {
		return no;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[직원 정보] 이름:" + name + " 번호:" + no + " 나이" + age;
	}
}
