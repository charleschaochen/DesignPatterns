package patterns.behavior.respchain;

/**
 * Client test for responsibility chain design pattern
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		// Set handler2 as the next handler of handler1
		handler1.setHandler(handler2);
		// Request the handler1
		handler1.handleRequest();
	}

}
