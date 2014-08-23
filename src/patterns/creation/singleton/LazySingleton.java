package patterns.creation.singleton;

/**
 * 普通方法，也称懒汉方式，不保证线程安全
 * 
 * @author Charles Chen
 * 
 */
public class LazySingleton {
	private LazySingleton() {
	}

	private static LazySingleton singleton;

	/**
	 * Get instance
	 * 
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
