package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Nhap {
	
	
public Nhap() {
	JFrame jframe2 = new JFrame("Nhập Thông Tin");
	jframe2.setSize(900, 400);
	jframe2.setResizable(false);
	jframe2.setDefaultCloseOperation(jframe2.EXIT_ON_CLOSE);
	
	JPanel Main = new JPanel();
	Main.setLayout(new BorderLayout());
	Main.setBackground(new Color(0,220,255));
	
	JPanel Main1 = new JPanel();
	Main1.setLayout(new GridLayout(1,2));
	Main1.setBackground(new Color(0,220,255));
	
	JPanel jpnMain = new JPanel();
	jpnMain.setLayout(new BorderLayout());
	jpnMain.setBackground(new Color(0,220,255));
	
	JLabel n1 = new JLabel("   ");
	JLabel n2 = new JLabel("         ");
	JLabel jlbsv = new JLabel();
	ImageIcon iconLogo = new ImageIcon("D:\\Pictures\\doanjava\\chsv2.png");
	jlbsv.setIcon(iconLogo);
	
	JPanel bt1 = new JPanel();
	bt1.setLayout(new BorderLayout());
	bt1.setBackground(new Color(0,220,255));
	
	JLabel btl1 = new JLabel("           ");
	JLabel btl2 = new JLabel("                 ");
	JLabel btl3 = new JLabel(" ");
	JButton nsv = new JButton("   Thông Tin Sinh Viên     ", new ImageIcon("D:\\Pictures\\doanjava\\sv.png"));
	nsv.setBackground(Color.white);
	nsv.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			jframe2.setVisible(false);
			new Nhapsv();
		}
	});
	
	bt1.add(btl1,BorderLayout.WEST);
	bt1.add(nsv,BorderLayout.CENTER);
	bt1.add(btl2,BorderLayout.EAST);
	bt1.add(btl3,BorderLayout.NORTH);
	
	jpnMain.add(jlbsv,BorderLayout.CENTER);
	jpnMain.add(bt1,BorderLayout.SOUTH);
	jpnMain.add(n1,BorderLayout.WEST);
	jpnMain.add(n2,BorderLayout.EAST);
	
	JPanel jpnMain1 = new JPanel();
	jpnMain1.setLayout(new BorderLayout());
	jpnMain1.setBackground(new Color(0,220,255));
	
	JLabel n3 = new JLabel("         ");
	JLabel n4 = new JLabel("   ");
	JLabel jlbP = new JLabel();
	ImageIcon iconLogo1 = new ImageIcon("D:\\Pictures\\doanjava\\chp1.png");
	jlbP.setIcon(iconLogo1);
	
	JPanel bt2 = new JPanel();
	bt2.setLayout(new BorderLayout());
	bt2.setBackground(new Color(0,220,255));
	
	JLabel btl4 = new JLabel("                 ");
	JLabel btl5 = new JLabel("           ");
	JLabel btl6 = new JLabel(" ");
	JButton np = new JButton("   Thông Tin Phòng     ", new ImageIcon("D:\\Pictures\\doanjava\\p.png"));
	np.setBackground(Color.white);
	np.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Nhapp();
			jframe2.setVisible(false);
		}
	});
	
	bt2.add(btl4,BorderLayout.WEST);
	bt2.add(np,BorderLayout.CENTER);
	bt2.add(btl5,BorderLayout.EAST);
	bt2.add(btl6,BorderLayout.NORTH);
	
	jpnMain1.add(jlbP,BorderLayout.CENTER);
	jpnMain1.add(bt2,BorderLayout.SOUTH);
	jpnMain1.add(n3,BorderLayout.WEST);
	jpnMain1.add(n4,BorderLayout.EAST);
	
	JPanel jpnRight = new JPanel();
	jpnRight.setLayout(new BorderLayout());
	jpnRight.setBackground(new Color(0,220,255));
	
	JPanel jpnRight1 = new JPanel();
	jpnRight1.setLayout(new GridLayout(6,0,0,15));
	jpnRight1.setBackground(new Color(0,220,255));
	JButton Cancel = new JButton("Về giao diện", new ImageIcon("D:\\Pictures\\doanjava\\home1.png"));
	Cancel.setBackground(Color.white);
	Cancel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát về giao diện chính không?", null,
					JOptionPane.YES_NO_OPTION);
			if (hoi == JOptionPane.YES_OPTION) {
				new Giaodien2();
				jframe2.setVisible(false);
				
			}
		}
	});
	JLabel t1 = new JLabel();
	JLabel t2 = new JLabel();
	JLabel t3 = new JLabel();
	JLabel t4 = new JLabel();
	JLabel t5 = new JLabel();
	JLabel t6 = new JLabel("   ");
	JLabel t7 = new JLabel("   ");
	
	jpnRight1.add(t1);
	jpnRight1.add(t2);
	jpnRight1.add(t3);
	jpnRight1.add(t4);
	jpnRight1.add(t5);
	jpnRight1.add(Cancel);
	jpnRight.add(jpnRight1,BorderLayout.CENTER);
	jpnRight.add(t6,BorderLayout.WEST);
	jpnRight.add(t7,BorderLayout.EAST);
	
	JPanel jpnUp = new JPanel();
	jpnUp.setLayout(new GridLayout(2,0));
	jpnUp.setBackground(new Color(0,220,255));
	
	JLabel up1 = new JLabel(" ");
	
	jpnUp.add(up1);
	
	JPanel jpnDown = new JPanel();
	jpnDown.setLayout(new GridLayout(2,0));
	jpnDown.setBackground(new Color(0,220,255));
	
	JLabel down1 = new JLabel(" ");
	
	jpnDown.add(down1);
	
	JPanel jpnLeft = new JPanel();
	jpnLeft.setLayout(new GridLayout(1,0));
	jpnLeft.setBackground(new Color(0,220,255));
	
	JLabel l1 = new JLabel("             ");
	
	jpnLeft.add(l1);
	
	
	Main1.add(jpnMain );
	Main1.add(jpnMain1);
	Main.add(jpnRight ,BorderLayout.EAST);
	Main.add(jpnDown ,BorderLayout.SOUTH);
	Main.add(jpnUp ,BorderLayout.NORTH);
	Main.add(jpnLeft ,BorderLayout.WEST);
	
	Main.add(Main1,BorderLayout.CENTER);
	jframe2.setLocationRelativeTo(null);
	jframe2.add(Main);
	jframe2.setVisible(true);
}
	public static void main(String[] args) {
		new Nhap();
	}

}
