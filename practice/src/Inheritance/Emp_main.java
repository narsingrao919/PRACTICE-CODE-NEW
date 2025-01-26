package Inheritance;

import java.util.concurrent.BrokenBarrierException;

public class Emp_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp_2 et = new Emp_2("maddy", 2);
		Emp_2 et1=new Emp_2();
		et.display();
		et.show();
		User in =new Instructor(null, 0, 0);
		System.out.println(in.name);
        Instructor un =new Instructor(null, 0, 0);
        un.teach();
	}

}
