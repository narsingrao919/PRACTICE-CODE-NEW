package java8_Streams; //Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s = new ArrayList<>();
		s.add(39);
		s.add(12);
		s.add(53);
		s.add(63);
		s.add(17);

		long failed = s.stream().filter(m -> m < 35).count();
		System.out.println(failed);
	}

}
