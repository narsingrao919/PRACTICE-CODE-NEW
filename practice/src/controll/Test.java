package controll;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
	  List<Integer> list = new ArrayList<>(Arrays.asList(1, 32, 45, 11, 19, 16, 90, 13, 15, 20, 43));

      // Iterate over each number in the list
      for (int i : list) {
          int count = 0;

          // Check if the number is prime
          for (int j = 2; j <= i / 2; j++) {
              if (i % j == 0) {
                  count++;
                  break;
              }
          }

          // If the number is prime, print it
          if (count == 0 && i > 1) {
              System.out.println("List of all Prime numbers"+" "+i);
          }
      }
  }
}

