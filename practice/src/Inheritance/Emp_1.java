package Inheritance;

public class Emp_1 {
	String name;
	
	Emp_1(String name){
		this.name=name;
	}
	Emp_1(){
		System.out.println("This is parent class");
	}
	void display(){
		System.out.println("Name of emp_1:"+ name);
		
	}

}
