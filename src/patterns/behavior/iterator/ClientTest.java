package patterns.behavior.iterator;

/**
 * Client test sample for iterator design pattern
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ23ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
		aggregate.add("hello");
		aggregate.add("iterator");
		aggregate.add("design");
		aggregate.add("pattern");
		Iterator it = aggregate.iterator();

		// Traverse the elements
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
		while (it.hasPrevious()) {
			System.out.println((String) it.previous());
		}
	}

}
