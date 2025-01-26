package strings;

import java.util.HashSet;

public class Deleteduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		HashSet<Character>set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
//		String br=set.toString();
		System.out.print(set);

	}

}
