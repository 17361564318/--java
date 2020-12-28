package com.briup.homework2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sun.org.apache.bcel.internal.generic.F2D;

import sun.net.www.content.image.jpeg;

public class RegistTest extends JFrame implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label1, label2;// 用来当作用户名，密码
	private JButton jbt1, jbt2;// 两个按钮点击确定和清空
	private JTextField t1;// 用来输入用户名
	private JPasswordField p1;
	private RegistService service = new RegistService();

	public RegistTest() {
		frame = new JFrame();
		frame.setTitle("注册");
		// setLayout(null);
		frame.setBounds(200, 400, 500, 500);
		this.init();
		frame.setVisible(true);
	}

	private void init() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		label1 = new JLabel("请输入用户名");
		label1.setFont(new Font("宋体", Font.CENTER_BASELINE, 15));
		label1.setBounds(50, 100, 150, 50);
		t1 = new JTextField();
		t1.setFont(new Font("宋体", Font.CENTER_BASELINE, 18));
		t1.setBounds(200, 100, 200, 30);
		label2 = new JLabel("请输入密码");
		label2.setFont(new Font("宋体", Font.CENTER_BASELINE, 15));
		label2.setBounds(50, 200, 150, 50);
		p1 = new JPasswordField();
		p1.setFont(new Font("", Font.CENTER_BASELINE, 18));
		p1.setBounds(200, 200, 200, 30);
		jbt1 = new JButton("确定");
		jbt1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		jbt1.setBounds(100, 300, 100, 50);
		jbt2 = new JButton("清空");
		jbt2.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		jbt2.setBounds(300, 300, 100, 50);
		panel.add(label1);
		panel.add(t1);
		panel.add(label2);
		panel.add(p1);
		panel.add(jbt1);
		panel.add(jbt2);

		frame.add(panel);
		jbt1.addActionListener(this);
		jbt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				p1.setText("");
			}
		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {

		String n = t1.getText();
		String p = p1.getText();
		try {
			service.regist(n, p);
		} catch (Exception e1) {
			new ErrorFrame(e1.getMessage());
		}

	}

	public static void main(String[] args) {
		new RegistTest();
	}

}
