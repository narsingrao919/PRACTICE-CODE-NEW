package practice;

import java.util.Scanner;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("Enter the Prime number:"+n);
		
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				//here i can use j<i/j as well
				/*1)here the numbers divisible by i%j so we increment the count
				      but won't print it((i.e)mostly the number which are dividible by even number
				2)when it comes to prime numbers it run's the loop till the condition is not satisfied
				3)and breaks from the loop so count remains zero so we print the prime number*/
				if(i%j==0) {
					count++;
			     break;		
			}
			}
			//it prints prime numbers 
			    if(count==0) {
			    	
				System.out.print(i+" ");
			}
			
		}

	}

}
