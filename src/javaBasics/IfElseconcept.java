package javaBasics;

public class IfElseconcept {

	public static void main(String[] args) {
		
		int a=300;
		int b=20;
		
		if(b>a){
			System.out.println("b is greater than a");
		}else{
			System.out.println("a is greater than b");
		}
		//comparison operators
		//<,>,<=,>=,==,!=
		 int c=20;
		 int d=10;
		 
		 if(c==d){
			 System.out.println("c is equal to d");
		 }else{
			 System.out.println("c is not equal to d");
			 
		 }
		  int a1=100;
		  int b1=200;
		  int c1=300;
		  
		  if(a1>b1&a1>c1){
			  System.out.println("a1 is greatest");
		  }else if(b1>c1){
			  System.out.println("b1 is  greatest");
		  }else{
			  System.out.println("c1 is greatest");
		  }
				  

	}
 
}
