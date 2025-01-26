package strings;



import java.util.Scanner;

import practice.main;

public class Conv_Str_char {
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		String []str=new String[n];
	for(int i=0;i<str.length;i++) {
		
		str[i]=scn.nextLine();
	}
	for(String u:str) {
		System.out.println(u);
	}

}
}

