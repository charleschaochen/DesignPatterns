package patterns.creation.buidler;

public class User {
	private long userId;
	private String name;
	private int age;
	private String email;

	/**
	 * 私有构造器，接受建造者对象，根据建造者初始化属性值
	 * 
	 * @param builder
	 */
	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
	}

	public static class UserBuilder {
		private long userId;
		private String name;
		private int age;
		private String email;

		/**
		 * 构造器，对必须属性赋值
		 * 
		 * @param userId
		 * @param name
		 */
		public UserBuilder(long userId, String name) {
			this.userId = userId;
			this.name = name;
		}

		/* 流式接口风格方法 */
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			return new User(this);
		}
		/* 流式接口风格方法 */
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User ID: " + userId + "\nUser Name: " + name + "\nUser Age: "
				+ age + "\nUser Email: " + email;
	}

	/**
	 * 测试程序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User.UserBuilder(1, "chenchao").age(23).email(
				"399931011@qq.com").build();
		System.out.println(user);
	}
}
