package patterns.behavior.mediator;

/**
 * Colleague B
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ26ÈÕ
 */
public class ColleagueB implements Colleague {
	private AbstractMediator mediator;

	public ColleagueB(AbstractMediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("ColleagueB sends message: " + message);
		this.mediator.send(message, this);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println("ColleagueB received message: " + message);
	}

}
