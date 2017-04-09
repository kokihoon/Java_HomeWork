package java_homework;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.text.AbstractDocument.BranchElement;

public class W09P03 extends JFrame implements ActionListener{
	JTextField jTextField = new JTextField(20);
	JTextArea jTextArea = new JTextArea("",20,30);
	JButton jButton = new JButton("Load");
	JScrollPane scrollPane = new JScrollPane(jTextArea);
	JComboBox combo = new JComboBox();

	public W09P03() {
		setLayout(new FlowLayout());
		add(jTextField);
		combo.addItem("EUC-KR");
		combo.addItem("UTF-8");
		add(combo);
		add(jButton);
		add(scrollPane);
		jButton.addActionListener(this);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new W09P03().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String path = jTextField.getText();
		File file = new File(path);
		try {
	
			String line = null;

			if(combo.getSelectedItem() == "EUC-KR") {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
				jTextArea.setText("");
				
				while((line = br.readLine()) != null) {
					jTextArea.append(line + "\n");
				}
				br.close();
			}
			else{
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
				jTextArea.setText("");
				while((line = br.readLine()) != null) {
					jTextArea.append(line + "\n");
				}
				br.close();
			}
			
		}
		catch (Exception e1) {
			System.out.println("error");
		}
	}
}
