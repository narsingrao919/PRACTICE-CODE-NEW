package practice;

public class Students_entity {
	private int roll_no;
	private String name;
	private int marks;
	private char grade;
	
	//construtor
	public Students_entity(int roll_no,String name,int marks,char grade) {
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
		this.grade=grade;
	}
	
	public int getRoll_no() {
		return roll_no;
	}

	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public char getGrade() {
		return grade;
	}
	

	
	
}
