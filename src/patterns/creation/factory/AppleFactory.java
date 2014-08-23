package patterns.creation.factory;

import patterns.creation.factory.beans.Apple;
import patterns.creation.factory.beans.Fruit;

/**
 * Apple factory, produce apples
 * 
 * @author Charles Chen
 * 
 */
public class AppleFactory implements AbstractFruitFactory {

	@Override
	public Fruit produce() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleFactory factory = new AppleFactory();
		Fruit fruit = factory.produce();
		fruit.introduce();
	}
}
