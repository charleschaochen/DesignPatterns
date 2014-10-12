package patterns.behavior.memento.narrow;

/**
 * Caretaker for storaging memento
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class Caretaker {
	private IMemento memento;

	public void saveMemento(IMemento memento) {
		this.memento = memento;
	}

	public IMemento retrieveMemento() {
		return this.memento;
	}
}
