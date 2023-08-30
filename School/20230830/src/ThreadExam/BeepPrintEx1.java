package ThreadExam;
//단일 쓰레드 = 메인 쓰레드 1개만 존재
public class BeepPrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) {
			System.out.println(".");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
		for(int i = 0;i<5;i++) {
			System.out.println("*");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}

}
