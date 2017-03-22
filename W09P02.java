package java_homework;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class W09P02 extends JFrame implements ActionListener{
	JLabel jLabel = new JLabel("신장(cm)을 입력하세요");
	JLabel jLabel1 = new JLabel("체중(kg)을 입력하세요");
	JTextField jTextField = new JTextField(7);
	JTextField jTextField1 = new JTextField(7);
	JButton jButton = new JButton("비만지수(BMI) 계산");
	public W09P02() {
		setLayout(new FlowLayout());
		add(jLabel);
		add(jTextField);
		add(jLabel1);
		add(jTextField1);
		add(jButton);
		jButton.addActionListener(this);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new W09P02().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double bmi = Double.parseDouble(jTextField1.getText()) / ((Double.parseDouble(jTextField.getText()) / 100 ) *(Double.parseDouble(jTextField.getText()) / 100 ));
			String s = String.format("%.2f", bmi);
			if(bmi < 18.5) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <저체중>입니다.");
			}
			else if(bmi < 23) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <정상>입니다.");
			}
			else if(bmi < 25) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <과체중>입니다.");
			}
			else if(bmi < 30) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <1단계 비만>입니다.");
			}
			else if(bmi < 35) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <2단계 비만>입니다.");
			}
			else if(bmi >= 35) {
				JOptionPane.showMessageDialog(null, "당신의 BMI는" +s+"이고, <고도 비만>입니다.");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
}
