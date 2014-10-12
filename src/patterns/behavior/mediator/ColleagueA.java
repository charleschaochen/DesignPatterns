package patterns.behavior.mediator;

/**
 * Colleague A
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ26ÈÕ
 */
public class ColleagueA implements Colleague {
	private AbstractMediator mediator;

	public ColleagueA(AbstractMediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("ColleagueA sends message: " + message);
		this.mediator.send(message, this);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println("ColleagueA received message: " + message);
	}

}
