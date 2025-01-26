package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Mainemployeage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Employeage age1 = new Employeage("shobit", 34);
             Employeage age2 = new Employeage("vikram", 14);
             Employeage age3 = new Employeage("arun", 12);
             Employeage age4 = new Employeage("Anil", 72);
             Employeage age5 = new Employeage("lalasa", 35);
             Employeage age6 = new Employeage("shivani", 21);
             
             ArrayList<Employeage>list=new ArrayList<>(Arrays.asList(age1,age2,age3,age4,age5,age6));
             
             
//            Stream<Employeage>fitting =Stream.of(age1,age2,age3,age4,age5,age6);
                              
            
//            List<Employeage>collecEmployeages=list.stream().filter(null)
             
                           Stream<Employeage>stream= list.stream();
                           
                           Stream<Employeage>testing =stream.filter(m -> m.name.startsWith("a") && m.Age<=22);
                           
                           testing.forEach(m->System.out.println(m));
             	
	}

} 
