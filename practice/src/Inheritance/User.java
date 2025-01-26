package Inheritance;

public class User {
	 String name;
	   int Age;
	   int pbl_solved;
	   
	   public User (String name,int Age,int pblm_solved) {
	    	this.name=name;
	    	this.Age=Age;
	    	this.pbl_solved=pblm_solved;
	    }
	    
	     
	   public void login() {
		   System.out.println( name + "this is user method");
		   System.out.println( Age + "this is user method");
		   System.out.println( pbl_solved + "this is user method");
		  
	   }
	  
	   
}
