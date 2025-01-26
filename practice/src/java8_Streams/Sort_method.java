package java8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		  ArrayList<Integer>list=new ArrayList<>();
		  list.add(2);
		  list.add(79);
		  list.add(33);
		  list.add(55);
		  list.add(9);
		  
		 List<Integer>sortedelements=list.stream().sorted().collect(Collectors.toList());
		 System.out.println(sortedelements);
	}

}
