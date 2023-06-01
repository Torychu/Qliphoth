package s0601;

public class Cafe {
	int coffee,sugar,cream;
	
	public void makeTea(int coffee, int sugar, int cream) {
		this.cream = cream;
		makeTea(coffee,sugar);
		
//		System.out.println("밀크커피 나가요~~");
//		System.out.println("커피 농도 : " + (coffee+sugar+cream));
//		printTeaInfo();
	}
	
	public void makeTea(int coffee, int sugar) {
		this.sugar = sugar;
		makeTea(coffee);
		
//		System.out.println("설탕 커피 나가요~~");
//		System.out.println("커피 농도 : " + (coffee+sugar));
//		printTeaInfo();
	}
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		
//		System.out.println("블랙 커피 나가요~~");
//		System.out.println("커피 농도 :" + coffee);
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("---[성분]---");
		System.out.println("커피 :" + coffee);
		System.out.println("설탕 :" + sugar);
		System.out.println("크림 :" + cream);
		System.out.println("커피 농도 : " + (coffee+sugar+cream));
		System.out.println("----------");
	}
}
