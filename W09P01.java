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

public class W09P01 extends JFrame implements ActionListener{
	JTextField jTextField = new JTextField(10);
	JLabel jLabel = new JLabel("¿Âµµ ÀÔ·Â");
	JButton jButton1 = new JButton("È­¾¾ º¯È¯");
	JButton jButton3 = new JButton("¼·¾¾ º¯È¯");
	public W09P01() {
		setLayout(new FlowLayout());
		add(jLabel);
		add(jTextField);
		add(jButton1);
		add(jButton3);
		jButton1.addActionListener(this);
		jButton3.addActionListener(this);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new W09P01().setVisible(true);
	}
	public double change(String text) {
		double d = Double.parseDouble(text);
	
		return 0;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getSource() == jButton1){
				double d = Double.parseDouble(jTextField.getText()) * 1.8 +32;
				
				JOptionPane.showMessageDialog(null, d + "F");
			}
			if(e.getSource() == jButton3){
				double d = (Double.parseDouble(jTextField.getText()) - 32) / 1.8;
				JOptionPane.showMessageDialog(null, d + "C");		
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}