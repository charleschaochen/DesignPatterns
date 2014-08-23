package patterns.behavior.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract Template for Calculators
 * 
 * @author Charles Chen
 * 
 */
public abstract class AbstractCalculator {
	/**
	 * Template method
	 * 
	 * First, call retrieveOperands() to retrieve operands from the input
	 * expression with the operator
	 * 
	 * Then, call calculate() to execute calculation
	 * 
	 * Last, call postCalculate() to output the result
	 * 
	 * @param exp
	 */
	public final void calculate(String exp) {
		List<Long> operands = this.retrieveOperands(exp, this.getOperator());
		if (operands == null || operands.size() != 2) {
			System.out.println("Expression is not valid");
			return;
		}
		long result = this.calculate(operands.get(0), operands.get(1));
		this.postCalculate(result);
	}

	/* BEGIN: Abstract methods that sub-classes should implement */
	protected abstract String getOperator();

	protected abstract long calculate(long num1, long num2);

	/* END: Abstract methods that sub-classes should implement */

	/**
	 * Concrete method, retrieve the operands list from expression with the
	 * operator
	 * 
	 * @param exp
	 * @param operator
	 * @return Operands list
	 */
	private List<Long> retrieveOperands(String exp, String operator) {
		if (exp == null || operator == null) {
			return null;
		}
		List<Long> operands = new ArrayList<Long>();
		String[] nums = exp.split(operator);

		try {
			for (String num : nums) {
				operands.add(Long.parseLong(num));
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return null;
		}
		return operands;
	}

	/**
	 * Hook method, to output the result after calculation. Sub-classes can use
	 * the default implement or override it
	 * 
	 * @param result
	 */
	protected void postCalculate(long result) {
		System.out
				.println("Abstract Calculator: Calculation is done, result is "
						+ result);
	}
}
