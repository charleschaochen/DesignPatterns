package patterns.behavior.state.sample;

/**
 * An Order record
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class OrderRecord {
	private String username;
	private String item;

	public OrderRecord(String username, String item) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.item = item;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj instanceof OrderRecord) {
			OrderRecord other = (OrderRecord) obj;
			if (this.username == other.username && this.item == other.item)
				return true;
		}
		return false;
	}
}
