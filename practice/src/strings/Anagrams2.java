package strings;

import java.util.Arrays;

public class Anagrams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="biblep";
		String s2="bblpei";
		char []ch=new char[s1.length()];
		char []temp=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					ch[i]=s2.charAt(i);
				}
			}
		}
		Arrays.sort(ch);
		Arrays.sort(temp);
		if(Arrays.equals(ch, temp)) {
			System.out.println("Annagrams");
		}
		else {
			System.out.println("not annagrams");
		}

	}

}
