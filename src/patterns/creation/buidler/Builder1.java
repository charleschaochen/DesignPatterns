package patterns.creation.buidler;

/**
 * НЈдьеп1
 * 
 * @author Charles Chen
 * 
 */
public class Builder1 implements Builder {
	private Product product;

	public Builder1() {
		product = new Product();
	}

	@Override
	public Product build() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("Build part A from Builder 1");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("Build part B from Builder 1");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("Build part C from Builder 1");
	}

}
