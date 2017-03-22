package java_homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class W08P03 {
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream(args[0]);
			FileOutputStream os = new FileOutputStream(args[0] + ".copy");
			while(true) {
				int data = is.read();
				if(data == -1) break;
				os.write((byte)data);
			}
			is.close();
			os.close();
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
