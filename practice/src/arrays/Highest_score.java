package arrays;

import java.util.Scanner;

public class Highest_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	int hs=0;
	for(int i=0;i<arr.length;i++) {
		 if(arr[i]>hs) {
			 hs=arr[i];
		 }
	}
	System.out.println(hs);
}

}
