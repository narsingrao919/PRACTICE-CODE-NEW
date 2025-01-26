package java8_Streams;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(14,3,0,63,5,70));
		
	       Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
//		Method 2:
//		int[]arr= {14,3,0,63,5,70};
//		int left=0;
//		int right=arr.length-1;
//		int temp=0;
//		while(left<right) {
//			temp=arr[left];
//			arr[left]=arr[right];
//			arr[right]=temp;
//			
//		left++;
//		right--;
//		}
//		
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		

	}

}
