package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

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

public class Tkp extends Connect{

	public Tkp() {
		JFrame tk = new JFrame();
		tk.setSize(635,260);
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
				new Nhapp();
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
        
		JLabel bg1 = new JLabel("   ");
		JLabel bg2 = new JLabel(" ");
		JLabel bg3 = new JLabel(" ");
		JLabel bg4 = new JLabel(" ");
		
		JPanel tong = new JPanel();
		tong.setLayout(new BorderLayout());
		tong.setBackground(Color.cyan);
		Border border = BorderFactory.createLineBorder(Color.blue);
		TitledBorder tBorder = BorderFactory.createTitledBorder(border, "");
		tong.setBorder(tBorder);
		
		
		JLabel t1 = new JLabel("          ");
		JLabel t2 = new JLabel("          ");
		JPanel t3 = new JPanel();
		t3.setLayout(new GridLayout(2,0));
		t3.setBackground(Color.cyan);
		JLabel t31 = new JLabel("THỐNG KÊ PHÒNG THUÊ",0);
		t31.setFont(new Font("Serif", Font.BOLD, 28));
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
		
		JTextField slp = new JTextField("Số lượng phòng");
		slp.setBackground(new Color(255,255,100));
		slp.setEditable(false);
		
		JTextField slp1 = new JTextField();
		slp1.setBackground(Color.white);
		slp1.setEditable(false);
		
		trai.add(slp,BorderLayout.NORTH);
		trai.add(slp1,BorderLayout.CENTER);
		// Panel lop ---------------------------------------------------
		JPanel lptong = new JPanel();
		lptong.setLayout(new GridLayout(2,1));
		
		JPanel lp = new JPanel();
		lp.setLayout(new GridLayout(2,0));
		JTextField LP = new JTextField("        Loại phòng");
		LP.setBackground(new Color(255,255,100));
		LP.setEditable(false);
		JPanel dk = new JPanel();
		dk.setLayout(new GridLayout(0,2));
		JTextField dv = new JTextField("  Dịch vụ  ");
		dv.setBackground(new Color(255,255,200));
		dv.setEditable(false);
		JTextField kt = new JTextField("   Kí túc  ");
		kt.setBackground(new Color(255,255,200));
		kt.setEditable(false);
		
		JPanel lp1 = new JPanel();
		lp1.setLayout(new GridLayout(0,2));
		JTextField dv1 = new JTextField();
		dv1.setBackground(Color.white);
		dv1.setEditable(false);
		JTextField kt1 = new JTextField();
		kt1.setBackground(Color.white);
		kt1.setEditable(false);
		
		dk.add(dv);
		dk.add(kt);
		lp.add(LP);
		lp.add(dk);
		
		lp1.add(dv1);
		lp1.add(kt1);
		
		lptong.add(lp);
		lptong.add(lp1);
		//-------------------------------------------------------------------------
		// Panel sluong -----------------------------------------------------------
		JPanel sltong = new JPanel();
		sltong.setLayout(new GridLayout(2,1));
		
		JPanel sl = new JPanel();
		sl.setLayout(new GridLayout(2,1));
		JTextField SL = new JTextField("	Số lượng sinh viên trong phòng                           ");
		SL.setBackground(new Color(255,255,100));
		SL.setEditable(false);
		JPanel sv = new JPanel();
		sv.setLayout(new GridLayout(1,8));
		JTextField sv1 = new JTextField("1 SV");
		sv1.setBackground(new Color(255,255,200));
		sv1.setEditable(false);
		JTextField sv2 = new JTextField("2 SV");
		sv2.setBackground(new Color(255,255,200));
		sv2.setEditable(false);
		JTextField sv3 = new JTextField("3 SV");
		sv3.setBackground(new Color(255,255,200));
		sv3.setEditable(false);
		JTextField sv4 = new JTextField("4 SV");
		sv4.setBackground(new Color(255,255,200));
		sv4.setEditable(false);
		JTextField sv5 = new JTextField("5 SV");
		sv5.setBackground(new Color(255,255,200));
		sv5.setEditable(false);
		JTextField sv6 = new JTextField("6 SV");
		sv6.setBackground(new Color(255,255,200));
		sv6.setEditable(false);
		JTextField sv7 = new JTextField("7 SV");
		sv7.setBackground(new Color(255,255,200));
		sv7.setEditable(false);
		JTextField sv8 = new JTextField("8 SV");
		sv8.setBackground(new Color(255,255,200));
		sv8.setEditable(false);
		
		JPanel sl1 = new JPanel();
		sl1.setLayout(new GridLayout(0,8));
		JTextField sv11 = new JTextField();
		sv11.setBackground(Color.white);
		sv11.setEditable(false);
		JTextField sv21 = new JTextField();
		sv21.setBackground(Color.white);
		sv21.setEditable(false);
		JTextField sv31 = new JTextField();
		sv31.setBackground(Color.white);
		sv31.setEditable(false);
		JTextField sv41 = new JTextField();
		sv41.setBackground(Color.white);
		sv41.setEditable(false);
		JTextField sv51 = new JTextField();
		sv51.setBackground(Color.white);
		sv51.setEditable(false);
		JTextField sv61 = new JTextField();
		sv61.setBackground(Color.white);
		sv61.setEditable(false);
		JTextField sv71 = new JTextField();
		sv71.setBackground(Color.white);
		sv71.setEditable(false);
		JTextField sv81 = new JTextField();
		sv81.setBackground(Color.white);
		sv81.setEditable(false);
		
		sv.add(sv1);
		sv.add(sv2);
		sv.add(sv3);
		sv.add(sv4);
		sv.add(sv5);
		sv.add(sv6);
		sv.add(sv7);
		sv.add(sv8);
		
		sl.add(SL);
		sl.add(sv);
		
		sl1.add(sv11);
		sl1.add(sv21);
		sl1.add(sv31);
		sl1.add(sv41);
		sl1.add(sv51);
		sl1.add(sv61);
		sl1.add(sv71);
		sl1.add(sv81);
		
		sltong.add(sl);
		sltong.add(sl1);
		//--------------------------------------------------------------------------
		JPanel lpvsl = new JPanel();
		lpvsl.setLayout(new BorderLayout());
		
		lpvsl.add(lptong,BorderLayout.WEST);
		lpvsl.add(sltong,BorderLayout.CENTER);
		
		
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(MaPhong) from PHONG");
			while(rs.next() ) {
				slp1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where LoaiPhong= N'Dịch Vụ'");
			while(rs.next() ) {
				dv1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs1 = null;
			rs1 = stmt.executeQuery("SELECT COUNT(*) from PHONG where LoaiPhong= N'Kí Túc'");
			while(rs1.next() ) {
				kt1.setText(rs1.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 1 ");
			while(rs.next() ) {
				sv11.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 2");
			while(rs.next() ) {
				sv21.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 3");
			while(rs.next() ) {
				sv31.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 4");
			while(rs.next() ) {
				sv41.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 5");
			while(rs.next() ) {
				sv51.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 6");
			while(rs.next() ) {
				sv61.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 7");
			while(rs.next() ) {
				sv71.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) from PHONG where SoLSV= 8");
			while(rs.next() ) {
				sv81.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		baogom.add(tong,BorderLayout.CENTER);
		baogom.add(bg1,BorderLayout.WEST);
		baogom.add(bg2,BorderLayout.EAST);
		baogom.add(bg3,BorderLayout.NORTH);
		baogom.add(bg4,BorderLayout.SOUTH);
		
		tong2.add(lpvsl,BorderLayout.CENTER);
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
		new Tkp();
	}
}
