package patterns.structure.fascade;

public class SQLExecutor {
	/**
	 * ģ��ִ�����ݲ�ѯ
	 * @param connection
	 * @param sql
	 */
	public void executeSQL(String connection, String sql){
		System.out.println(connection);
		System.out.println(sql);
		System.out.println("SQL is executed");
	}
}
