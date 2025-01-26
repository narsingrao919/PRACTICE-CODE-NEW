package arrays;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {3,2,7,8,94,34,6,32};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
			
		
		
		for(int run :arr) {
			System.out.print(run+" "+"-");
		}
        
           
	}
	

}
