package patterns.behavior.state.sample;

/**
 * Client test for state design pattern sample
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderManager mgr = new OrderManager();
		mgr.order("charles", "keyboard");
		mgr.order("charles", "mouse");
		mgr.order("charles", "keyboard");
	}

}
