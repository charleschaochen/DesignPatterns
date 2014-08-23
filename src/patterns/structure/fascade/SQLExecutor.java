package patterns.structure.fascade;

public class SQLExecutor {
	/**
	 * 模拟执行数据查询
	 * @param connection
	 * @param sql
	 */
	public void executeSQL(String connection, String sql){
		System.out.println(connection);
		System.out.println(sql);
		System.out.println("SQL is executed");
	}
}
