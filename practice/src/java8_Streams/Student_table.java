package java8_Streams;

import java.util.ArrayList;
import java.util.Arrays;

import Inheritance.Student;

public class Student_table {
	
    private int id;
    private String name;
    private int age;
    private String batch;
    private String garde;
    
    
      public Student_table(int id, String name, int age, String batch, String garde) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.batch = batch;
		this.garde = garde;
	}
      
      public void printme() {
    	  System.out.println(id +"," + name + "," + age + "," + batch + ","+ garde);
      }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student_table>student = new ArrayList<>();
		student.add(new Student_table(1, "narsing", 29, "java", "A"));
		student.add(new Student_table(2, "vivek", 9, "java2", "F"));
		student.add(new Student_table(3, "lava", 49, "java3", "K"));
		student.add(new Student_table(4, "rohan", 11, "java4", "E"));
		student.add(new Student_table(5, "sohel", 12, "java5", "D"));
		
		for(Student_table st:student) {
		              st.printme();	
		
		

	}

}
}
