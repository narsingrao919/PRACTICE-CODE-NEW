package practice;

import java.security.PublicKey;

public class Copy_constructor {
    String animal;
    static String type;
    static int Age;
    
    
    Copy_constructor(String animal,String type,int Age){
    	this.animal=animal;
    	this.type=type;
    	this.Age=Age;
    	
    }
   
	public Copy_constructor(Copy_constructor t1) {
		// TODO Auto-generated constructor stubthis
		this.animal=t1.animal;
		this.type=t1.type;
		this.Age=61;
	}
		
		public static int printme() {
			return Age;
		}
		public static String printse() {
			return type;
		}
}
