package ThreadExam;

class RobotRace extends Thread{
	public RobotRace(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(getName().equals("A")==true)
				System.out.println(getName()+":"+i*10+"m");
			else if(getName().equals("B")==true)
				System.out.println("\t"+getName()+":"+i*10+"m");
			else
				System.out.println("\t\t"+getName()+":"+i*10+"m");
			
			try {Thread.sleep(1000);
		}catch (InterruptedException e) {e.printStackTrace();}
		}
		
		super.run();
		System.out.println(getName()+"가 결승선에 도착했습니다.");
	}
	
	
}

public class RobotRaceStart {
	public static void main(String[] args) {
		RobotRace a = new RobotRace("A");
		RobotRace b = new RobotRace("B");
		RobotRace c = new RobotRace("C");
		
		a.start();
		b.start();
		c.start();
		
	}

}
