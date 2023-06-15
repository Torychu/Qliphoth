package s0615;

public class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("도서명:"+title+" 작가명:"+writer);
	}
}

class Cartoon extends Book2{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon) {
			System.out.println("이 만화는 웹툰입니다");
		}
		else {
			System.out.println("이 만화는 웹툰이 아닙니다");
		}
	}

}
class Major extends Book2{
	String subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("전공 분야는 "+ subject+"입니다");
	}
	
}
