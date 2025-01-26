package practice;



import java.util.ArrayList;
import java.util.Scanner;

public class pull_vowels_const {
	public static void main(String[] args) {
			   Scanner scn=new Scanner(System.in);
			   String stn=scn.nextLine();
			   stn=stn.toLowerCase();
//			   int vow=0;
//			   int constant=0;
			char []arr=new char[stn.length()];
			char[]arr1=new char[stn.length()];
			   for(int i=0;i<stn.length();i++) {
				   if(stn.charAt(i)=='a' || stn.charAt(i)=='e'|| stn.charAt(i)=='i' || stn.charAt(i)=='o' || stn.charAt(i)=='u') {
//					   System.out.println("vowels"+" "+ stn.charAt(i));
					   arr[i]+=stn.charAt(i);
					   }
				   else {
//					   System.out.println("consonants"+" "+ stn.charAt(i));
					   arr1[i]+=stn.charAt(i);
					}
			   }
//			   for(int i=0;i<arr.length;i++) {
//				  System.out.print(arr[i]); 
//			   }
			   for(char var:arr) {
				   System.out.print(var);
			   }
//			   System.out.println(); 
//			   for(int i=0;i<arr1.length;i++) {
//					  System.out.print(arr1[i]); 
//				   }
			   
	}
}


			   
