package patterns.behavior.strategy;

/**
 * Add Operation
 * 
 * @author Charles Chen
 * 
 */
public class Plus implements Calculator {

	@Override
	public double calculate(double operand1, double operand2) {
		// TODO Auto-generated method stub
		return operand1 + operand2;
	}

}
