package lab7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Giaodien2 {

	public Giaodien2() {
		JFrame jframe = new JFrame("QUẢN LÝ THUÊ/TRẢ KÝ TÚC XÁ");
		jframe.setSize(1055, 500);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

		JPanel jpnMain = new JPanel();
		jpnMain.setLayout(new BorderLayout());

		JPanel jpnLeft = new JPanel();
		jpnLeft.setBackground(new Color(255,255,200));
		jpnLeft.setLayout(new GridLayout(6,0,0,30));
		

		JLabel mn = new JLabel("MENU",0);
		mn.setFont(new Font("Serif", Font.BOLD, 28));
		mn.setForeground(Color.black);
		JButton nsv = new JButton("Lưu trú/thuê", new ImageIcon("D:\\Pictures\\doanjava\\nhap.png"));
		nsv.setBackground(Color.cyan);
		nsv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Nhap();
				jframe.setVisible(false);
			}
			});
		
		JButton htsv = new JButton("Trả phòng", new ImageIcon("D:\\Pictures\\doanjava\\traphong.png"));
		htsv.setBackground(new Color(0,255,170));
		htsv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TraPhong();
				jframe.setVisible(false);
			}
			});
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		
		jpnLeft.add(mn);
		jpnLeft.add(nsv);
		jpnLeft.add(htsv);
		jpnLeft.add(l1);
		jpnLeft.add(l2);
		jpnLeft.add(l3);
		
		JPanel jpnCenter = new JPanel();
		jpnCenter.setBackground(new Color(255,255,200));
		jpnCenter.setLayout(new BorderLayout());
		
		JLabel jlb1 = new JLabel(" ");
		
		JLabel jlb2 = new JLabel(" ");
		JLabel jlbQL = new JLabel();

		ImageIcon iconLogo = new ImageIcon("D:\\Pictures\\doanjava\\kitucxa1.png");
		jlbQL.setIcon(iconLogo);

		jpnCenter.add(jlb1, BorderLayout.NORTH);
		jpnCenter.add(jlbQL, BorderLayout.CENTER);
		jpnCenter.add(jlb2, BorderLayout.SOUTH);

		JPanel jpnRight = new JPanel();
		jpnRight.setLayout(new GridLayout(4, 0, 0, 80));
		jpnRight.setBackground(new Color(255,255,200));

		JButton jbtCancel = new JButton("Lối Thoát", new ImageIcon("D:\\Pictures\\doanjava\\exit.png"));
		jbtCancel.setBackground(new Color(255,130,150));
		jbtCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int hoi = JOptionPane.showConfirmDialog(null,
						"Bạn có muốn thoát không?", null,JOptionPane.YES_NO_OPTION);
				if (hoi == JOptionPane.YES_OPTION) {
					new login();
					jframe.setVisible(false);
				}
			}
		});

		JLabel jlbR1 = new JLabel();
		JLabel jlbR2 = new JLabel();
		JLabel jlbR3 = new JLabel();

		jpnRight.add(jlbR1);
		jpnRight.add(jlbR2);
		jpnRight.add(jlbR3);
		jpnRight.add(jbtCancel);

		jpnMain.add(jpnLeft, BorderLayout.WEST);
		jpnMain.add(jpnCenter, BorderLayout.CENTER);
		jpnMain.add(jpnRight, BorderLayout.EAST);

		jframe.setLocationRelativeTo(null);
		jframe.add(jpnMain);
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		new Giaodien2();
	}
}
