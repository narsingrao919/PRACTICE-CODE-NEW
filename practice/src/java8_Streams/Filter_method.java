package java8_Streams;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Filter_method {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(22);
		List<Integer> l = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(l);

	}
}
