package java8_Streams;

//import java.util.ArrayList;
//import java.util.List;




public class Practo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MEXICO";
		String ans="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ans+=(char)(ch+32);
			}else {
				ans+=(char)(ch-32);
			}
		}
		for(int i=0;i<ans.length();i++) {
			char ch=ans.charAt(i);
			System.out.print(ch);
	}
		
		
	}
}


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<String>list=new ArrayList<>();
//		list.add("M");
//		list.add("X");
//		list.add("I");
//		list.add("C");
//		list.add("O");
//		System.out.print(list);
//		List<String>infotanment =list.stream().filter("h)
