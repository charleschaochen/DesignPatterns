package patterns.behavior.templateMethod;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCalculator calculator = new PlusCalculator();
		calculator.calculate("13+85");
	}

}
