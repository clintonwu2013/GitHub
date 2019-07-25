package tw.tsunglin.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import tw.tsunglin.bean.Car;

public class CarService {
	
	DataSource ds = null;

	public CarService() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/cars");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	private static final String select = "SELECT * FROM cars";
	public List<Car> search(String keyWord){
		
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		Car car = null;
		List<Car> cars = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			cars = new ArrayList<Car>();
			while(rs.next()) {
				car = new Car();
				car.setId(rs.getInt(1));
				car.setMake(rs.getString(2));
				car.setModel(rs.getString(3));
				car.setPreview(rs.getString(4));
				car.setPrice(rs.getInt(5));
				car.setDescription(rs.getString(6));
				cars.add(car);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cars;
		
	}
}
