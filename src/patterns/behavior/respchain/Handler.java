package patterns.behavior.respchain;

/**
 * Abstract handler
 * 
 * @author Charles Chen
 * @date 2014Äê8ÔÂ30ÈÕ
 */
public abstract class Handler {
	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public abstract void handleRequest();
}
