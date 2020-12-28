package com.briup.ch08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyTest extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label1, label2;
	private JTextField f1, f2, f3;
	private JButton btn;

	public MyTest() {
		setTitle("我的第一个GUI");
		setBounds(700, 300, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
		setVisible(true);
	}

	private void init() {
		panel = new JPanel();
		panel.setBackground(Color.green);
		label1 = new JLabel("+");
		label2 = new JLabel("=");
		f1 = new JTextField(3);
		f2 = new JTextField(3);
		f3 = new JTextField(3);
		btn = new JButton("计算");

		panel.add(f1);
		panel.add(label1);
		panel.add(f2);
		panel.add(label2);
		panel.add(f3);
		panel.add(btn);

		super.add(panel);

		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String v1 = f1.getText();
		String v2 = f2.getText();
		int result = Integer.parseInt(v1) + Integer.parseInt(v2);

		f3.setText(result + "");

	}

	public static void main(String[] args) {
		new MyTest();
	}

}
