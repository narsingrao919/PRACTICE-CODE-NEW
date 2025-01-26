package strings;

import java.util.HashSet;



public class Uniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character>set=new HashSet<>();
		String s= "madam";
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			   
		}
		System.out.println(set);

	}

}
