package arrays;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		char[]collect=s.toCharArray();
		for(int i=0;i<collect.length;i++) {
			for(int j=i+1;j<collect.length;j++) {
				if(collect[i]==collect[j]) {
					System.out.print(collect[j]+" ");
				}
			}
		}

	}

}
