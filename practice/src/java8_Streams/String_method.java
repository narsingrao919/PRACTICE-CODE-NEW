package java8_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		ArrayList<String>list=new ArrayList<>();
		/*
		 * --Notes--
		 *1)sorted() or (s1).compareTo(s2)-> sorts the string in alphabetical order
		 *2)(s2).compareTo(s1)->sorts in descending order*/
		list.add("arif");
		list.add("vivek ramaswamy");
		list.add("zebra");
		list.add("boe bidden");
		list.add("michael jackson");
		list.add("kustin langer");
		list.add("roman reigns");
		/*Sorts based on length of the string in asc and desc*/
		Comparator<String>c=(s1,s2)->{
			int i1=s1.length();
			int i2=s2.length();
			if(i1<i2) return -1;
			else if(i1>i2) return +1;
			else return (s1).compareTo(s2);
		};
		
		List<String>collect=list.stream().sorted(c).collect(Collectors.toList());
		System.out.print(collect);
	}

}
