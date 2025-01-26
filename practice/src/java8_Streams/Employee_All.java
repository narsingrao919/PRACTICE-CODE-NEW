package java8_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Employee_All {



	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int doj;
	private double salary;

	public Employee_All(int i, String string, int j, String string2, String string3, int k, double d) {
		
		this.id=i;
		this.name=string;
		this.age=j;
		this.gender=string2;
		this.department=string3;
		this.doj=k;
		this.salary=d;
		
		// TODO Auto-generated constructor stub
	}
	
	public void Display() {
		System.out.println(id + ","+ name +","+ age + "," + gender + "," + department + "," + doj +","+ salary);
		
	
}
	
	
		
		
	

	public static void main(String[] args) {
		
		
    
        List<Employee_All> employeeList = new ArrayList<>();

        employeeList.add(new Employee_All(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee_All(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee_All(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee_All(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee_All(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee_All(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee_All(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee_All(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee_All(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee_All(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee_All(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee_All(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee_All(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee_All(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee_All(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee_All(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
        
//        for(Employee_All e:employeeList) {
//        	e.Display();
//        	
//        }
//        System.out.print(gendercount(employeeList));
//    	private static char[] gendercount(List<Employee_All> employeeList) {
//    		// TODO Auto-generated method stub
//    		int count=0;
//    		int temp=0;
//    		if(Employee_All.gendercount(employeeList)="Male") {
//    			count++;
//    		}
//    		else if(gender="female"){
//    			temp++;
//    			
//    		}
//    		
//    		
//    		return null;
        
        System.out.print(employeeList.get(8).gender);
//        

}

	
}
