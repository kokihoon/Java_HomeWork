package java_homework;

public class Smartphone implements HandlingSound{
	private int volume = 0;
	@Override
	public void increaseVolume() {
		if(volume < 10) {
			volume++;
		}
	}

	@Override
	public void decreaseVolume() {
		if(volume > 0) {
			volume--;
		}
	}
	public String toString() {
		return String.valueOf(volume);
	}
}
