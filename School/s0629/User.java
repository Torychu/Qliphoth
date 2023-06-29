package s0629;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio radio = new Radio();
		TV tv = new TV();
		
		radio.SoundUp(5);
		radio.SoundUp(7);
		radio.SoundDown(20);
		
		tv.SoundUp(10);
		tv.SoundDown(20);
	}

}
