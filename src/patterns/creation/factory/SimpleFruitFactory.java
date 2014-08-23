package patterns.creation.factory;

import patterns.creation.factory.beans.*;

/**
 * �򵥹���ģʽ������produce���������ݴ����type�������ض�Ӧ�Ĳ�Ʒ
 * 
 * ȱ�㣺produce������Ҫ�Դ���Ĳ��������ж��Ծ����������־���Ĳ�Ʒ�������˱���Ѷȣ������������Ĳ������Ϸ����ᵼ�¶����޷���������
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
