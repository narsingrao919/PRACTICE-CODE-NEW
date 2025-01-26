package strings;


import java.util.Scanner;


public class Palindrome {
//
//	 public static boolean check(String str) {
//        int left=0;
//        int right=str.length()-1;
//          while(left<right) {
//        	  if(str.charAt(left)!=str.charAt(right)) {
//        		  return false;
//        	  }
//        	  left++;
//        	  right--;
//        	  
//          }
//          return true;
//	 }
//          public static void main(String[] args) {
//     		 Scanner scn=new Scanner(System.in);
//     		 String n=scn.nextLine();
//     		 System.out.println(check(n));
//        
//		 
//	 }
          
//          Method 2
	//reverse the string compare it with original string if it same palindrome else not palindrome
	public static void main(String[] args) {
          String str="madam";
          String s="";
          for(int i=str.length()-1;i>=0;i--) {
        	     s=s+str.charAt(i);
  
          }
          if(str.equals(s)) {
          System.out.print("palindrom");
          }
          else {
        	 System.out.println("not a palindrome"); 
          }

}
}
