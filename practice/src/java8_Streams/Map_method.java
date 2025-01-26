package java8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(39);
		list.add(12);
		list.add(53);
		list.add(63);
		list.add(17);
		 
		List<Integer>gracemarks=list.stream().map(m->m+5).collect(Collectors.toList());
		System.out.println(gracemarks);
		
		

	}

}
