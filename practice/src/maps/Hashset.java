package maps;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("mango");
		if(set.contains("apple")) {
			set.remove("apple");
			set.add("berry");
		}
		
		
		System.out.println(set);
	

	}
}


