package working_with_files;

public class Person {
	private String name;
	private String occupation;
	private int age;
	
	public Person(String name, String occupation, int age) {
		this.setName(name);
		this.setOccupation(occupation);
		this.setAge(age);
	}
	
	public String toString() {
		return name + ", " + occupation + ", " + age;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}