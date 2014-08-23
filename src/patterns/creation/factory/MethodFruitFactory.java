package patterns.creation.factory;

import patterns.creation.factory.beans.*;

/**
 * 工厂方法模式，声明不同的方法负责生产不同的产品
 * 
 * 缺点：不符合开闭原则，当需要添加新的产品时需要修改工厂类
 * 
 * @author Charles Chen
 * 
 */
public class MethodFruitFactory {
	/**
	 * Produce apple
	 * 
	 * @return Apple
	 */
	public Fruit produceApple() {
		return new Apple();
	}

	/**
	 * Produce banana
	 * 
	 * @return Banana
	 */
	public Fruit produceBanana() {
		return new Banana();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFruitFactory factory = new MethodFruitFactory();
		Fruit fruit = factory.produceBanana();
		fruit.introduce();
	}
}
