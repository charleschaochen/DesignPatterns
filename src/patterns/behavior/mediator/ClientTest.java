package patterns.behavior.mediator;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMediator mediator = new ConcreteMediator();
		Colleague ca = new ColleagueA(mediator);
		Colleague cb = new ColleagueB(mediator);

		// Add into mediator
		mediator.addColleague(ca);
		mediator.addColleague(cb);

		String message = "Hello everybody";
		ca.send(message);
		cb.send(message);
	}

}
