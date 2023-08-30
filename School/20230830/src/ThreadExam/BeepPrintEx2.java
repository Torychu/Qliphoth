package ThreadExam;

//멀티 쓰레드, 쓰레드가 2개 Runnable 인터페이스를 상속한 클래스를 생성

class BeepTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) {
			System.out.print(".");
			try {Thread.sleep(1);} catch (InterruptedException e) {}
		}
	}
	
}

public class BeepPrintEx2 {
	public static void main(String[] args) {
		//Runnable을 구현한 클래스의 인스턴스 생성
		Runnable beepTask = new BeepTask();
		//beepTask.start();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		
		for(int i = 0;i<5;i++) {
			System.out.print("*");
			try {Thread.sleep(1);} catch (InterruptedException e) {}
		}
	}
}
