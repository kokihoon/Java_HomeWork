package java_homework;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class W07P03{
	public static void main(String[] args) {   
		JFrame jFrame=new JFrame();   
		jFrame.setLayout(new FlowLayout()); // 윈도우에 올리는 화면 요소들을 둥둥 떠다니는 방식으로 배치함
		JButton jButton=new JButton("로또 번호 생성");   
		jFrame.add(jButton);   
		jButton.addActionListener(
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Random random = new Random();
					int[] num = new int[6];
					String str = "";
					for(int i = 0; i < 6; i++) {
						num[i] = random.nextInt(45) + 1;
						for(int j = i-1; j >= 0; j--) {
							System.out.println(j);
							if(num[i] == num[j]) {
								i--;
								break;
							}
						}
					}
					for(int i = 0; i < num.length; i++) {
						if(i < 5) {
							str += num[i] + ", ";
						}
						if(i == 5) {
							str += num[i];
						}
					}
					JOptionPane.showMessageDialog(null, str);

				}
			}
		);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack(); // 배치한 화면 요소들의 크기에 맞게 윈도우 크기를 조정함.
		jFrame.setVisible(true); 
	}
}
