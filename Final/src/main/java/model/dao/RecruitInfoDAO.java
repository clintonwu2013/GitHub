package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class RecruitInfoDAO {
	private final String insert = "insert into recruit values(?,?,?)";
	DataSource ds = null;

	public RecruitInfoDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/final");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public void insertFile(String name, String phone, byte[] file) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = ds.getConnection();
			stmt = conn.prepareStatement(insert);
			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setBytes(3, file);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
