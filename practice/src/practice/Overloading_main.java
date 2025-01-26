package practice;

public class Overloading_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_constructor oc =new Overloading_constructor("sahil",12);
		Overloading_constructor sc=new Overloading_constructor(1, 3);
		System.out.println(sc.experience);
		Overloading_constructor m =new Overloading_constructor();
		System.out.println(m.name);
	      sc.modify_exp(8);
		

	}

	

}
