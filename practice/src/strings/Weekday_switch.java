package strings;

import java.util.Scanner;

public class Weekday_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		switch (n){
		case 1: 
			System.out.print("Monday");
			break;
		case 2: 
			System.out.print("Tuesday");
			break;
		case 3: 
			System.out.print("Wednesday");
			break;
		case 4: 
			System.out.print("Thursday");
			break;
		case 5: 
			System.out.print("Fiday");
			break;
		case 6: 
			System.out.print("Saturday");
			break;
		case 7: 
			System.out.print("Sunday");
			break;
			
		}

}
}
