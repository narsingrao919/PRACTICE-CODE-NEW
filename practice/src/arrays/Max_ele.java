package arrays;

public class Max_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		int []arr= {27,3,2,82,4,34};
		int max=arr[0];
		 for(int i=1;i<arr.length;i++) {
			
			if(max>arr[i]) {
				max=arr[i];
			}
			 
		 }
		 System.out.println(max);
	}

}
