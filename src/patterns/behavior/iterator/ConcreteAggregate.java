package patterns.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Aggregate
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ23ÈÕ
 * @param <T>
 * @link http://www.charlestech.org/view_article.shtml?uid=EARZQXDWCS53
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<T> data;

	public ConcreteAggregate() {
		// TODO Auto-generated constructor stub
		data = new ArrayList<T>();
	}

	@Override
	/**
	 * Add element to list
	 */
	public void add(T elem) {
		// TODO Auto-generated method stub
		data.add(elem);
	}

	@Override
	/**
	 * Remove element from list
	 */
	public void remove(T elem) {
		// TODO Auto-generated method stub
		data.remove(elem);
	}

	@Override
	/**
	 * Get element by index
	 */
	public T get(int index) {
		// TODO Auto-generated method stub
		return data.get(index);
	}

	@Override
	/**
	 * Get iterator of current collection
	 */
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	@Override
	/**
	 * Get the size of current collection
	 */
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

}
