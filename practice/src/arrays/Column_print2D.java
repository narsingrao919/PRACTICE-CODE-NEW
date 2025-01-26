package arrays;

import java.util.Scanner;

public class Column_print2D {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn= new Scanner(System.in);
			int n=scn.nextInt();
			int m=scn.nextInt();
	           int[][]arr=new int[n][m];
	                for(int i=0;i<n;i++) {
	                	for(int j=0;j<m;j++) {
	                		arr[i][j]=scn.nextInt();
	                	}
	                }
	                for(int i=0;i<arr.length;i++) {
	                	if(i%2==0) {
	                     for(int j=0;j<arr.length;j++) {
	                	 System.out.print(arr[i][j]);
	                    }
	                	}
	                	System.out.println();
	                		if(i%2!=0) {
	                		 for(int j=arr.length-1;j>=0;j--) {
	    	                	 System.out.print(arr[i][j]);
	    	                    }
	                	}
	                		System.out.println();
	                }
	                	 
	                 }

	}



