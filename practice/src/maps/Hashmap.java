package maps;
import java.util.HashMap;

public class Hashmap {

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			HashMap<Integer,String>map =new HashMap<>();
			map.put(1, "vikram");
			map.put(2, "naidu");
			map.put(3, "selevam");
			map.put(4, "arbas");
			map.put(5, "shivam");
		    map.put(2, "joe");
		    map.remove(3);
			System.out.println(map);
	}

}
