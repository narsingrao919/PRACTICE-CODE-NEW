package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Targetfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(23,5,77,87,85,34,56));
		int target=5;
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==target) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			System.out.println("Target found"+" "+index);
		}

	}

}
