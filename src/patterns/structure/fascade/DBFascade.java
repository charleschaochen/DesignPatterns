package patterns.structure.fascade;

public class DBFascade {
	/**
	 * 整合三个组件，模拟数据库查询
	 */
	public void executeQuery(){
		ConnectionBuilder connBuilder = new ConnectionBuilder();
		String connection = connBuilder.createConnection();
		SQLBuilder sqlBuidler = new SQLBuilder();
		String sql = sqlBuidler.createSQL();
		SQLExecutor executor = new SQLExecutor();
		executor.executeSQL(connection, sql);
	}
}
