package strings;

public class Rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vinay";
//		char[]ch=str.toCharArray();
//		int i=0;
//		int j=str.length()-1;
//		while(i<j) {
//			char temp=ch[i];
//			ch[i]=ch[j];
//			ch[j]=temp;
//		     i++;
//			j--;
//		}
//			
//			for(char k:ch) {
//				System.out.print(k);
//			}
		String collectString="";
		for(int i=str.length()-1;i>=0;i--) {
			collectString=collectString+str.charAt(i);
		}
		System.out.println(collectString);

	}

}
	










