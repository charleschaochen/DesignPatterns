package patterns.behavior.respchain;

/**
 * Abstract handler
 * 
 * @author Charles Chen
 * @date 2014��8��30��
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
