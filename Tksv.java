package lab7;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Tksv extends Connect{

	public Tksv() {
		JFrame tk = new JFrame();
		tk.setSize(615,245);
		tk.setDefaultCloseOperation(tk.EXIT_ON_CLOSE);
		tk.setResizable(false);
		
		JMenuBar mnbar = new JMenuBar();
		tk.setJMenuBar(mnbar);
        JMenu mnt = new JMenu("Thoát");
        mnbar.add(mnt);
        mnt.addMenuListener(new MenuListener() {

			@Override
			public void menuSelected(MenuEvent e) {
				tk.setVisible(false);
				new Nhapsv();
			}
			@Override
			public void menuDeselected(MenuEvent e) {
			}
			@Override
			public void menuCanceled(MenuEvent e) {
			}
        });
        mnt.addSeparator();
		
        JPanel baogom = new JPanel();
        baogom.setBackground(Color.cyan);
        
		JLabel bg1 = new JLabel(" ");
		JLabel bg2 = new JLabel(" ");
		JLabel bg3 = new JLabel(" ");
		JLabel bg4 = new JLabel(" ");
		
		JPanel tong = new JPanel();
		tong.setLayout(new BorderLayout());
		tong.setBackground(Color.cyan);
		Border border = BorderFactory.createLineBorder(Color.blue);
		TitledBorder tBorder = BorderFactory.createTitledBorder(border, "");
		tong.setBorder(tBorder);
		
		JLabel t1 = new JLabel("            ");
		JLabel t2 = new JLabel("            ");
		JPanel t3 = new JPanel();
		t3.setLayout(new GridLayout(2,0));
		t3.setBackground(Color.cyan);
		JLabel t31 = new JLabel("THỐNG KÊ SINH VIÊN THUÊ/LƯU TRÚ",0);
		t31.setFont(new Font("Serif", Font.BOLD, 30));
		t3.add(t31);
		
		JPanel t4 = new JPanel();
		t4.setBackground(Color.cyan);
		t4.setLayout(new GridLayout(2,0));
		JLabel t41 = new JLabel(" ");
		t4.add(t41);
		
		JPanel tong1 = new JPanel();
		tong1.setLayout(new BorderLayout());
		
		JPanel tong2 = new JPanel();
		tong2.setLayout(new BorderLayout());
		
		JPanel trai = new JPanel();
		trai.setLayout(new BorderLayout());
		
		JTextField slsv = new JTextField("Số lượng sinh viên");
		slsv.setBackground(new Color(255,255,100));
		slsv.setEditable(false);
		
		JTextField slsv1 = new JTextField();
		slsv1.setBackground(Color.white);
		slsv1.setEditable(false);
		
		trai.add(slsv,BorderLayout.NORTH);
		trai.add(slsv1,BorderLayout.CENTER);
		
		JPanel gtvkh = new JPanel();
		gtvkh.setLayout(new GridLayout(0,2));
		
		JPanel gt = new JPanel();
		gt.setLayout(new GridLayout(2,0));
		JTextField GT = new JTextField("	Giới Tính");
		GT.setBackground(new Color(255,255,100));
		GT.setEditable(false);
		JPanel nn = new JPanel();
		nn.setLayout(new GridLayout(0,2));
		JTextField nam = new JTextField("            Nam");
		nam.setBackground(new Color(255,255,200));
		nam.setEditable(false);
		JTextField nu = new JTextField("              Nữ");
		nu.setBackground(new Color(255,255,200));
		nu.setEditable(false);
		
		JPanel khoa = new JPanel();
		khoa.setLayout(new GridLayout(2,0));
		JTextField KHOA = new JTextField("	Khoa");
		KHOA.setBackground(new Color(255,255,100));
		KHOA.setEditable(false);
		JPanel kh = new JPanel();
		kh.setLayout(new GridLayout(0,3));
		JTextField khmt = new JTextField("      KHMT");
		khmt.setBackground(new Color(255,255,200));
		khmt.setEditable(false);
		JTextField mtdt = new JTextField("  KTMT&ĐT");
		mtdt.setBackground(new Color(255,255,200));
		mtdt.setEditable(false);
		JTextField kts = new JTextField("KTS&TMĐT");
		kts.setBackground(new Color(255,255,200));
		kts.setEditable(false);
		
		nn.add(nam);
		nn.add(nu);
		gt.add(GT);
		gt.add(nn);
		
		kh.add(khmt);
		kh.add(mtdt);
		kh.add(kts);
		khoa.add(KHOA);
		khoa.add(kh);
		
		gtvkh.add(gt);
		gtvkh.add(khoa);
		
		JPanel gtvkh1 = new JPanel();
		gtvkh1.setLayout(new GridLayout(0,2));
		
		JPanel gt1 = new JPanel();
		gt1.setLayout(new GridLayout(0,2));
		JTextField nam1 = new JTextField();
		nam1.setBackground(Color.white);
		nam1.setEditable(false);
		JTextField nu1 = new JTextField();
		nu1.setBackground(Color.white);
		nu1.setEditable(false);
		
		JPanel khoa1 = new JPanel();
		khoa1.setLayout(new GridLayout(0,3));
		JTextField khmt1 = new JTextField();
		khmt1.setBackground(Color.white);
		khmt1.setEditable(false);
		JTextField mtdt1 = new JTextField();
		mtdt1.setBackground(Color.white);
		mtdt1.setEditable(false);
		JTextField kts1 = new JTextField();
		kts1.setBackground(Color.white);
		kts1.setEditable(false);
		
		gt1.add(nam1);
		gt1.add(nu1);

		khoa1.add(khmt1);
		khoa1.add(mtdt1);
		khoa1.add(kts1);
		
		gtvkh1.add(gt1);
		gtvkh1.add(khoa1);
		
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(MaSV) from SINHVIEN");
			while(rs.next() ) {
				slsv1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from SINHVIEN where GT= N'Nam'");
			while(rs.next() ) {
				nam1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			ResultSet rs1 = null;
			rs1 = stmt.executeQuery("SELECT COUNT(*) from SINHVIEN where GT= N'Nữ'");
			while(rs1.next() ) {
				nu1.setText(rs1.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from SINHVIEN where Khoa= N'Khoa Học Máy Tính'");
			while(rs.next() ) {
				khmt1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from SINHVIEN where Khoa= N'Kỹ Thuật Máy Tính Và Điện Tử'");
			while(rs.next() ) {
				mtdt1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from SINHVIEN where Khoa= N'Kinh Tế Số Và Thương Mại Điện Tử'");
			while(rs.next() ) {
				kts1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		baogom.add(tong,BorderLayout.CENTER);
		baogom.add(bg1,BorderLayout.WEST);
		baogom.add(bg2,BorderLayout.EAST);
		baogom.add(bg3,BorderLayout.NORTH);
		baogom.add(bg4,BorderLayout.SOUTH);
		
		tong2.add(gtvkh,BorderLayout.NORTH);
		tong2.add(gtvkh1,BorderLayout.CENTER);
		tong1.add(trai,BorderLayout.WEST);
		tong1.add(tong2,BorderLayout.CENTER);
		tong.add(tong1,BorderLayout.CENTER);
		tong.add(t1,BorderLayout.WEST);
		tong.add(t2,BorderLayout.EAST);
		tong.add(t3,BorderLayout.NORTH);
		tong.add(t4,BorderLayout.SOUTH);
		tk.setLocationRelativeTo(null);
		tk.add(baogom);
		tk.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tksv();
	}

}
