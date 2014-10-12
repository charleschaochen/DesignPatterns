package patterns.behavior.memento;

/**
 * Client test for memento design pattern
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("On");
		System.out.println(originator);
		// Save the state of the originator
		caretaker.saveMemento(originator.createMemento());

		// Change state of orginator
		originator.setState("Off");
		System.out.println(originator);

		// Restore state
		originator.restoreMemento(caretaker.retrieveMemento());
		System.out.println(originator);
	}

}
