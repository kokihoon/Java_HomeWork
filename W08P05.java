package java_homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class W08P05 {
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream(args[0]);
			FileOutputStream os = new FileOutputStream(args[0] + ".enc");
			
			while(true) {
				int data= is.read();
				if(data == -1) 
					break;
				byte btL=(byte)(data<<4);
				data=data &0xF0;
				byte btR=(byte)(data>>4);
				//				byte b = (byte) ((((byte)data << 4) &0xF0) | ((byte)data >> 4));
				System.out.printf("%02X ", btL + btR);
				os.write(btL + btR);
			}
			is.close();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

