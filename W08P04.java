package java_homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class W08P04 {
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream(args[0]);
			while(true) {
				int data = is.read();
				if(data == -1)
					break;
				System.out.printf("%02X ", data);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
