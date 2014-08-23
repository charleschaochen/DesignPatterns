package patterns.creation.factory;

import patterns.creation.factory.beans.Fruit;

/**
 * ���󹤳�ģʽ������������Ϊһ���ӿڣ�ÿ��ʵ�ָýӿڵĹ����ฺ������һ�ֲ�Ʒ
 * ����Ҫ����µĲ�Ʒʱ��ֻ��Ҫʵ���µĹ����༴��
 * @author chaoch
 *
 */
public interface AbstractFruitFactory {
	public Fruit produce();
}
