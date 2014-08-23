package patterns.behavior.templateMethod;

/**
 * Plus Calculator, extends the Calculator and implements the abstract methods
 * 
 * @author Charles Chen
 * 
 */
public class PlusCalculator extends AbstractCalculator {

	@Override
	protected long calculate(long num1, long num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	protected String getOperator() {
		// TODO Auto-generated method stub
		return "\\+";
	}

	public void postCalculate(long result) {
		System.out.println("Plus Calculator: Calculation is done, result is "
				+ result);
	}
}
