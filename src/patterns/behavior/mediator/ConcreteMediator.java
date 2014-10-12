package patterns.behavior.mediator;

/**
 * Concrete mediator, implement send method
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ26ÈÕ
 */
public class ConcreteMediator extends AbstractMediator {

	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		// Send message to all colleagues except self
		for (Colleague c : colleagues) {
			if (c != colleague) {
				c.receive(message);
			}
		}
	}

}
