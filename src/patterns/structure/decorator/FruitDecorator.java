package patterns.structure.decorator;

/**
 * ˮ��װ�����࣬���ˮ��ԭ��
 * 
 * @author Charles Chen
 * 
 */
public class FruitDecorator implements Pizza {
	private Pizza pizza;

	public FruitDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		pizza.make();
		System.out.println("���ԭ�ϣ� ˮ��");
	}

}
