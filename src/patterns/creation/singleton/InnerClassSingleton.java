package patterns.creation.singleton;

/**
 * �ڲ��෽ʽ������һ��˽�еľ�̬�ڲ��࣬�ڲ����������������Բ�����ʵ����
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
