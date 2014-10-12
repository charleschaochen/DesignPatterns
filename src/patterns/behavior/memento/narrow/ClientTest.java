package patterns.behavior.memento.narrow;
/**
 * Client test for memento design pattern with narrow interface
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		
		// Set state
		originator.setState("On");
		System.out.println(originator);
		
		// Save current state
		caretaker.saveMemento(originator.createMemento());
		
		// Change state
		originator.setState("Off");
		System.out.println(originator);
		
		// Restore state
		originator.restoreMemento(caretaker.retrieveMemento());
		System.out.println(originator);
	}

}
