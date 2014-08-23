package patterns.behavior.strategy;

/**
 * Calculator Context
 * 
 * @author Charles Chen
 * 
 */
public class CalculatorContext {
	private Calculator calculator;

	public CalculatorContext(Calculator calculator) {
		this.calculator = calculator;
	}

	/**
	 * Use the calculator
	 * 
	 * @param operand1
	 * @param operand2
	 * @return
	 */
	public double useCalculator(double operand1, double operand2) {
		return calculator.calculate(operand1, operand2);
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

}
