package fordatabase;

import java.sql.*;
import java.io.*;
import fordevice.*;

public class ConnectDB {
	private static ConnectDB instance = new ConnectDB();
	
	public static ConnectDB getInstance() {
		return instance;
	}

	public ConnectDB() {}
	String driveName = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost:3306/ngcom";
	String dbID = "root";
	String dbPW = "qwerty123";
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	
	public void create(String deviceCategory){
			String sqlCT = null;
			Device device = null;
			try {
			Class.forName(driveName);
			conn = DriverManager.getConnection(jdbcUrl, dbID, dbPW);
		
			
			
			switch(deviceCategory) {
			case "COMPUTERCASE":
				device = new COMPUTERCASE();
				sqlCT = device.getSqlCT();
				break;
			case "CPU":
				device = new CPU();
				sqlCT = device.getSqlCT();
				break;
			case "HDDISK":
				device = new HDDISK();
				sqlCT = device.getSqlCT();
				break;
			case "MAINBOARD":
				device = new MAINBOARD();
				sqlCT = device.getSqlCT();
				break;
			case "MEMORY":
				device = new MEMORY();
				sqlCT = device.getSqlCT();
				break;
			case "POWER":
				device = new POWER();
				sqlCT = device.getSqlCT();
				break;
			case "SSDISK":
				device = new SSDISK();
				sqlCT = device.getSqlCT();
				break;
			case "VGA":
				device = new VGA();
				sqlCT = device.getSqlCT();
				break;
			default:
				break;
			}
			
			if(sqlCT != null) {
				stmt = conn.createStatement();
				stmt.executeUpdate(sqlCT);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlCT != null) sqlCT = null;
			if(stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
	}	
	public void insert(String deviceCategory, String csvFileName) {
		try {
			Class.forName(driveName);
			conn = DriverManager.getConnection(jdbcUrl, dbID, dbPW);
			stmt = conn.createStatement();

			BufferedReader in = new BufferedReader(new FileReader(csvFileName));
			String csvStr = null;

			Device device = null;
			String sqlInsert = null;
			switch(deviceCategory) {
			case "CASE":
				device = new COMPUTERCASE();
				break;
			case "CPU":
				device = new CPU();
				break;
			case "HDDISK":
				device = new HDDISK();
				break;
			case "MAINBOARD":
				device = new MAINBOARD();
				break;
			case "MEMORY":
				device = new MEMORY();
				break;
			case "POWER":
				device = new POWER();
				break;
			case "SSDISK":
				device = new SSDISK();
				break;
			case "VGA":
				device = new VGA();
				break;
			default:
				break;
			}
			
			while((csvStr = in.readLine()) != null) {
				device.setElement(csvStr);
				sqlInsert = device.getSqlInsert();
				device.printElement();
				stmt.executeUpdate(sqlInsert);
			}
			
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
	}
	 
}