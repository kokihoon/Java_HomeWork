package java_homework;

import java.io.FileInputStream;
public class W08P01 {
	public static void main(String[] s) {
		try {
			FileInputStream file = new FileInputStream(s[0]);
			int cnt = 0;
			while(true) {
				byte data = (byte) file.read();
				
				if(data == -1) break;
				cnt++;
			}
			file.close();
			System.out.println("File size : " + cnt + " bytes");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
