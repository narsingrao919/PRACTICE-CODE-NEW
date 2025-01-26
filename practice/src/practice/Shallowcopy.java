package practice;

public class Shallowcopy {
	
	
	private String name;
    private int age;
	private int problemssolved;
	
	
	public Shallowcopy(String string, int i, int j) {
		this.name=string;
		this.age=i;
		this.problemssolved=j;
	}


	
public Shallowcopy(Shallowcopy s1) {
		// TODO Auto-generated constructor stub
	this.name=s1.name;
	this.age=s1.age;
	}



public void setAge(int age) {
		this.age = age;
	}



	public void setProblemssolved(int problemssolved) {
		this.problemssolved = problemssolved;
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

	public int getProblemssolved() {
		return problemssolved;
	}
}

	


	


