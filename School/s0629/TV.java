package s0629;

public class TV implements Sound{
	private int TV_Sound;

	@Override
	public void SoundUp(int level) {
		// TODO Auto-generated method stub
		TV_Sound += (level * 2);
		System.out.println("TV UP: " + TV_Sound);
	}

	@Override
	public void SoundDown(int level) {
		// TODO Auto-generated method stub
		TV_Sound -= (level * 2);
		if(TV_Sound < 0) {
			TV_Sound = 0;
			System.out.println("TV DOWN: " + TV_Sound);
		}
	}

	public int getTV_Sound() {
		return TV_Sound;
	}
	
	
}
