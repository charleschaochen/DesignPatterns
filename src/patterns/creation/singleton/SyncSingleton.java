package patterns.creation.singleton;

/**
 * 同步方式，对实例化的代码块加锁
 * 
 * @author Charles Chen
 * 
 */
public class SyncSingleton {
	private SyncSingleton() {
	}

	private static SyncSingleton singleton;

	/**
	 * Get instance
	 * 
	 * @return
	 */
	public static SyncSingleton getInstance() {
		if (singleton == null) {
			synchronized (SyncSingleton.class) {
				if (singleton == null) {
					singleton = new SyncSingleton();
				}
			}
		}
		return singleton;
	}
}
