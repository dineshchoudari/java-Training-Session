package javainterviewquestions;

public class Reversestring {
        //Method 1
	public static void main(String[] args) {
		
		String s="Selenium";
		String rev="";
		int len=s.length();
		System.out.println(len);
		
		for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);
		//System.out.println(rev);	
	}
		System.out.println(rev);
		
	   //Method 2 
	
	   StringBuffer sf =new StringBuffer(s);
	   
	   System.out.println(sf.reverse());  
	    
	}}
        
