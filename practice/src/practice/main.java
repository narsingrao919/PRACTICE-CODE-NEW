package practice;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Students_entity>list=new ArrayList<>();
//		list.add(new Students_entity(1,"vikram",77,'B'));
//		list.add(new Students_entity(2,"Mahesh",94,'A'));
//          
//    for(Students_entity entity:list) {
//    	System.out.println(entity.getGrade());
//    }
//    Animal animal=new Animal("jdjd","ded","dsd","eww");
//    System.out.print(animal.liveS);
    
    Shallowcopy s1=new Shallowcopy("A",22,12);
//    System.out.println(s1.getAge());
    Shallowcopy s2=s1;
    s2.setName("roman reigns");
   
//    System.out.println(s2.getName());
//    System.out.println(s1.getName());
//}
//    Shallowcopy s2=new Shallowcopy("dhoni",42,333);
//   
    System.out.println(s2.getName());
    Shallowcopy s3=new Shallowcopy(s1);
    System.out.println(s3.getName());
    System.out.println(s3.getAge());
	
}
}
