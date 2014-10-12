package patterns.behavior.memento;

/**
 * Caretaker for storaging memento
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class Caretaker {
	private Memento memento;

	/**
	 * Save memento
	 * 
	 * @param memento
	 */
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}

	/**
	 * Retrieve memento
	 * 
	 * @return
	 */
	public Memento retrieveMemento() {
		return this.memento;
	}
}
