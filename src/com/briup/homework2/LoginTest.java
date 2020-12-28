package com.briup.homework2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.briup.homework2.LoginService;

@SuppressWarnings("all")
public class LoginTest extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label1, label2, label3;// 用来当作用户名，密码
	private JButton jbt1, jbt2;// 两个按钮点击登录和注册
	private JTextField f1;// 用来输入用户名
	private JPasswordField pw1;
	private LoginService lgService = new LoginService();

	public LoginTest() {
		setTitle("登录界面");
		// setLayout(null);
		setBounds(700, 400, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
		setVisible(true);
	}

	private void init() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		label3 = new JLabel("欢迎你登录，快点地吧");
		label3.setFont(new Font("仿宋", Font.CENTER_BASELINE, 25));
		label3.setForeground(Color.orange);
		label3.setBounds(100, 20, 400, 100);
		label1 = new JLabel("用户名");
		label1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		label1.setBounds(50, 100, 70, 50);
		f1 = new JTextField();
		f1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 18));
		f1.setBounds(100, 100, 300, 30);
		label2 = new JLabel("密码");
		label2.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		label2.setBounds(50, 200, 70, 50);
		pw1 = new JPasswordField();
		pw1.setFont(new Font("", Font.CENTER_BASELINE, 18));
		pw1.setBounds(100, 200, 300, 30);
		jbt1 = new JButton("login");
		jbt1.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		jbt1.setBounds(100, 300, 100, 50);
		jbt2 = new JButton("regist");
		jbt2.setFont(new Font("仿宋", Font.CENTER_BASELINE, 15));
		jbt2.setBounds(300, 300, 100, 50);

		panel.add(label3);
		panel.add(label1);
		panel.add(f1);
		panel.add(label2);
		panel.add(pw1);
		panel.add(jbt1);
		panel.add(jbt2);

		super.add(panel);

		jbt1.addActionListener(this);
		jbt2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new RegistTest();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = f1.getText();
		String password = pw1.getText();
		try {
			lgService.login(name, password);
		} catch (Exception e1) {
			new ErrorFrame(e1.getMessage());
		}
	}

	public static void main(String[] args) {

		new LoginTest();
	}

}
