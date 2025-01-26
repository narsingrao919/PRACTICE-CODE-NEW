package practice;

public class Overloading_constructor {
	String name;
	String company;
	int emply_id;
	int experience;
	
	
	Overloading_constructor(String name,int emply_id){
		this.name=name;
		this.emply_id=emply_id;
	}
	Overloading_constructor(int emply_id,int experience){
		this.emply_id=emply_id;
		this.experience=experience;
	}
	Overloading_constructor(){
		this.emply_id=8;
		this.experience=9;
		this.name="utsav";
	}
	//method
	public void modify_exp(int experience){
		this.experience=experience+experience;
		System.out.println(this.experience);
	}
}
