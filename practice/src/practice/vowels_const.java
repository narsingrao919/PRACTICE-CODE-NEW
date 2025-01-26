package practice;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class vowels_const {
	
   public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
	   String stn=scn.nextLine();
	   stn=stn.toLowerCase();
	   int vow=0;
	   int constant=0;
	   
	   for(int i=0;i<stn.length();i++) {
		   if(stn.charAt(i)=='a' || stn.charAt(i)=='e'|| stn.charAt(i)=='i' || stn.charAt(i)=='o' || stn.charAt(i)=='u') {
			     vow++;
			   }
		   else {
			   constant++;
			}
	   }
		   System.out.println("count of vowels:"+" "+vow);
	        System.out.print("count of consonants:"+" "+constant);

	   }
}
	


