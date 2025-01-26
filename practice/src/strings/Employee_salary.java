package strings;

import java.util.ArrayList;
import java.util.HashMap;




public class Employee_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		HashMap<String, Double>map=new HashMap<>();
		map.put("vivek",2203.9);
		map.put("soheal",73646.08);
		map.put("tanvie",81737.09);
		map.put("ragav",27999.0);
		map.put("leela", 83367.0);
		
		String employenames=null;
		double salary=0.0;
		for(String empnames:map.keySet()) {
			double empsalary= map.get(empnames);
			
			if(empsalary>salary) {
				salary=empsalary;
				employenames=empnames;
			}
			}
	 
		System.out.print(employenames+" "+salary);
   
		
		

	}
}


