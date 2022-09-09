package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="madam";
      String rev="";
      int length = name.length();
      char[] charArray = name.toCharArray();
      
     // System.out.println(name);
      //System.out.println(length);
     for(int i=length-1;i>=0;i--) {
    	 rev=rev+name.charAt(i);
    	 //System.out.println(i);
    	 }
    	 if(name.equals(rev)){
    		 System.out.println("Palindrome");
    	 }
    	 else {
    		 
    		 System.out.println("Not a Palindrome");
    	  
    	  
      }
		
	}

}
