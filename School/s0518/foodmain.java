package s0518;

public class foodmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Food donut = new Food();
//		donut.name = "크리스피 크림 도넛";
//		donut.count = 10;
//		donut.printFood();
		
		Food juice = new Food("오렌지 주스", 10);
		juice.printFood();
		
		Food coffee = new Food("카페라떼", 5);
		coffee.printFood();
		int 가격 = coffee.getPrice();
		System.out.println("가격:" + 가격);
	}
	

}
