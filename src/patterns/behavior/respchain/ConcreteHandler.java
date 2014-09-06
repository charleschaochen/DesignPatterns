package patterns.behavior.respchain;

/**
 * Concrete handler
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if (this.getHandler() != null) {
			System.out.println("Pass request to next handler");
			this.getHandler().handleRequest();
			return;
		}

		System.out.println("No next handler, process the request");
	}

}
