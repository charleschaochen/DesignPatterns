package patterns.behavior.iterator;

/**
 * Iterator Interface
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ23ÈÕ
 */
public interface Iterator {
	Object first();

	boolean hasNext();

	boolean hasPrevious();

	Object next();

	Object previous();

	void reset();
}
