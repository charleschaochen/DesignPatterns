package patterns.behavior.iterator;

/**
 * Iterator Interface
 * 
 * @author Charles Chen
 * @date 2014��8��23��
 * @link http://www.charlestech.org/view_article.shtml?uid=EARZQXDWCS53
 */
public interface Iterator {
	Object first();

	boolean hasNext();

	boolean hasPrevious();

	Object next();

	Object previous();

	void reset();
}
