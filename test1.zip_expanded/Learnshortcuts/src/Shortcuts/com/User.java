package Shortcuts.com;

public class User {
	private int password;
	private String name;

	public int getId() {
		return password;
	}

	public void setId(int id) {
		this.password = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {
		super();
		this.password = id;
		this.name = name;
	}

}
