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

public class Tktp extends Connect{

	public Tktp() {
		JFrame tk = new JFrame();
		tk.setSize(370,240);
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
				new TraPhong();
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
        baogom.setBackground(new Color(0, 255, 170));
        
		JLabel bg1 = new JLabel("   ");
		JLabel bg2 = new JLabel(" ");
		JLabel bg3 = new JLabel(" ");
		JLabel bg4 = new JLabel(" ");
		
		JPanel tong = new JPanel();
		tong.setLayout(new BorderLayout());
		tong.setBackground(new Color(0, 255, 170));
		
		Border border = BorderFactory.createLineBorder(new Color(0, 176, 0));
		TitledBorder tBorder = BorderFactory.createTitledBorder(border, "");
		tong.setBorder(tBorder);
		
		JLabel t1 = new JLabel("           ");
		JLabel t2 = new JLabel("           ");
		JPanel t3 = new JPanel();
		t3.setLayout(new GridLayout(2,0));
		t3.setBackground(new Color(0, 255, 170));
		JLabel t31 = new JLabel("THỐNG KÊ SINH VIÊN TRẢ PHÒNG",0);
		t31.setFont(new Font("Serif", Font.BOLD, 20));
		t3.add(t31);
		
		JPanel t4 = new JPanel();
		t4.setBackground(new Color(0, 255, 170));
		t4.setLayout(new GridLayout(2,0));
		JLabel t41 = new JLabel(" ");
		t4.add(t41);
		
		JPanel tong2 = new JPanel();
		tong2.setLayout(new BorderLayout());
		
		JPanel TK = new JPanel();
		TK.setLayout(new BorderLayout());
		// SLSV ---------------------------------------------------------------
		JTextField slsv = new JTextField("Số lượng sinh viên");
		slsv.setBackground(new Color(255,255,100));
		slsv.setEditable(false);
		
		JTextField slsv1 = new JTextField();
		slsv1.setBackground(Color.white);
		slsv1.setEditable(false);
		
		JPanel trai1 = new JPanel();
		trai1.setLayout(new BorderLayout());
		trai1.add(slsv,BorderLayout.NORTH);
		trai1.add(slsv1,BorderLayout.CENTER);
		// KHOA HOC-------------------------------------------------------------
		JPanel giua = new JPanel();
		giua.setLayout(new GridLayout(2,0));
		
		JPanel giua1 = new JPanel();
		giua1.setLayout(new GridLayout(2,0));
		JTextField KHOAHOC = new JTextField("                   Khóa học");
		KHOAHOC.setBackground(new Color(255,255,100));
		KHOAHOC.setEditable(false);
		JPanel khh = new JPanel();
		khh.setLayout(new GridLayout(0,4));
		JTextField k21 = new JTextField("  K21");
		k21.setBackground(new Color(255,255,200));
		k21.setEditable(false);
		JTextField k20 = new JTextField("  K20");
		k20.setBackground(new Color(255,255,200));
		k20.setEditable(false);
		JTextField k19 = new JTextField("  K19");
		k19.setBackground(new Color(255,255,200));
		k19.setEditable(false);
		JTextField k18 = new JTextField("  K18");
		k18.setBackground(new Color(255,255,200));
		k18.setEditable(false);
		
		giua1.add(KHOAHOC);
		giua1.add(khh);
		
		khh.add(k21);
		khh.add(k20);
		khh.add(k19);
		khh.add(k18);
		
		JPanel giua2 = new JPanel();
		giua2.setLayout(new GridLayout(0,4));
		JTextField kk21 = new JTextField();
		kk21.setBackground(Color.white);
		kk21.setEditable(false);
		JTextField kk20 = new JTextField();
		kk20.setBackground(Color.white);
		kk20.setEditable(false);
		JTextField kk19 = new JTextField();
		kk19.setBackground(Color.white);
		kk19.setEditable(false);
		JTextField kk18 = new JTextField();
		kk18.setBackground(Color.white);
		kk18.setEditable(false);
		
		giua2.add(kk21);
		giua2.add(kk20);
		giua2.add(kk19);
		giua2.add(kk18);
		
		giua.add(giua1);
		giua.add(giua2);
		
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(MaSV) from TRAPHONG");
			while(rs.next() ) {
				slsv1.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) FROM TRAPHONG WHERE MaSV LIKE '21%'");
			while(rs.next() ) {
				kk21.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) FROM TRAPHONG WHERE MaSV LIKE '20%'");
			while(rs.next() ) {
				kk20.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) FROM TRAPHONG WHERE MaSV LIKE '19%'");
			while(rs.next() ) {
				kk19.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			ResultSet rs = null;
			rs = stmt.executeQuery("SELECT COUNT(*) FROM TRAPHONG WHERE MaSV LIKE '18%'");
			while(rs.next() ) {
				kk18.setText(rs.getString(1));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		TK.add(trai1,BorderLayout.WEST);
		TK.add(giua,BorderLayout.CENTER);
		
		baogom.add(tong,BorderLayout.CENTER);
		baogom.add(bg1,BorderLayout.WEST);
		baogom.add(bg2,BorderLayout.EAST);
		baogom.add(bg3,BorderLayout.NORTH);
		baogom.add(bg4,BorderLayout.SOUTH);
		
		tong.add(TK,BorderLayout.CENTER);
		tong.add(t1,BorderLayout.WEST);
		tong.add(t2,BorderLayout.EAST);
		tong.add(t3,BorderLayout.NORTH);
		tong.add(t4,BorderLayout.SOUTH);
		tk.setLocationRelativeTo(null);
		tk.add(baogom);
		tk.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tktp();
	}

}
