package patterns.structure.flyweight;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection(); // Get a connection from pool
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("select name, passwd from user");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.release(conn); // Release the connection
	}

}
