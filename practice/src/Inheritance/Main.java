package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User sc=new User("somesh",6,433);
		Student sc1=new Instructor("sima", 12, 2);
		

          System.out.println(sc.name);
          System.out.println(sc1.pbl_solved);
          
          sc1.login();
          System.out.println(((Instructor)sc1).company);
//          (((Instructor)sc1).teach());
////          sc.modify();
          sc1.modify();
         
	}

}