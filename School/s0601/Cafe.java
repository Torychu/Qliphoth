package s0601;

public class Cafe {
	int coffee,sugar,cream;
	
	public void makeTea(int coffee, int sugar, int cream) {
		this.cream = cream;
		makeTea(coffee,sugar);
		
//		System.out.println("��ũĿ�� ������~~");
//		System.out.println("Ŀ�� �� : " + (coffee+sugar+cream));
//		printTeaInfo();
	}
	
	public void makeTea(int coffee, int sugar) {
		this.sugar = sugar;
		makeTea(coffee);
		
//		System.out.println("���� Ŀ�� ������~~");
//		System.out.println("Ŀ�� �� : " + (coffee+sugar));
//		printTeaInfo();
	}
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		
//		System.out.println("�� Ŀ�� ������~~");
//		System.out.println("Ŀ�� �� :" + coffee);
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("---[����]---");
		System.out.println("Ŀ�� :" + coffee);
		System.out.println("���� :" + sugar);
		System.out.println("ũ�� :" + cream);
		System.out.println("Ŀ�� �� : " + (coffee+sugar+cream));
		System.out.println("----------");
	}
}
