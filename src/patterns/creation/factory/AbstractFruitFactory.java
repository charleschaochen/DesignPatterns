package patterns.creation.factory;

import patterns.creation.factory.beans.Fruit;

/**
 * 抽象工厂模式，将工厂抽象为一个接口，每个实现该接口的工程类负责生产一种产品
 * 当需要添加新的产品时，只需要实现新的工程类即可
 * @author chaoch
 *
 */
public interface AbstractFruitFactory {
	public Fruit produce();
}
