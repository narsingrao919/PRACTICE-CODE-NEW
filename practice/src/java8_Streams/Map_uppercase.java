package java8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list= new ArrayList<>(Arrays.asList("vivek","sohel","lakhan","shabu","DhirAj"));
		List<String>collect=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.print(collect);
		

	}

}
