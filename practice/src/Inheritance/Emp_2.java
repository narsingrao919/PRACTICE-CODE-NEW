package Inheritance;

import java.util.PrimitiveIterator.OfDouble;

public class Emp_2 extends Emp_1 {
	int emp_id;
	public Emp_2() {
		// TODO Auto-generated constructor stub
		super();
	}

	Emp_2(String name,int emp_id) {
		super(name);
		this.emp_id=emp_id;
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println("Name of emp_2:"+ name);
		System.out.println("ID of emp_2:"+ emp_id);
	}
	

}
