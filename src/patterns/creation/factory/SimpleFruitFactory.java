package patterns.creation.factory;

import patterns.creation.factory.beans.*;

/**
 * 简单工厂模式，声明produce方法，根据传入的type参数返回对应的产品
 * 
 * 缺点：produce方法需要对传入的参数进行判断以决定生产哪种具体的产品，增加了编程难度，并且如果传入的参数不合法，会导致对象无法正常创建
 * 
 * @author Charles Chen
 * 
 */
public class SimpleFruitFactory {
	/**
	 * Produce fruit with the specific type
	 * 
	 * @param type
	 * @return Fruit
	 */
	public Fruit produce(String type) {
		if ("apple".equals(type)) {
			return new Apple();
		}
		if ("banana".equals(type)) {
			return new Banana();
		}
		System.out.println("Please input correct type.");
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleFruitFactory factory = new SimpleFruitFactory();
		Fruit fruit = factory.produce("apple");
		if (fruit != null) {
			fruit.introduce();
		}
	}

}
