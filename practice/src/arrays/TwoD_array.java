package arrays;

import java.util.Scanner;

public class TwoD_array {

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
                	for(int j=0;j<arr[0].length;j++) {
                		System.out.print(arr[i][j]+" ");
                	}
                	System.out.println();
                
                }
}
}
