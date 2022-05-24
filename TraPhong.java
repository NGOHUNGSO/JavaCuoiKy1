package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableModel;

public class TraPhong extends Connect {
	private float result;
	private JTextField jtfgd, jtfgn, jtfgp, tongtien;

	public TraPhong() {

		JFrame jframe1 = new JFrame("Nhập Sinh Viên Trả Phòng");
		jframe1.setSize(1300, 600);
		jframe1.setResizable(false);
		jframe1.setDefaultCloseOperation(jframe1.EXIT_ON_CLOSE);
		jframe1.setLocationRelativeTo(null);

		JMenuBar mnbar = new JMenuBar();
		jframe1.setJMenuBar(mnbar);
		JMenu mntc = new JMenu("Tùy chọn");
		JMenu mnht = new JMenu("Hỗ trợ");
		JMenu mntk = new JMenu("Thống kê");
		mntk.addMenuListener(new MenuListener() {

			@Override
			public void menuSelected(MenuEvent e) {
				jframe1.setVisible(false);
				new Tktp();
			}
			@Override
			public void menuDeselected(MenuEvent e) {
			}
			@Override
			public void menuCanceled(MenuEvent e) {
			}
        });
		mnbar.add(mntc);
		mnbar.add(mnht);
		mnbar.add(mntk);
		JMenuItem mntgd = new JMenuItem("Tới giao diện");
		JMenuItem mntldn = new JMenuItem("Trở lại đăng nhập");
		JMenuItem mnt = new JMenuItem("Thoát chương trình");
		mntc.add(mntgd);
		mntc.add(mntldn);
		mntc.add(mnt);
		JMenuItem mnsdt = new JMenuItem("Số điện thoại");
		JMenuItem mnfb = new JMenuItem("Facebook");
		mnht.add(mnsdt);
		mnht.add(mnfb);
		mntc.addSeparator();

		mntgd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe1.setVisible(false);
				new Giaodien2();
			}
		});
		mntldn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe1.setVisible(false);
				new login();
			}
		});
		mnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnsdt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Số điện thoại liên hệ: 0369876543");
			}
		});
		mnfb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Facebook liên hệ: Admin");
			}
		});

		JPanel Main = new JPanel();
		Main.setLayout(new GridLayout(1, 2));

		JPanel Main1 = new JPanel();
		Main1.setLayout(new GridLayout(2, 1));
		Border border4 = BorderFactory.createLineBorder(new Color(0, 176, 0));
		TitledBorder tBorder4 = BorderFactory.createTitledBorder(border4, "Giao diện người dùng");
		tBorder4.setTitleColor(Color.black);
		Main1.setBorder(tBorder4);
		Main1.setBackground(new Color(0, 255, 170));
		
		JPanel Main2 = new JPanel();
		Main2.setLayout(new GridLayout(1, 2));

		JPanel jpnMain = new JPanel();
		jpnMain.setLayout(new BorderLayout());
		jpnMain.setBackground(new Color(0, 255, 170));

		JPanel jpnLeft = new JPanel();
		jpnLeft.setBackground(Color.white);
		jpnLeft.setLayout(new GridLayout(4, 0, 0, 10));

		JLabel jlbmsv = new JLabel("    Mã Sinh Viên   ");
		JLabel jlbmp = new JLabel("    Mã Phòng");
		JLabel jlbtt = new JLabel("    Tình Trạng");

		jpnLeft.add(jlbmsv);
		jpnLeft.add(jlbmp);
		jpnLeft.add(jlbtt);

		JPanel jpnCenter = new JPanel();
		jpnCenter.setBackground(Color.white);
		jpnCenter.setLayout(new GridLayout(4, 0, 0, 10));

		JTextField jtfsv = new JTextField();
		JTextField jtfp = new JTextField();
		JTextField jtftt = new JTextField();

		jpnCenter.add(jtfsv);
		jpnCenter.add(jtfp);
		jpnCenter.add(jtftt);

		JPanel jpnMain1 = new JPanel();
		jpnMain1.setLayout(new BorderLayout());
		
		jpnMain1.setBackground(new Color(0, 255, 170));

		JPanel jpnLeft1 = new JPanel();
		jpnLeft1.setBackground(Color.white);
		jpnLeft1.setLayout(new GridLayout(4, 0, 0, 10));

		JLabel jlbgd = new JLabel("    Giá Điện(nghìn)");
		JLabel jlbgn = new JLabel("    Giá Nước(nghìn)");
		JLabel jlbgp = new JLabel("    Giá Phòng(nghìn)  ");
		JLabel jlbtg = new JLabel("    Tổng Giá(nghìn)");

		jpnLeft1.add(jlbgd);
		jpnLeft1.add(jlbgn);
		jpnLeft1.add(jlbgp);
		jpnLeft1.add(jlbtg);

		JPanel jpnCenter1 = new JPanel();
		jpnCenter1.setBackground(Color.white);
		jpnCenter1.setLayout(new GridLayout(4, 0, 0, 10));

		jtfgd = new JTextField();
		jtfgn = new JTextField();
		jtfgp = new JTextField();
		tongtien = new JTextField(30);
		tongtien.setEditable(false);

		jpnCenter1.add(jtfgd);
		jpnCenter1.add(jtfgn);
		jpnCenter1.add(jtfgp);
		jpnCenter1.add(tongtien);
		jpnMain1.add(jpnLeft1, BorderLayout.WEST);
		jpnMain1.add(jpnCenter1, BorderLayout.CENTER);

		JPanel jpnRight = new JPanel();
		jpnRight.setBackground(Color.white);
		jpnRight.setLayout(new BorderLayout());

		JButton jbtCancel = new JButton(" Thoát", new ImageIcon("D:\\Pictures\\doanjava\\back3.png"));
		jbtCancel.setBackground(Color.white);
		jbtCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát về trước không?", null,
						JOptionPane.YES_NO_OPTION);
				if (hoi == JOptionPane.YES_OPTION) {
					new Giaodien2();
					jframe1.setVisible(false);
				}
			}
		});

		JButton jbtthem = new JButton(" Thêm  ", new ImageIcon("D:\\Pictures\\doanjava\\them5.png"));
		jbtthem.setBackground(Color.white);
		JButton jbtsua = new JButton(" Sửa  ", new ImageIcon("D:\\Pictures\\doanjava\\suatr.png"));
		jbtsua.setBackground(Color.white);
		JButton jbtxoa = new JButton(" Xóa  ", new ImageIcon("D:\\Pictures\\doanjava\\xoa4.png"));
		jbtxoa.setBackground(Color.white);
		JButton jbtrong = new JButton("Làm Rỗng", new ImageIcon("D:\\Pictures\\doanjava\\lamrong1.png"));
		jbtrong.setBackground(Color.white);
		
		// TIMKIEM------------------------------------------------------
		JPanel timkiem = new JPanel();
		timkiem.setLayout(new BorderLayout());
		Border border2 = BorderFactory.createLineBorder(new Color(0, 176, 0));
		TitledBorder tBorder2 = BorderFactory.createTitledBorder(border2, "Tìm kiếm");
		timkiem.setBorder(tBorder2);
		timkiem.setBackground(new Color(0, 255, 170));
		
		JLabel tk1 = new JLabel("      ");
		JLabel tk2 = new JLabel("      ");
		JLabel tk3 = new JLabel(" ");
		
		JPanel tim = new JPanel();
		tim.setLayout(new BorderLayout());
		JPanel ma = new JPanel();
		ma.setBackground(new Color(0, 255, 170));
		ma.setLayout(new BorderLayout());
		
		JLabel b1 = new JLabel("        ");
		JLabel b2 = new JLabel("        ");
		JLabel b3 = new JLabel(" ");
		
		JPanel tma = new JPanel();
		tma.setBackground(Color.white);
		tma.setLayout(new BorderLayout());
		
		JLabel tsvt = new JLabel("     Mã sinh viên :        ");
		JTextField tsvt2 = new JTextField();
		JButton jbttim = new JButton("Tìm kiếm", new ImageIcon("D:\\Pictures\\doanjava\\timtr.png"));
		jbttim.setBackground(Color.white);
		JPanel nutt = new JPanel();
		nutt.setBackground(new Color(0, 255, 170));
		nutt.setLayout(new BorderLayout());
		
		JLabel nut1 = new JLabel("      ");
		JLabel nut2 = new JLabel("      ");
		
		
		JPanel bang = new JPanel();
		bang.setLayout(new BorderLayout());
		
		DefaultTableModel dmtk = new DefaultTableModel();
		
		dmtk.addColumn("Mã Sinh Viên");
		dmtk.addColumn("Mã Phòng");
		dmtk.addColumn("Tình Trạng");
		dmtk.addColumn("Giá Điện");
		dmtk.addColumn("Giá Nước");
		dmtk.addColumn("Giá Phòng");
		dmtk.addColumn("Tổng Tiền");
		
		JTable tabletk = new JTable(dmtk);

		tabletk.setBackground(Color.white);
		JScrollPane sctk = new JScrollPane(tabletk, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sctk.setBackground(Color.white);

		sctk.setViewportView(tabletk);
		tabletk.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tabletk.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabletk.getColumnModel().getColumn(1).setPreferredWidth(75);
		tabletk.getColumnModel().getColumn(2).setPreferredWidth(142);
		tabletk.getColumnModel().getColumn(3).setPreferredWidth(70);
		tabletk.getColumnModel().getColumn(4).setPreferredWidth(70);
		tabletk.getColumnModel().getColumn(5).setPreferredWidth(70);
		tabletk.getColumnModel().getColumn(6).setPreferredWidth(70);
		
		bang.add(sctk);
		
		tim.add(ma,BorderLayout.NORTH);

		ma.add(b1,BorderLayout.WEST);
		ma.add(b2,BorderLayout.EAST);
		ma.add(b3,BorderLayout.SOUTH);
		ma.add(tma,BorderLayout.CENTER);
		tma.add(tsvt,BorderLayout.WEST);
		tma.add(tsvt2,BorderLayout.CENTER);
		tma.add(nutt,BorderLayout.EAST);
		nutt.add(jbttim,BorderLayout.CENTER);
		nutt.add(nut1,BorderLayout.WEST);
		nutt.add(nut2,BorderLayout.EAST);
		
		tim.add(bang,BorderLayout.CENTER);
		
		timkiem.add(tim,BorderLayout.CENTER);
		timkiem.add(tk1,BorderLayout.WEST);
		timkiem.add(tk2,BorderLayout.EAST);
		timkiem.add(tk3,BorderLayout.SOUTH);
		//--------------------------------------------------------
		// NUT-----------------------------------------------
		JPanel jpnRight1 = new JPanel();
		jpnRight1.setBackground(Color.white);
		jpnRight1.setLayout(new GridLayout(2,0));
		
		JLabel a1 = new JLabel("                ");
		JLabel a2 = new JLabel("                ");
		JLabel a3 = new JLabel(" ");
		
		JPanel jpnRight2 = new JPanel();
		jpnRight2.setBackground(Color.white);
		jpnRight2.setLayout(new BorderLayout());
		
		JPanel jpnRight3 = new JPanel();
		jpnRight3.setBackground(Color.white);
		jpnRight3.setLayout(new GridLayout(0,3,65,0));
		
		jpnRight3.add(jbtthem);
		jpnRight3.add(jbtsua);
		jpnRight3.add(jbtxoa);
		jpnRight2.add(jpnRight3,BorderLayout.CENTER);
		jpnRight2.add(a1,BorderLayout.WEST);
		jpnRight2.add(a2,BorderLayout.EAST);
		jpnRight2.add(a3,BorderLayout.NORTH);
		jpnRight1.add(jpnRight2);
		
		JLabel a5 = new JLabel("                ");
		JLabel a6 = new JLabel("                                    ");
		JLabel a7 = new JLabel("                                    ");
		JLabel a8 = new JLabel(" ");
		
		JPanel jpnRight5 = new JPanel();
		jpnRight5.setBackground(Color.white);
		jpnRight5.setLayout(new BorderLayout());
		
		JPanel jpnRight6 = new JPanel();
		jpnRight6.setBackground(Color.white);
		jpnRight6.setLayout(new GridLayout(0,2,105,0));
		
		jpnRight6.add(jbtrong);
		jpnRight6.add(jbtCancel);
		jpnRight5.add(jpnRight6,BorderLayout.CENTER);
		jpnRight5.add(a6,BorderLayout.WEST);
		jpnRight5.add(a7,BorderLayout.EAST);
		jpnRight5.add(a8,BorderLayout.NORTH);
		jpnRight1.add(jpnRight5);
		
		jpnRight.add(jpnRight1, BorderLayout.CENTER);
		jpnRight.add(a5,BorderLayout.SOUTH);

		jpnMain.add(jpnLeft, BorderLayout.WEST);
		jpnMain.add(jpnCenter, BorderLayout.CENTER);
		
		JPanel Main0 = new JPanel();
		Main0.setLayout(new GridLayout(2,1));
		
		Main2.add(jpnMain);
		Main2.add(jpnMain1);
		Main0.add(Main1);
		Main0.add(timkiem);
		Main1.add(Main2);
		Main1.add(jpnRight);
	
		Main.add(Main0);
		
		DefaultTableModel dm = new DefaultTableModel();

		dm.addColumn("Mã Sinh Viên");
		dm.addColumn("Mã Phòng");
		dm.addColumn("Tình Trạng");
		dm.addColumn("Giá Điện");
		dm.addColumn("Giá Nước");
		dm.addColumn("Giá Phòng");
		dm.addColumn("Tổng Tiền");

		JTable table = new JTable(dm);
		// KETNOI----------------------------------------
		Connect con = new Connect();
		ResultSet rs = con.DATATP();

		try {
			while (rs.next()) {
				dm.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7) });
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// bang------------------------------------------------------------------------------------
		table.setBackground(Color.white);
		JScrollPane sc = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sc.setBackground(Color.white);
		
		sc.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0, 255, 170));
		bottom.setLayout(new BorderLayout());
		
		JPanel tbl = new JPanel();
		tbl.setBackground(new Color(0, 255, 170));
		tbl.setLayout(new BorderLayout());
		Border border1 = BorderFactory.createLineBorder(new Color(0, 176, 0));
		TitledBorder tBorder1 = BorderFactory.createTitledBorder(border1, "Thông tin sinh viên đã nhập");
		tbl.setBorder(tBorder1);
		tbl.add(sc);
		// ANH-----------------------------
		JPanel anh = new JPanel();
		anh.setBackground(new Color(0, 255, 170));
		anh.setLayout(new BorderLayout());
		
		JLabel jlbanh = new JLabel();
		ImageIcon iconLogo = new ImageIcon("D:\\Pictures\\doanjava\\anhtp2.png");
		jlbanh.setIcon(iconLogo);
		
		anh.add(jlbanh);
		//----------------------------------
		Main.add(bottom);
		bottom.add(anh,BorderLayout.NORTH);
		bottom.add(tbl,BorderLayout.CENTER);

		jbtthem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(jtfsv.getText().equals("") || jtfp.getText().equals("") || jtftt.getText().equals("") || jtfgd.getText().equals("") || jtfgn.getText().equals("") || jtfgp.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Hãy nhập đầy đủ thông tin.");
				}else {
				try {
					Tongtien();
					stmt.executeUpdate("insert into TRAPHONG values (\'" + jtfsv.getText()
							+ "\'" + ",\'" + jtfp.getText() + "\',N\'" + jtftt.getText() + "\',\'" + jtfgd.getText()
							+ "\',\'" + jtfgn.getText() + "\'" + ",\'" + jtfgp.getText() + "\',\'" + tongtien.getText()
							+ "\')");
					dm.addRow(new String[] { jtfsv.getText(), jtfp.getText(), jtftt.getText(),
							jtfgd.getText(), jtfgn.getText(), jtfgp.getText(), tongtien.getText() });
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,e1);
				}
				jtfsv.setText("");
				jtfp.setText("");
				jtftt.setText("");
				jtfgd.setText("");
				jtfgn.setText("");
				jtfgp.setText("");
				tongtien.setText("");
			}
			}
		});
		jbtsua.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(jtfsv.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Hãy chọn một thông tin trong bảng trước để có thể sửa.");
				}else {
				try {
					Tongtien();
					stmt.executeUpdate("update TRAPHONG set MaPhong=\'"
							+ jtfp.getText() + "\'" + ",TinhTrang= N\'" + jtftt.getText() + "\',GDien=\'"
							+ jtfgd.getText() + "\',GNuoc=\'" + jtfgn.getText() + "\'" + ",GPhong=\'" + jtfgp.getText()
							+ "\',TongGia=\'" + tongtien.getText() + "\' where MaSV=\'" + jtfsv.getText() + "\'");
					int row = table.getSelectedRow();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.removeRow(row);
					dm.addRow(new String[] {jtfsv.getText(), jtfp.getText(), jtftt.getText(),
							jtfgd.getText(), jtfgn.getText(), jtfgp.getText(), tongtien.getText() });
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(null,e2);
				}
				jtfsv.setText("");
				jtfp.setText("");
				jtftt.setText("");
				jtfgd.setText("");
				jtfgn.setText("");
				jtfgp.setText("");
				tongtien.setText("");
			}
			}
		});
		jbtxoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if(row==-1) {
					JOptionPane.showMessageDialog(null,"Hãy chọn một thông tin trong bảng trước để có thể xóa.");
				}else {
				try {
					stmt.executeUpdate("delete from TRAPHONG where (MaSV=\'" + jtfsv.getText() + "\')");
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.removeRow(row);
				} catch (SQLException e3) {
					JOptionPane.showMessageDialog(null,e3);
				}
				jtfsv.setText("");
				jtfp.setText("");
				jtftt.setText("");
				jtfgd.setText("");
				jtfgn.setText("");
				jtfgp.setText("");
				tongtien.setText("");
			}
			}
		});
		jbttim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int dem=0;
				try {
					DefaultTableModel model = (DefaultTableModel) tabletk.getModel();
					model.setRowCount(0);
					ResultSet rs = null;
					rs = stmt.executeQuery("select * from TRAPHONG where MaSV= \'"+tsvt2.getText()+"\' or MaPhong= N\'"+tsvt2.getText()+"\' or TinhTrang= N\'"+tsvt2.getText()+"\'");
					if(tsvt2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Không có người trả này hoặc bạn ghi sai thông tin");
					}else {
						while(rs.next()) {
						dmtk.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
						dem++;
						}
						if(dem==0) {
							JOptionPane.showMessageDialog(null, "Không có người trả này hoặc bạn ghi sai thông tin");
						}
					}
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null,e3);
				}
			}
		});
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				jtfsv.setText((String) table.getValueAt(row, 0));
				jtfp.setText((String) table.getValueAt(row, 1));
				jtftt.setText((String) table.getValueAt(row, 2));
				jtfgd.setText((String) table.getValueAt(row, 3));
				jtfgn.setText((String) table.getValueAt(row, 4));
				jtfgp.setText((String) table.getValueAt(row, 5));
				tongtien.setText((String) table.getValueAt(row, 6));
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		jbtrong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtfsv.setText("");
				jtfp.setText("");
				jtftt.setText("");
				jtfgd.setText("");
				jtfgn.setText("");
				jtfgp.setText("");
				tongtien.setText("");
			}
		});
		jframe1.setLocationRelativeTo(null);
		jframe1.add(Main);
		jframe1.setVisible(true);
	}

	public void Tongtien() {
		result = Float.parseFloat(jtfgd.getText()) + Float.parseFloat(jtfgn.getText())
				+ Float.parseFloat(jtfgp.getText());
		tongtien.setText(String.valueOf(result));
	}

	public static void main(String[] args) {
		new TraPhong();
	}

}
