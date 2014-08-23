package patterns.creation.factory;

import patterns.creation.factory.beans.Banana;
import patterns.creation.factory.beans.Fruit;

/**
 * Banana factory, produce bananas
 * 
 * @author Charles Chen
 * 
 */
public class BananaFactory implements AbstractFruitFactory {

	@Override
	public Fruit produce() {
		// TODO Auto-generated method stub
		return new Banana();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BananaFactory factory = new BananaFactory();
		Fruit fruit = factory.produce();
		fruit.introduce();
	}
}
