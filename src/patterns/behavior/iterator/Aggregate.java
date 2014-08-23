package patterns.behavior.iterator;

/**
 * Aggregate Interface
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ23ÈÕ
 * @param <T>
 * @link http://www.charlestech.org/view_article.shtml?uid=EARZQXDWCS53
 */
public interface Aggregate<T> {
	void add(T elem);

	void remove(T elem);

	T get(int index);

	Iterator iterator();

	int size();
}
