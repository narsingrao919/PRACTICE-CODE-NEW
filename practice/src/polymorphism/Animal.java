package polymorphism;

public class Animal {
	int a;
	String b;
	Animal(int a){
		this.a=a;
	}
	void print (int a) {
		this.a=a;
		System.out.println(a);
	}
	void print(String b) {
		this.b=b;
		System.out.println(b);
	}
	void printme() {
		System.out.println("This is animal method"+" "+ a);
	}

}
