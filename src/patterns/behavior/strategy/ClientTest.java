package patterns.behavior.strategy;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double operand1 = 18;
		double operand2 = 9;

		CalculatorContext context = new CalculatorContext(new Plus());
		// Use addition calculator
		System.out.println(context.useCalculator(operand1, operand2));

		// Use subtraction calculator
		context.setCalculator(new Minus());
		System.out.println(context.useCalculator(operand1, operand2));

		// Use multiply calculator
		context.setCalculator(new Multiply());
		System.out.println(context.useCalculator(operand1, operand2));

		// Use division calculator
		context.setCalculator(new Divide());
		System.out.println(context.useCalculator(operand1, operand2));
	}

}
