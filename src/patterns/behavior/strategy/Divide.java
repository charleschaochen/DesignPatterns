package patterns.behavior.strategy;

/**
 * Divistion Operation
 * 
 * @author Charles Chen
 * 
 */
public class Divide implements Calculator {

	@Override
	public double calculate(double operand1, double operand2) {
		// TODO Auto-generated method stub
		if (operand1 == 0)
			return 0;
		if (operand2 == 0)
			return Double.MAX_VALUE;
		return operand1 / operand2;
	}

}
