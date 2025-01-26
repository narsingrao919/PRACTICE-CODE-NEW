package strings;

public class Employeage {
	
	String name;
	int Age;
	
	public Employeage(String name, int age) {
		this.name = name;
		this.Age = age;
	}
	
	public String getName() {
		return name;
		}
	
	public int getAge() {
		return Age;
	}
	
	
	@Override
	public String toString() {
		return "Employeage [name=" + name + ", Age=" + Age + "]";
	}
	
	
	

}
