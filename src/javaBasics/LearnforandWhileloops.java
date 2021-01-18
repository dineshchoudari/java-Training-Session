package javaBasics;

public class LearnforandWhileloops {

	public static void main(String[] args) {
		
		//1.while loop:
		// disadvantage of while loop:it will generate infinite loop
		//if we dont give incremental part or decremental part
		int i=1;
		while(i<10){
			System.out.println(i);
			i++;
		}
		System.out.println("***************************");
		
		//2.For loop
		// print 1 to 10
		for(int j=1;j<=10;j++){
			System.out.println(j);	
		}	
		System.out.println("*************");
		for(int k=10;k>=1;k--){
			System.out.println(k);
		}

	}

}
