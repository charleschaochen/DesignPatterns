package patterns.behavior.strategy;

/**
 * Subtract Operation
 * 
 * @author Charles Chen
 * 
 */
public class Minus implements Calculator {

	@Override
	public double calculate(double operand1, double operand2) {
		// TODO Auto-generated method stub
		return operand1 - operand2;
	}

}
