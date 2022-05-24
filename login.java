package lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class login {
	JTextField tfUser;
	JPasswordField tfPass;
	
	public login() {
		JFrame frLogin = new JFrame("Đăng nhập");
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frLogin.setSize(580, 300);
		frLogin.setResizable(false);
		
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		
		JPanel Main0 = new JPanel();
		Main0.setBackground(Color.white);
		Main0.setLayout(new BorderLayout());
		
		JLabel logo = new JLabel("",0);
		ImageIcon iconLogo = new ImageIcon("D:\\Pictures\\doanjava\\logo1.png");
		logo.setIcon(iconLogo);
		
		JLabel nen = new JLabel();
		ImageIcon nen1 = new ImageIcon("D:\\Pictures\\doanjava\\nen.jpg");
		nen.setIcon(nen1);

		JPanel Main = new JPanel();
		Main.setLayout(new GridLayout(3, 1));

		JPanel pnLogin = new JPanel(new GridLayout(2, 2, 0, 5));
		Border border1 = BorderFactory.createLineBorder(Color.white);
		TitledBorder tBorder1 = BorderFactory.createTitledBorder(border1, "");
		pnLogin.setBackground(Color.white);
		pnLogin.setBorder(tBorder1);

		JLabel lbUser = new JLabel("Tên Đăng Nhập", new ImageIcon("D:\\Pictures\\doanjava\\user1.png"), 0);
		tfUser = new JTextField(15);
		lbUser.setForeground(new Color(0, 0, 200));
		pnLogin.add(lbUser);
		pnLogin.add(tfUser);

		JLabel lbPass = new JLabel("     Mật Khẩu     ", new ImageIcon("D:\\Pictures\\doanjava\\padlock2.png"), 0);
		tfPass = new JPasswordField("");
		lbPass.setForeground(new Color(0, 0, 200));
		pnLogin.add(lbPass);
		pnLogin.add(tfPass);

		JButton btnLogin = new JButton("Đăng Nhập");
		btnLogin.setBackground(Color.green);
		
		JButton btnCancel = new JButton("Thoát");
		btnCancel.setBackground(new Color(255, 80, 80));

		frLogin.add(pnLogin, BorderLayout.CENTER);

		JPanel Top = new JPanel();
		Top.setBackground(new Color(150, 205, 250));
		Top.setLayout(new BorderLayout());
		Top.setLayout(new GridLayout(1, 1));

		JLabel TieuDe = new JLabel("Quản Lý Lưu Trú, Thuê/Trả Ký Túc Xá", 0);
		TieuDe.setFont(new Font("Serif", Font.BOLD, 18));
		TieuDe.setForeground(new Color(255, 0, 0));
		Top.add(TieuDe);

		JCheckBox hmk = new JCheckBox("Hiển thị mật khẩu");
		hmk.setFont(new Font("Times New Roman", Font.BOLD, 15));

		JLabel An = new JLabel(" ");
		JPanel Loginunder = new JPanel();
		Loginunder.setLayout(new GridLayout(2, 2, 50, 0));
		Loginunder.setBackground(Color.white);
		Loginunder.add(hmk);
		Loginunder.add(An);
		Loginunder.add(btnCancel);
		hmk.setBackground(Color.white);
		Loginunder.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Đăng Nhập")) {
					String usename = tfUser.getText();
					String password = tfPass.getText();
					if (usename.trim().equals("ngohungso") && password.trim().equals("21it231")) {
						frLogin.setVisible(false);
						new Giaodien2();
					} else {
						JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu sai");
						tfUser.setText("");
						tfPass.setText("");
					}
				}
			}
		});
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Thoát")) {
					String usename = tfUser.getText();
					String password = tfPass.getText();
					if (usename.trim().equals("") && password.trim().equals("")) {
						int hoi = JOptionPane.showConfirmDialog(null,
								"Bạn có muốn thoát chương trình quản lý lưu trú, thuê/trả ký túc xá không?", null,
								JOptionPane.YES_NO_OPTION);
						if (hoi == JOptionPane.YES_OPTION) {
							frLogin.setVisible(false);
						}
					} else {
						tfUser.setText("");
						tfPass.setText("");
					}
				}
			}
		});
		hmk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (hmk.isSelected()) {
					tfPass.setEchoChar((char) 0);
				} else {
					tfPass.setEchoChar('*');
				}
			}
		});
		Main0.add(logo, BorderLayout.NORTH);
		Main0.add(nen, BorderLayout.CENTER);
		main.add(Main0, BorderLayout.WEST);
		main.add(Main, BorderLayout.CENTER);

		Main.add(Top);
		Main.add(pnLogin);
		Main.add(Loginunder);
		frLogin.add(main);
		frLogin.setLocationRelativeTo(null);
		frLogin.setVisible(true);
	}

	public static void main(String[] args) {
		new login();
	}

}
