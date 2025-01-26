//package strings;
//
//public class Anagrams {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*What are Anagram-> if i String characters are same as other String (even in reverse) then 
//		 * it is anagram ex   String s="vivek",   String s1="keviv";*/
//		String s="vik";
//		String s1="kviv";
//		char[]b =new char[s.length()];
//		 for(int i=0;i<s.length();i++) {
//			 int count=0;
//			 for(int j=s1.length()-1;j>=0;j--) {
//				 if(s.charAt(i)==s1.charAt(j)) {
//					 count++;
//					 if(count==1) {
//						 b[i]=s1.charAt(j);
//						 }
//					 break;
//					 
//				 }
//			 }
//		 }
//		 String h =new String(b);
//		if(s.equals(h)) {
//			System.out.print("anagram");
//		}
//		else {
//			System.out.print("not an anagram");
//		}
//		

		
		
		
		
		
		
		
		
		package strings;

		public class Anagrams {

		    public static void main(String[] args) {
		        // Input strings
		        String s = "amm";
		        String s1 = "mmas";
		        
		        // Array to store matched characters
		        char[] b = new char[s.length()];

		        for (int i = 0; i < s.length(); i++) {
		            boolean found = false; // Flag to track if a match is found
		            for (int j = s1.length() - 1; j >= 0; j--) {
		                if (s.charAt(i) == s1.charAt(j)) {
		                    found = true;
		                    b[i] = s1.charAt(j);

		                    // Mark the matched character in s1 as "used"
		                    s1 = s1.substring(0, j) + "#" + s1.substring(j + 1);
		                    break;
		                }
		            }
		            // If no match is found for a character, the strings are not anagrams
		            if (!found) {
		                System.out.print("not an anagram");
		                return;
		            }
		        }

		        // Convert char array to String
		        String h = new String(b);

		        // Compare strings
		        if (s.equals(h)) {
		            System.out.print("anagram");
		        } else {
		            System.out.print("not an anagram");
		        }
		    }
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	