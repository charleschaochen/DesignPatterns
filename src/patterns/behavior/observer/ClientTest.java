package patterns.behavior.observer;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RssSource source = new RssSource();
		// Add a observer
		source.addObserver(new RssReader());

		// Add articles
		source.postArticle("Introduce to Java observer design pattern");
		source.postArticle("How to use Java util Observer and Observable");

		// Delete a article
		source.delArticle("Introduce to Java observer design pattern");

	}

}
