package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(12,13,5,7,98,46,11,3,7,2,1));
		           for(int i:list) { 
			        int count=0;
			         
			         for(int j=2;j<i/2;j++) {
			        	 if(i%j==0) {
			        		count ++;
			        		 break;
			        	 }
			         }
			         if(count==0 && i>1) {
			        	 System.out.print(i+" ");
			         }
			         
			         
	                  	}
	}

}
