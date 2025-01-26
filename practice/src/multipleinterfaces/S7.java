package multipleinterfaces;

import java.security.PublicKey;

public class S7 implements Printable,Showable {
    public  void draw() {
    	System.out.println("method of printable");
    }
    public  void show() {
    	System.out.println("method of showable");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S7 obj =new S7();
		   
		   obj.draw();
		   obj.show();
    
	}

}
