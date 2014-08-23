package patterns.creation.singleton;

/**
 * 枚举方式，保证线程安全，防止反射或反序列化产生新的实例，不实现延迟加载
 * @author Charles Chen
 *
 */
public enum EnumSingleton {
	INSTANCE;
	public void otherMehod() {
	}
}
