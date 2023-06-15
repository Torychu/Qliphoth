package s0615;

public class Person {
	String name;
	int age;

	void printinfo() {
		System.out.println(name+"의 나이는 "+age+"살입니다.");
	}
}

class Student extends Person{
	boolean online;

	@Override
	void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		if(online)
			System.out.println(name+"은 학생이며 현재 온라인 수업 중입니다.");
		else
			System.out.println(name+"은 학생이며 현재 등교 수업 중입니다.");
	}
	
}

class SoccerPlayer extends Person{
	String teamName;

	@Override
	void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		System.out.println(name+"는 "+teamName+"팀 축구선수 입니다.");
	}
}
