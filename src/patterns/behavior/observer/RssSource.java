package patterns.behavior.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

public class RssSource extends Observable {
	private List<String> articles = new ArrayList<String>();

	/**
	 * Post a new article
	 * 
	 * @param article
	 */
	public void postArticle(String article) {
		if (!articles.contains(article)) {
			articles.add(article);
			this.setChanged();
		}
		this.notifyObservers(new Date());
	}

	/**
	 * Delete a article
	 * 
	 * @param article
	 */
	public void delArticle(String article) {
		if (articles.remove(article)) {
			this.setChanged();
		}
		this.notifyObservers(new Date());
	}

	/**
	 * List articles
	 */
	public void listArticles() {
		for (String article : articles) {
			System.out.println(article);
		}
	}
}
