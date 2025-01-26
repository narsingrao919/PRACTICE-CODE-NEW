package practice;

public class Copy_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_constructor t1=new Copy_constructor("monkey", "male", 2);
//		System.out.println(t1.animal);
		Copy_constructor t2=new Copy_constructor(t1);
//		System.out.println(t2.animal);
//		System.out.println(t2.Age);
//		System.out.println(Copy_constructor.animal);
//		System.out.println(Copy_constructor.type);
		System.out.println(Copy_constructor.printme());
		System.out.println(t2.printme());
		

	}

}
