package patterns.structure.decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OriginPizza oPizza = new OriginPizza();
		// ��oPizza��������װ�Σ�����ţ���������
		Pizza pizza = new BaconicDecorator(new BeefDecorator(oPizza));
		pizza.make();
	}

}
