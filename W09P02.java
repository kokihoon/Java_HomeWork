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
	JLabel jLabel = new JLabel("����(cm)�� �Է��ϼ���");
	JLabel jLabel1 = new JLabel("ü��(kg)�� �Է��ϼ���");
	JTextField jTextField = new JTextField(7);
	JTextField jTextField1 = new JTextField(7);
	JButton jButton = new JButton("������(BMI) ���");
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
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <��ü��>�Դϴ�.");
			}
			else if(bmi < 23) {
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <����>�Դϴ�.");
			}
			else if(bmi < 25) {
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <��ü��>�Դϴ�.");
			}
			else if(bmi < 30) {
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <1�ܰ� ��>�Դϴ�.");
			}
			else if(bmi < 35) {
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <2�ܰ� ��>�Դϴ�.");
			}
			else if(bmi >= 35) {
				JOptionPane.showMessageDialog(null, "����� BMI��" +s+"�̰�, <�� ��>�Դϴ�.");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
}
