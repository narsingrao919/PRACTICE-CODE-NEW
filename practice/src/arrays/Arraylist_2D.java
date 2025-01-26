package arrays;

import java.util.ArrayList;


public class Arraylist_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<ArrayList<Integer>>list=new ArrayList<>();
       ArrayList<Integer>l1=new ArrayList<>();
       l1.add(10);
       l1.add(20);
       l1.add(30);
       System.out.println(l1);
       ArrayList<Integer>l2=new ArrayList<>();
       l2.add(40);
       l2.add(50);
       l2.add(60);
       System.out.println(l2);
       
       list.add(l1);
       list.add(l2);
    
       System.out.println(list.size());
       System.out.println(list.get(1).get(2));
       System.out.println(list.get(1).set(2,22));
       System.out.println(list);
       
     
       
	}
}
