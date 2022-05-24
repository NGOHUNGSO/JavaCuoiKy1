package lab7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class Nhapp extends Connect{
public Nhapp() {
	JFrame jframe1 = new JFrame("Nhập Thông Tin Phòng");
	jframe1.setSize(1200, 800);
	jframe1.setResizable(false);
	jframe1.setDefaultCloseOperation(jframe1.EXIT_ON_CLOSE);
	
	JMenuBar mnbar = new JMenuBar();
	jframe1.setJMenuBar(mnbar);
    JMenu mntc = new JMenu("Tùy chọn");
    JMenu mnht = new JMenu("Hỗ trợ");
    JMenu mntk = new JMenu("Thống kê");
    mntk.addMenuListener(new MenuListener() {

		@Override
		public void menuSelected(MenuEvent e) {
			jframe1.setVisible(false);
			new Tkp();
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
			JOptionPane.showMessageDialog(null,"Số điện thoại liên hệ: 0369876543");
		}
    });
    mnfb.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Facebook liên hệ: Admin");
		}
    });
	
	JPanel tong = new JPanel();
	tong.setLayout(new GridLayout(3, 1));
	
	JPanel Main = new JPanel();
	Main.setLayout(new GridLayout(1, 2));
	
	JPanel anh = new JPanel();
	anh.setLayout(new BorderLayout());
	Border border3 = BorderFactory.createLineBorder(Color.cyan);
	TitledBorder tBorder3 = BorderFactory.createTitledBorder(border3, "");
	anh.setBorder(tBorder3);
	anh.setBackground(Color.cyan);
	JLabel anh1 = new JLabel();
	ImageIcon icon = new ImageIcon("D:\\Pictures\\doanjava\\p2.png");
	anh1.setIcon(icon);
	anh.add(anh1);
	Main.add(anh);
	
	JPanel jpnMain = new JPanel();
	jpnMain.setLayout(new BorderLayout());
	Border border = BorderFactory.createLineBorder(Color.blue);
	TitledBorder tBorder = BorderFactory.createTitledBorder(border, "Giao diện người dùng");
	jpnMain.setBorder(tBorder);
	jpnMain.setBackground(Color.cyan);

	JPanel jpnLeft = new JPanel();
	jpnLeft.setBackground(Color.white);
	jpnLeft.setLayout(new GridLayout(13, 0));

	JLabel jlbmp = new JLabel("    Mã Phòng");
	JLabel jlblp = new JLabel("    Loại Phòng");
	JLabel jlbkhu = new JLabel("    Khu");
	JLabel jlbtang = new JLabel("    Tầng");
	JLabel jlbslsv = new JLabel("    Số Lượng SV    ");
	JLabel jlbsv1 = new JLabel("    Mã Sinh Viên 1");
	JLabel jlbsv2 = new JLabel("    Mã Sinh Viên 2");
	JLabel jlbsv3 = new JLabel("    Mã Sinh Viên 3");
	JLabel jlbsv4 = new JLabel("    Mã Sinh Viên 4");
	JLabel jlbsv5 = new JLabel("    Mã Sinh Viên 5");
	JLabel jlbsv6 = new JLabel("    Mã Sinh Viên 6");
	JLabel jlbsv7 = new JLabel("    Mã Sinh Viên 7");
	JLabel jlbsv8 = new JLabel("    Mã Sinh Viên 8");
	
	jpnLeft.add(jlbmp);
	jpnLeft.add(jlblp);
	jpnLeft.add(jlbkhu);
	jpnLeft.add(jlbtang);
	jpnLeft.add(jlbslsv);
	jpnLeft.add(jlbsv1);
	jpnLeft.add(jlbsv2);
	jpnLeft.add(jlbsv3);
	jpnLeft.add(jlbsv4);
	jpnLeft.add(jlbsv5);
	jpnLeft.add(jlbsv6);
	jpnLeft.add(jlbsv7);
	jpnLeft.add(jlbsv8);

	JPanel jpnCenter = new JPanel();
	jpnCenter.setBackground(Color.white);
	jpnCenter.setLayout(new GridLayout(13, 0));

	JTextField jtfmp = new JTextField();
	JPanel jpnlp = new JPanel();
	jpnlp.setLayout(new GridLayout(1, 0));
	String string[] = { "Dịch Vụ", "Kí Túc"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox jcb = new JComboBox(string);
	jpnlp.add(jcb);
	jcb.setBackground(Color.white);
	JPanel jpnslsv = new JPanel();
	jpnslsv.setLayout(new GridLayout(1, 0));
	String string1[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox jcb1 = new JComboBox(string1);
	jpnslsv.add(jcb1);
	jcb1.setBackground(Color.white);
	JTextField jtfkhu = new JTextField(2);
	JTextField jtftang = new JTextField(1);
	JTextField jtfM1 = new JTextField(50);
	JTextField jtfM2 = new JTextField(50);
	JTextField jtfM3 = new JTextField(50);
	JTextField jtfM4 = new JTextField(50);
	JTextField jtfM5 = new JTextField(50);
	JTextField jtfM6 = new JTextField(50);
	JTextField jtfM7 = new JTextField(50);
	JTextField jtfM8 = new JTextField(50);
	
	jpnCenter.add(jtfmp);
	jpnCenter.add(jpnlp);
	jpnCenter.add(jtfkhu);
	jpnCenter.add(jtftang);
	jpnCenter.add(jpnslsv);
	jpnCenter.add(jtfM1);
	jpnCenter.add(jtfM2);
	jpnCenter.add(jtfM3);
	jpnCenter.add(jtfM4);
	jpnCenter.add(jtfM5);
	jpnCenter.add(jtfM6);
	jpnCenter.add(jtfM7);
	jpnCenter.add(jtfM8);
	
	JPanel jpnRight = new JPanel();
	jpnRight.setBackground(Color.white);
	jpnRight.setLayout(new BorderLayout());
	
	JLabel p1 = new JLabel("       ");
	JLabel p2 = new JLabel("       ");

	JPanel jpnRight1 = new JPanel();
	jpnRight1.setBackground(Color.white);
	jpnRight1.setLayout(new GridLayout(5, 0, 0, 5));
	
	JButton jbtCancel = new JButton("Thoát về trước", new ImageIcon("D:\\Pictures\\doanjava\\back2.png"));
	jbtCancel.setBackground(Color.white);
	jbtCancel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int hoi = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát về trước không?", null,
					JOptionPane.YES_NO_OPTION);
			if (hoi == JOptionPane.YES_OPTION) {
				new Nhap();
				jframe1.setVisible(false);
			}
		}
	});

	JButton jbtthem = new JButton("    Thêm               ", new ImageIcon("D:\\Pictures\\doanjava\\themp2.png"));
	jbtthem.setBackground(Color.white);
	JButton jbtsua = new JButton("      Sửa               ", new ImageIcon("D:\\Pictures\\doanjava\\suap.png"));
	jbtsua.setBackground(Color.white);
	JButton jbtxoa = new JButton("        Xóa             ", new ImageIcon("D:\\Pictures\\doanjava\\xoa4.png"));
	jbtxoa.setBackground(Color.white);
	JButton jbtclear = new JButton("    Làm Rỗng       ", new ImageIcon("D:\\Pictures\\doanjava\\lamrong1.png"));
	jbtclear.setBackground(Color.white);
	
	
	jpnRight1.add(jbtthem);
	jpnRight1.add(jbtsua);
	jpnRight1.add(jbtxoa);
	jpnRight1.add(jbtclear);
	jpnRight1.add(jbtCancel);
	
	jpnRight.add(p1,BorderLayout.WEST);
	jpnRight.add(jpnRight1);
	jpnRight.add(p2,BorderLayout.EAST);

	jpnMain.add(jpnLeft, BorderLayout.WEST);
	jpnMain.add(jpnCenter, BorderLayout.CENTER);
	jpnMain.add(jpnRight, BorderLayout.EAST);

	Main.add(jpnMain);

	DefaultTableModel dm = new DefaultTableModel();
	
	dm.addColumn("Mã Phòng");
	
	dm.addColumn("Loại Phòng");
	dm.addColumn("Khu");
	dm.addColumn("Tầng");
	dm.addColumn("Số lượng SV");
	dm.addColumn("Mã Sinh Viên 1");
	dm.addColumn("Mã Sinh Viên 2");
	dm.addColumn("Mã Sinh Viên 3");
	dm.addColumn("Mã Sinh Viên 4");
	dm.addColumn("Mã Sinh Viên 5");
	dm.addColumn("Mã Sinh Viên 6");
	dm.addColumn("Mã Sinh Viên 7");
	dm.addColumn("Mã Sinh Viên 8");
	Connect con = new Connect();
	ResultSet rs = con.DATAP();
	
	try {
		while(rs.next()) {
			dm.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
		}
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	// bang-----------------------------------------------------------------------------------
	JPanel bottom = new JPanel();
	bottom.setLayout(new BorderLayout());
	Border border1 = BorderFactory.createLineBorder(Color.blue);
	TitledBorder tBorder1 = BorderFactory.createTitledBorder(border1, "Thông tin phòng đã nhập");
	bottom.setBorder(tBorder1);
	bottom.setBackground(Color.cyan);
	JTable table = new JTable(dm);
	
	table.setBackground(Color.white);
	JScrollPane sc = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	sc.setBackground(Color.white);
	
	bottom.add(sc);
	Main.add(bottom);
	//timkiem --------------------------------------------------------------------------
	JPanel timkiem = new JPanel();
	timkiem.setLayout(new BorderLayout());
	Border border4 = BorderFactory.createLineBorder(Color.blue);
	TitledBorder tBorder4 = BorderFactory.createTitledBorder(border4, "Tìm kiếm");
	timkiem.setBorder(tBorder4);
	timkiem.setBackground(Color.cyan);
	
	JLabel tk1 = new JLabel("             ");
	JLabel tk2 = new JLabel("             ");
	JLabel tk3 = new JLabel(" ");
	
	JPanel tim = new JPanel();
	tim.setLayout(new BorderLayout());
	JPanel ma = new JPanel();
	ma.setBackground(Color.cyan);
	ma.setLayout(new BorderLayout());
	
	JLabel b1 = new JLabel("                                                 ");
	JLabel b2 = new JLabel("                                                 ");
	JLabel b3 = new JLabel(" ");
	
	JPanel tma = new JPanel();
	tma.setBackground(Color.white);
	tma.setLayout(new BorderLayout());
	
	JLabel tp = new JLabel("     Nhập thông tin cần tìm :        ");
	JTextField tp1 = new JTextField();
	
	JPanel nutt = new JPanel();
	nutt.setBackground(Color.cyan);
	nutt.setLayout(new BorderLayout());
	JButton jbttim = new JButton("   Tìm Kiếm        ", new ImageIcon("D:\\Pictures\\doanjava\\timp2.png"));
	jbttim.setBackground(Color.white);
	JLabel nut1 = new JLabel("      ");
	JLabel nut2 = new JLabel("      ");
	
	
	JPanel bang = new JPanel();
	bang.setLayout(new BorderLayout());
	
	DefaultTableModel dmtk = new DefaultTableModel();
	
	dmtk.addColumn("Mã Phòng");
	dmtk.addColumn("Loại Phòng");
	dmtk.addColumn("Khu");
	dmtk.addColumn("Tầng");
	dmtk.addColumn("Số lượng SV");
	dmtk.addColumn("Mã Sinh Viên 1");
	dmtk.addColumn("Mã Sinh Viên 2");
	dmtk.addColumn("Mã Sinh Viên 3");
	dmtk.addColumn("Mã Sinh Viên 4");
	dmtk.addColumn("Mã Sinh Viên 5");
	dmtk.addColumn("Mã Sinh Viên 6");
	dmtk.addColumn("Mã Sinh Viên 7");
	dmtk.addColumn("Mã Sinh Viên 8");
	
	JTable tabletk = new JTable(dmtk);

	tabletk.setBackground(Color.white);
	JScrollPane sctk = new JScrollPane(tabletk, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	sctk.setBackground(Color.white);

	sctk.setViewportView(tabletk);
	tabletk.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	tabletk.getColumnModel().getColumn(0).setPreferredWidth(80);
	tabletk.getColumnModel().getColumn(1).setPreferredWidth(112);
	tabletk.getColumnModel().getColumn(2).setPreferredWidth(60);
	tabletk.getColumnModel().getColumn(3).setPreferredWidth(60);
	tabletk.getColumnModel().getColumn(4).setPreferredWidth(80);
	tabletk.getColumnModel().getColumn(5).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(6).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(7).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(8).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(9).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(10).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(11).setPreferredWidth(85);
	tabletk.getColumnModel().getColumn(12).setPreferredWidth(85);
	
	bang.add(sctk);
	
	tim.add(ma,BorderLayout.NORTH);
	ma.add(b1,BorderLayout.WEST);
	ma.add(b2,BorderLayout.EAST);
	ma.add(b3,BorderLayout.SOUTH);
	ma.add(tma,BorderLayout.NORTH);
	tma.add(tp,BorderLayout.WEST);
	tma.add(tp1,BorderLayout.CENTER);
	tma.add(nutt,BorderLayout.EAST);
	nutt.add(jbttim,BorderLayout.CENTER);
	nutt.add(nut1,BorderLayout.WEST);
	nutt.add(nut2,BorderLayout.EAST);
	
	tim.add(bang,BorderLayout.CENTER);
	
	timkiem.add(tim,BorderLayout.CENTER);
	timkiem.add(tk1,BorderLayout.WEST);
	timkiem.add(tk2,BorderLayout.EAST);
	timkiem.add(tk3,BorderLayout.SOUTH);
	
	jbtthem.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(jtfmp.getText().equals("") || jtfkhu.getText().equals("") || jtftang.getText().equals("") || jtfM1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Hãy nhập đầy đủ thông tin.");
			}else {
			try {
				stmt.executeUpdate("insert into PHONG values(\'"+jtfmp.getText()+"\',N\'"+((String) jcb.getSelectedItem())+"\'"
						+ ",\'"+jtfkhu.getText()+"\',\'"+jtftang.getText()+"\',\'"+((String) jcb1.getSelectedItem())+"\'"
						+ ",\'"+jtfM1.getText()+"\',\'"+jtfM2.getText()+"\',\'"+jtfM3.getText()+"\',\'"+jtfM4.getText()+"\'"
						+ ",\'"+jtfM5.getText()+"\',\'"+jtfM6.getText()+"\',\'"+jtfM7.getText()+"\',\'"+jtfM8.getText()+"\')");
				dm.addRow(new String[] { jtfmp.getText(), ((String) jcb.getSelectedItem()), jtfkhu.getText(),
						jtftang.getText(),((String) jcb1.getSelectedItem()),jtfM1.getText(),jtfM2.getText(),jtfM3.getText()
						,jtfM4.getText(),jtfM5.getText(),jtfM6.getText(),jtfM7.getText(),jtfM8.getText()});
			}catch(SQLException e1) {
				JOptionPane.showMessageDialog(null,e1);
			}
			jtfmp.setText("");
			jcb.setSelectedItem("Dịch Vụ");
			jtfkhu.setText("");
			jtftang.setText("");
			jcb1.setSelectedItem("0");
			jtfM1.setText("");
			jtfM2.setText("");
			jtfM3.setText("");
			jtfM4.setText("");
			jtfM5.setText("");
			jtfM6.setText("");
			jtfM7.setText("");
			jtfM8.setText("");
		}
		}
	});
	jbtsua.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int row = table.getSelectedRow();
			if(row==-1) {
				JOptionPane.showMessageDialog(null,"Hãy chọn một thông tin trong bảng trước để có thể sửa.");
			}else {
			try {
				stmt.executeUpdate("update PHONG set LoaiPhong= N\'"+((String) jcb.getSelectedItem())+"\'"
						+ ",Khu=\'"+jtfkhu.getText()+"\',Tang=\'"+jtftang.getText()+"\',SoLSV=\'"+((String) jcb1.getSelectedItem())+"\'"
						+ ",M1=\'"+jtfM1.getText()+"\',M2=\'"+jtfM2.getText()+"\',M3=\'"+jtfM3.getText()+"\',M4=\'"+jtfM4.getText()+"\'"
						+ ",M5=\'"+jtfM5.getText()+"\',M6=\'"+jtfM6.getText()+"\',M7=\'"+jtfM7.getText()+"\',M8=\'"+jtfM8.getText()+"\'"
						+ "where MaPhong=\'"+jtfmp.getText()+"\'");
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.removeRow(row);
				dm.addRow(new String[] { jtfmp.getText(), ((String) jcb.getSelectedItem()), jtfkhu.getText(),
						jtftang.getText(),((String) jcb1.getSelectedItem()),jtfM1.getText(),jtfM2.getText(),jtfM3.getText()
						,jtfM4.getText(),jtfM5.getText(),jtfM6.getText(),jtfM7.getText(),jtfM8.getText()});
			
			}catch(SQLException e1) {
				JOptionPane.showMessageDialog(null,e1);
			}
			jtfmp.setText("");
			jcb.setSelectedItem("Dịch Vụ");
			jtfkhu.setText("");
			jtftang.setText("");
			jcb1.setSelectedItem("0");
			jtfM1.setText("");
			jtfM2.setText("");
			jtfM3.setText("");
			jtfM4.setText("");
			jtfM5.setText("");
			jtfM6.setText("");
			jtfM7.setText("");
			jtfM8.setText("");
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
				stmt.executeUpdate("delete from PHONG where MaPhong=\'"+jtfmp.getText()+"\'");
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.removeRow(row);
			}catch(SQLException e3) {
				JOptionPane.showMessageDialog(null,e3);
			}
			jtfmp.setText("");
			jcb.setSelectedItem("Dịch Vụ");
			jtfkhu.setText("");
			jtftang.setText("");
			jcb1.setSelectedItem("0");
			jtfM1.setText("");
			jtfM2.setText("");
			jtfM3.setText("");
			jtfM4.setText("");
			jtfM5.setText("");
			jtfM6.setText("");
			jtfM7.setText("");
			jtfM8.setText("");
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
				
				rs = stmt.executeQuery("select * from PHONG where MaPhong = N\'"+tp1.getText()+"\' or LoaiPhong = N\'"+tp1.getText()+"\'"
						+ " or Khu = N\'"+tp1.getText()+"\'"
						+ " or M1 = \'"+tp1.getText()+"\' or M2 = \'"+tp1.getText()+"\' or M3 = \'"+tp1.getText()+"\' or M4 = \'"+tp1.getText()+"\'"
						+ " or M5 = \'"+tp1.getText()+"\' or M6 = \'"+tp1.getText()+"\' or M7 = \'"+tp1.getText()+"\' or M8 = \'"+tp1.getText()+"\'");
					
				if(tp1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Không có phòng này hoặc bạn ghi sai thông tin");
				}else {
						while(rs.next()) {
						dmtk.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
						dem++;
						}
				 if(dem==0) {
					 JOptionPane.showMessageDialog(null, "Không có phòng này hoặc bạn ghi sai thông tin");
				 }
				}
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null,e3);
			}
			}
	});
	table.addMouseListener(new MouseListener()
	{
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			int row = table.getSelectedRow();
			jtfmp.setText((String)table.getValueAt(row,0));
			jcb.setSelectedItem((String) table.getValueAt(row, 1));
			jtfkhu.setText((String)table.getValueAt(row,2));
			jtftang.setText((String)table.getValueAt(row,3));
			jcb1.setSelectedItem((String) table.getValueAt(row, 4));
			jtfM1.setText((String)table.getValueAt(row,5));
			jtfM2.setText((String)table.getValueAt(row,6));
			jtfM3.setText((String)table.getValueAt(row,7));
			jtfM4.setText((String)table.getValueAt(row,8));
			jtfM5.setText((String)table.getValueAt(row,9));
			jtfM6.setText((String)table.getValueAt(row,10));
			jtfM7.setText((String)table.getValueAt(row,11));
			jtfM8.setText((String)table.getValueAt(row,12));
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
	jbtclear.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			jtfmp.setText(null);
			jcb.setSelectedItem("Dịch Vụ");
			jtfkhu.setText(null);
			jtftang.setText(null);
			jcb1.setSelectedItem("0");
			jtfM1.setText(null);
			jtfM2.setText(null);
			jtfM3.setText(null);
			jtfM4.setText(null);
			jtfM5.setText(null);
			jtfM6.setText(null);
			jtfM7.setText(null);
			jtfM8.setText(null);
		}
	});
	tong.add(Main);
	tong.add(bottom);
	tong.add(timkiem);
	jframe1.setLocationRelativeTo(null);
	jframe1.add(tong);
	jframe1.setVisible(true);
}
	public static void main(String[] args) {
		new Nhapp();
	}

}
