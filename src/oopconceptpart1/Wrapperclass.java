package oopconceptpart1;

public class Wrapperclass {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//1 .Data conversion :String to int
		
	   int i=  Integer.parseInt(x);
	   System.out.println(i+20);
	  //Integer,Double,Character,Boolean
	  
	  // 2.String to double conversion
	    
	    String y="12.33";
	    System.out.println(10+y);
	    double d= Double.parseDouble(y);
	     System.out.println(d+10);
	     
	    //string to boolean
	     String k="true";
	     boolean b= Boolean.parseBoolean(k);
	     System.out.println(b);
	     
	     //int to string conversion
	      int j=200;
	      System.out.println(j+20);
	     String sd= String.valueOf(j);
	     System.out.println(sd+20);

	}

}
