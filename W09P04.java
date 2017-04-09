package java_homework;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class W09P04 extends JFrame implements ActionListener{
	JLabel jLabel = new JLabel("이름 : ");
	
	JTextField name = new JTextField(10);
	JLabel jLabel1 = new JLabel("연령대 : ");
	JLabel jLabel2 = new JLabel("성별 : ");
	JLabel jLabel3 = new JLabel("상담 내용 : ");
	JTextArea consult = new JTextArea(5, 20);
	JButton jButton = new JButton("등록");
	JRadioButton jRadioButton_male = new JRadioButton("남자");
	JRadioButton jRadioButton_female = new JRadioButton("여자");
	ButtonGroup buttonGroup = new ButtonGroup();
	JComboBox<String> combo = new JComboBox<String>(new String[]{"~10", "10~19", "20~29", "30~39","40~49","50~"});
	
	
	public W09P04(){
		setLayout(new GridLayout(3,0
				));
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(jLabel);
		jp1.add(name);
		jp1.add(jLabel1);
		jp1.add(combo);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(jLabel2);
		buttonGroup.add(jRadioButton_female);
		buttonGroup.add(jRadioButton_male);
		jp2.add(jRadioButton_female);
		jp2.add(jRadioButton_male);
		JPanel jp3 = new JPanel(new FlowLayout());		
		jp3.add(jLabel3);
		jp3.add(consult);
		jp3.add(jButton);
		add(jp1);
		add(jp2);
		add(jp3);
		jButton.addActionListener(this);
		setSize(300, 200);
//		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new W09P04().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			   FileWriter w=new FileWriter("C:/Users/kokihoon_KING/Desktop/StudentInfo.txt", true); 
			   w.write(System.currentTimeMillis()+"\t" + name.getText() +"\t"+ combo.getSelectedItem()+ "\t" + ((jRadioButton_male.isSelected())?jRadioButton_male.getText():jRadioButton_female.getText()) + "\t" + consult.getText()+"\r\n");
			   JOptionPane.showMessageDialog(null, "상담 등록 완료");
			   w.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}
		
	}
}
