package arrays;



public class Swapint {

	 public  int[] swapnum(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
	 
	   return new int [] {a,b};
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=13;
		 int b=18;
		 Swapint s = new Swapint();
		 System.out.println(s.swapnum(a, b));
				 
	
		

	}

}
