package patterns.behavior.state;

/**
 * Client test for state design pattern sample
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class ClientTest {
	public static void main(String[] args) {
		State state1 = new ConcreteState1();
		Context context = new Context(state1);
		context.request();
		State state2 = new ConcreteState2();
		context.setState(state2); // Change state
		context.request();
	}
}
