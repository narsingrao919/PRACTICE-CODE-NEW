package java8_Streams;

@FunctionalInterface
public interface Lamda {
	int square (int x);
   
public static void main(String[] args) {
	Lamda lamda=(x)->x*x;
	int result=lamda.square(4);
	System.out.println(result);
	
	
	
}
}
