package com.briup.homework2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	// 三个标签，分别显示学生。班级。成绩。
	// 两个文本框。用来分别显示，班级里做一个下拉框用于选择
	// 一个按钮，查询
	private JLabel l1, l2, l3;
	private JTextField t1, t2;
	private JComboBox<String> cmBox;
	private JButton jbButton, j2, j3;
	private JPanel panel;

	public MainFrame() {
		setTitle("学生管理系统");
		setBounds(700, 300, 600, 500);
		this.Init();
		setVisible(true);
	}

	@SuppressWarnings("all")
	public void Init() {
		panel = new JPanel();
		panel.setLayout(null);
		l1 = new JLabel("姓名");
		l1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 20));
		l1.setBounds(50, 50, 70, 50);
		t1 = new JTextField();
		t1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 18));
		t1.setBounds(200, 50, 300, 50);
		l2 = new JLabel("班级");
		l2.setFont(new Font("仿宋", Font.CENTER_BASELINE, 20));
		l2.setBounds(50, 150, 70, 50);
		cmBox = new JComboBox(); 
		cmBox.addItem("请选择班级");
		cmBox.addItem("JAVAEE");
		cmBox.addItem("web前端");
		cmBox.addItem("BIGDATA");
		cmBox.setBounds(200, 150,300, 50);
		l3 = new JLabel("成绩");
		l3.setFont(new Font("仿宋", Font.CENTER_BASELINE, 20));
		l3.setBounds(50, 250, 70, 50);
		t2 = new JTextField();
		t2.setFont(new Font("仿宋", Font.CENTER_BASELINE, 18));
		t2.setBounds(200, 250, 300, 50);
		jbButton = new JButton("列表");
		jbButton.setFont(new Font("宋体", Font.CENTER_BASELINE, 20));
		jbButton.setBounds(120, 350, 80, 50);
		j2 = new JButton("录入");
		j2.setFont(new Font("宋体", Font.CENTER_BASELINE, 20));
		j2.setBounds(250, 350, 80, 50);
		j3 = new JButton("均分");
		j3.setFont(new Font("宋体", Font.CENTER_BASELINE, 20));
		j3.setBounds(380, 350, 80, 50);
		panel.add(l1);
		panel.add(t1);
		panel.add(l2);
		panel.add(cmBox);
		panel.add(l3);
		panel.add(t2);
		panel.add(jbButton);
		panel.add(j2);
		panel.add(j3);

		this.add(panel);

		jbButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

	}

	public static void main(String[] args) {
		new MainFrame();
	}

}
