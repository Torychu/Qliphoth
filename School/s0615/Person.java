package s0615;

public class Person {
	String name;
	int age;

	void printinfo() {
		System.out.println(name+"�� ���̴� "+age+"���Դϴ�.");
	}
}

class Student extends Person{
	boolean online;

	@Override
	void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		if(online)
			System.out.println(name+"�� �л��̸� ���� �¶��� ���� ���Դϴ�.");
		else
			System.out.println(name+"�� �л��̸� ���� � ���� ���Դϴ�.");
	}
	
}

class SoccerPlayer extends Person{
	String teamName;

	@Override
	void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		System.out.println(name+"�� "+teamName+"�� �౸���� �Դϴ�.");
	}
}
