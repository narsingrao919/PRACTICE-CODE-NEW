package practice;

public class Sum_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	       int[] arr = {33, 4, 2, 1, 44, 2, 4, 53, 46};
//	        int sum = 0;
//
//	        for (int i = 0; i < arr.length; i++) {
//	            sum += arr[i];
//	        }
//
//	        // Correcting the average calculation
//	        double avg = (double) sum / arr.length;
//	        System.out.print(avg);
//	    }
//	}
		
		int[]arr= {33,4,2,1,44,2,4,53,46};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			
		}
		double avg=(double) sum/ arr.length;
		System.out.print(avg);

	}

}
