package lab7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
		Connection con;
		protected Statement stmt;
		public Connect() {
				try {
					String URL = "jdbc:sqlserver://LAPTOP-2KE8DT47:1433;databaseName=DoAnJaVa;user=sa;password=sa";
					con = DriverManager.getConnection(URL);
					this.stmt = con.createStatement();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		public Connection getCon() {
			return con;
		}
		public void setCon(Connection con) {
			this.con = con;
		}
		public ResultSet DATASV() {
			ResultSet rs = null;
			try {
				rs = this.stmt.executeQuery("select * from SINHVIEN");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}
		public ResultSet DATAP() {
			ResultSet rs = null;
			try {
				rs = this.stmt.executeQuery("select * from PHONG");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}
		public ResultSet DATATP() {
			ResultSet rs = null;
			try {
				rs = this.stmt.executeQuery("select * from TRAPHONG");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
		}
		
		public static void main(String args[]) {
		}
	}