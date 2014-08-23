package patterns.creation.singleton;

/**
 * 饿汉方式，声明对象属性时进行实例化，保证线程安全，不实现延迟加载
 * 
 * @author Charles Chen
 * 
 */
public class HungrySingleton {
	private HungrySingleton() {
	}

	private static HungrySingleton singleton = new HungrySingleton();

	/**
	 * Get instance
	 * 
	 * @return
	 */
	public static HungrySingleton getInstance() {
		return singleton;
	}

}
