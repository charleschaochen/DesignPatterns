package patterns.behavior.respchain.filter;

/**
 * Simulate a request
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public class Request {
	private String content;

	public Request(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return this.getContent();
	}
}
