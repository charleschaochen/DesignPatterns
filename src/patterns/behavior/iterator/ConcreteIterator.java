package patterns.behavior.iterator;

/**
 * Implementation of Iterator
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ23ÈÕ
 * @link http://www.charlestech.org/view_article.shtml?uid=EARZQXDWCS53
 */
public class ConcreteIterator implements Iterator {
	private Aggregate aggregate;
	private int pos = -1;

	public ConcreteIterator(Aggregate aggregate) {
		// TODO Auto-generated constructor stub
		this.aggregate = aggregate;
	}

	@Override
	/**
	 * Get first element
	 */
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.get(0);
	}

	@Override
	/**
	 * If has next element, return true
	 */
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pos < aggregate.size() - 1 ? true : false;
	}

	@Override
	/**
	 * If has previous element, return true
	 */
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return pos > 0 ? true : false;
	}

	@Override
	/**
	 * Get next element
	 */
	public Object next() {
		// TODO Auto-generated method stub
		return hasNext() ? aggregate.get(++pos) : null;
	}

	@Override
	/**
	 * Get previous element
	 */
	public Object previous() {
		// TODO Auto-generated method stub
		return hasPrevious() ? aggregate.get(--pos) : null;
	}

	@Override
	/**
	 * Reset the position to 0
	 */
	public void reset() {
		// TODO Auto-generated method stub
		pos = -1;
	}

}
