package strings;



public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "Hello, World!";
//		char[] charArray = new char[50];
//
//		for(int i=0;i<str.length();i++) {
//			char c=str.charAt(i);
//			charArray[i]=c;
//		}
//		System.out.print(str);
//	}
//	
//}
		
//		String s=new String("mynameisakulanarsingrao");
//	    int c=0;
//		char [] ans=s.toCharArray();
//		for(int i=0;i<ans.length; i++) {
//			for(int j=i+1; j<ans.length;j++) {
//				if(ans[i]== ans[j]){
//					System.out.print(" "+ans[j]);
//					c++;
//				
//				}
//			}
//		}
//		
//		System.out.println("count"+c);
		
//	}
//}
//}
//		
//		
	
   String s=new String("ameterdam");
   
   char[]collect=s.toCharArray();
   String temp="";
   for(int i=0;i<collect.length;i++) {
	   for(int j=i+1;j<collect.length;j++) {
		   if(collect[i]==collect[j]) {
			   temp=temp+collect[i]+" ";
		   }
	   }
   }
   
   System.out.print("duplicate elements are:"+" "+temp);
	}
}
   
		
		
		
		
		
		
//	       
//		int start=0;
//		int end=s.length()-1;
//		
//		while(start<end) {
//			char i=s.charAt(start);
//			char j=s.charAt(end);
//			if(i==j) {
//				System.out.print(i);
//			}
//			start++;
//			end--;
//		}
//
//	}
//
//}





//
//char[] charArray = new char[100];
//
//	int i=0;
//	int j=s.length()-1;
//    while(i<j) {
//   		char ch=s.charAt(i);
//			char sh=s.charAt(j);
//			if(ch==sh) {
//				charArray[i]=ch;
//			}
//			i++;
//			j--;
//    }
//			for(char test:charArray) {
//				System.out.print(test);
//			}
//    }
//}
//    