package java_homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class W08P02 {
	public static void main(String[] s) {
		try {
			BufferedReader r = new BufferedReader(new FileReader(s[0]));
			int line_count = 0;
			int char_count = 0;
			int token_count = 0;
			String s1;
		      while ((s1 = r.readLine()) != null) {
		        line_count++;
		        String tokens[] = s1.split("\\s+");
		        for(String v : tokens) {
		        	token_count++;
		        }
		        char_count += s1.length();
		      }
		      r.close();
		      System.out.println("라인 수 : " + line_count);
		      System.out.println("토큰 수 : " + token_count);		      
		      System.out.println("문자 수 : " + char_count);
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}