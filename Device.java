package java_homework;

public class Device implements HandlingFont, HandlingBrightness{


	public void setFont(int font) {
		if(font == BATANG) {
			System.out.println("πŸ≈¡√º");
		}
	}

	public void setBrightness(int brightness) {
		if(brightness == NORMAL) {
			System.out.println("∫∏≈Î ±Ω±‚");
		}
	}

	
}
