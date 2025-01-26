package polymorphism;

public class Dog extends Animal{
	

Dog(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}



	

    @Override
	void printme() {
		System.out.println("This is Dog method"+" "+ a);
	}
}
