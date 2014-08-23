package patterns.behavior.strategy;

/**
 * Multiply Operation
 * 
 * @author chaoch
 * 
 */
public class Multiply implements Calculator {

	@Override
	public double calculate(double operand1, double operand2) {
		// TODO Auto-generated method stub
		return operand1 * operand2;
	}

}
