package patterns.creation.buidler;

/**
 * ²úÆ·½ÇÉ«
 * 
 * @author Charles Chen
 * 
 */
public class Product {
	private String partA;
	private String partB;
	private String partC;

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	public String toString() {
		return "PartA: " + getPartA() + "\nPartB: " + getPartB() + "\nPartC: "
				+ getPartC();
	}
}
