package java8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_desc {
	/*
	 * Comparable->all ways talks about natural sorting order Ex:ascending order
	  Comparable contains->CompareTo()  method
	 * Comparator->all ways talks about customized sorting order
	    Comparator contain->Compare method for customize sorting Ex:Descending order
	    ->you can follow ascending and descending order using stream in 3 ways as below
	     1)using compareTo method
	     2)using greated and less than code
	     3)or changing the values of i1 and i2 in opposite direction
	    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		list.add(34);
		list.add(4);
		list.add(9);
		list.add(38);
		list.add(29);
		
//		List<Integer>collect =list.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		List<Integer>collect =list.stream().sorted((i1,i2)->(i1).compareTo(i2)).collect(Collectors.toList());  
		System.out.print(collect);
          
	}

}
