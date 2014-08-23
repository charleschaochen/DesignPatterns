package patterns.creation.factory;

import patterns.creation.factory.beans.*;

/**
 * ��������ģʽ��������ͬ�ķ�������������ͬ�Ĳ�Ʒ
 * 
 * ȱ�㣺�����Ͽ���ԭ�򣬵���Ҫ����µĲ�Ʒʱ��Ҫ�޸Ĺ�����
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
