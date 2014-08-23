package patterns.structure.fascade;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBFascade fascade = new DBFascade();
		fascade.executeQuery();
	}

}
