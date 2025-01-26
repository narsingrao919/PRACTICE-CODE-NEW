package java8_Streams;


public interface Lamda1 {
	public String add(String name1,String name2);
	public static int sub(int a,int b) {
		return a+b;
	}
	
	
   public static void main(String[] args) {
	   Lamda1 lr =(name1,name2)->name1+name2;
	   System.out.print(lr.add("luky","sohel"));
	   
	   int result=Lamda1.sub(10, 20);
	   System.out.print(result);
	   
	   
	
       }

}
