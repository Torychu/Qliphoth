package s0615;

public class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("������:"+title+" �۰���:"+writer);
	}
}

class Cartoon extends Book2{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon) {
			System.out.println("�� ��ȭ�� �����Դϴ�");
		}
		else {
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�");
		}
	}

}
class Major extends Book2{
	String subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("���� �оߴ� "+ subject+"�Դϴ�");
	}
	
}
