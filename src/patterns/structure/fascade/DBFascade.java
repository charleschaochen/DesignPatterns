package patterns.structure.fascade;

public class DBFascade {
	/**
	 * �������������ģ�����ݿ��ѯ
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
