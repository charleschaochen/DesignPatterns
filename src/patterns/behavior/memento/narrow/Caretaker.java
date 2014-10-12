package patterns.behavior.memento.narrow;

/**
 * Caretaker for storaging memento
 * 
 * @author Charles Chen
 * @date 2014��9��13��
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
