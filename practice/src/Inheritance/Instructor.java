package Inheritance;

public class Instructor extends Student {
	public String company="X";

	public Instructor(String name, int Age, int pblm_solved) {
		super(name, Age, pblm_solved);
		// TODO Auto-generated constructor stub
	}
           public void teach() {
        	   System.out.println("i am instructor");
           }
}
