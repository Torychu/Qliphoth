package s0518;

public class Food {
	//멤버 변수
	String name; //음식 이름
	private int price = 1000; //가격
	int count; //수량
	static int total_count; //전체 수량
	
	//생성자
	Food(){} //생략가능
	
	Food(String name1, int count1){
		name = name1;
		count = count1;
		total_count += count;
	}
	
	//메소드
	void printFood() {
		//ex)) 도넛 1000원*10개
		System.out.println(name + price + "원*" + count +"개");
		System.out.println("총 수량:" + total_count);
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price1) {
		price = price1;
		
	}
}
