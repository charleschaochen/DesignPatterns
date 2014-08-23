package patterns.behavior.observer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class RssReader implements Observer {
	/**
	 * Observer update method, being called in notifyObservers method in
	 * Observable
	 */
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof Date) {
			Date date = (Date) arg;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.format(date)
					+ "  Articles list is changed");
		}

		if (o instanceof RssSource) {
			RssSource source = (RssSource) o;
			System.out.println("New articles list:");
			source.listArticles();
		}
	}

}
