package Inheritance;

import java.util.jar.Attributes.Name;

public class Student extends User{

	
		
		  public Student(String name, int Age, int pblm_solved) {
		super(name, Age, pblm_solved);
		// TODO Auto-generated constructor stub
	}

		public void modify() {
			   System.out.println( name + "this is student method");
			   System.out.println( Age + "this is student method");
			   System.out.println( pbl_solved + "this is student method");
		   }
		   
	}

	
	
	
	

	
      
   
