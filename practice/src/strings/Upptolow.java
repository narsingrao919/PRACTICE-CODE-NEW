package strings;

public class Upptolow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="uPPsadAAtUv";
		
		 char[]ch=str.toCharArray();
		 char[]empty=new char[str.length()];
		 
		 for(int i=0;i<ch.length;i++) {
			 if(ch[i]>='a'&& ch[i]<='z') {
				 empty[i]=(char) (ch[i]-32);
			 }
			 else if(ch[i]>='A' && ch[i]<='Z') {
				 empty[i]=(char) (ch[i]+32);
			 }
			 else {
	                // If it's neither, keep the character as is
	                empty[i] = ch[i];
		 }
		 }
		for (char test:empty){
			 System.out.print(test);
		 }

	}

}
