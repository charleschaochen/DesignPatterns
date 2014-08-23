package patterns.creation.singleton;

/**
 * 内部类方式，声明一个私有的静态内部类，内部类中声明对象属性并进行实例化
 * 
 * @author Charles Chen
 * 
 */
public class InnerClassSingleton {
	private InnerClassSingleton() {
	}

	private static class InnerClassSingletonInstance {
		private static final InnerClassSingleton singleton = new InnerClassSingleton();
	}
	
	/**
	 * Get instance
	 * @return
	 */
	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonInstance.singleton;
	}
}
