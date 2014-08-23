package patterns.structure.flyweight;

import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Simple Connection Pool Demo
 * 
 * @author Charles Chen
 * 
 */
public class ConnectionPool {
	// Database Driver
	private final String DRIVER = "com.mysql.jdbc.Driver";
	// Database connection url
	private final String URL = "jdbc:mysql://127.0.0.1:3306/test";
	// Database login user name
	private final String USER = "root";
	// Database login password
	private final String PASSWD = "2426";

	// Initial pool size
	private final int INIT_SIZE = 100;
	// Maximum retry times while getting a connection
	private final int MAX_RETRY = 3;

	private Vector<Connection> pool = null; // For storage connections

	/**
	 * Constructor. Create connection instance
	 */
	private ConnectionPool() {
		pool = new Vector<Connection>();
		try {
			for (int i = 0; i < INIT_SIZE; i++) {
				Class.forName(DRIVER);
				Connection connection = DriverManager.getConnection(URL, USER,
						PASSWD);
				pool.add(connection);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * Create connection pool instance
	 * 
	 * @author Charles Chen
	 * 
	 */
	private static class ConnectionPoolInstance {
		private static final ConnectionPool instance = new ConnectionPool();
	}

	/**
	 * 获取连接池实例
	 * 
	 * @return
	 */
	public static ConnectionPool getInstance() {
		return ConnectionPoolInstance.instance;
	}

	/**
	 * Get database connection from pool
	 * 
	 * @return
	 */
	public Connection getConnection() {
		int retry = 1;
		// If there are not connections, sleep and retry
		while (retry <= MAX_RETRY && pool.size() < 1) {
			try {
				System.out.println("Not avaiable connections, retry to get...");
				TimeUnit.SECONDS.sleep(1);
				retry++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (pool.size() > 0) {
			synchronized (pool) {
				if (pool.size() > 0) {
					return pool.remove(0);
				}
			}
		}

		System.out.println("Sorry, there are not available connections");
		return null;
	}

	/**
	 * Release connection
	 * 
	 * @param connection
	 */
	public void release(Connection connection) {
		pool.add(connection);
	}
}
