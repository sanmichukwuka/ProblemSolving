package Work;

public class Pet {
	private String name;
	private String age;
	private String location;
	private String type;

	public Pet() {

	}

	public Pet(String name, String age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
