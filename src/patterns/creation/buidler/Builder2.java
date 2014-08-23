package patterns.creation.buidler;

/**
 * НЈдьеп2
 * 
 * @author Charles Chen
 * 
 */
public class Builder2 implements Builder {
	private Product product;

	public Builder2() {
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
		product.setPartA("Build part A from Builder 2");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("Build part B from Builder 2");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("Build part C from Builder 2");
	}

}
