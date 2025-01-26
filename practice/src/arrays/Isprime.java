package arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class Isprime {

	
	public static void main(String[] args) {
		
//ArrayList<Integer>list=new ArrayList<>(Arrays.asList(12,89,94,36,5,29,13,23,34));
// for(int i:list) {
//	 int count=0;
//	 for(int j=2;j<i/2;j++) {
//		 if(i%j==0) {
//			 count++;
//			 break;
//		 }
//	 }
//	 if(count==0 && i>1) {
//		 System.out.print(i+" ");
//	 }
// }
// 
//  
//		
//		int []arr= {12,89,94,36,5,29,13,23,34};
//	for(int i=0;i<arr.length;i++) {
//		   int count=0;
//		for(int j=2;j<arr[i]/2;j++) {
//			if(arr[i]%j==0) {
//				count++;
//				break;
//			}
//		}
//		if((count==0) && arr[i]>1) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
	
	           int n=100;
	           for(int i=2;i<=n;i++) {
	        	   int count=0;
	        	   for(int j=2;j<=i/2;j++) {
	        		   if(i%j==0) {
	        			  count++;
	        			  break;
	        		   }
	        	   }
	        	   if(count==0) {
	       			System.out.print(i+" ");
	       		}
	           }
		
	}
		
	}
		
		