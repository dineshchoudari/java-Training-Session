package oopconceptpart1;

public class Car {
	
	int model;
	int wheels;
	
	public static void main(String[] args) {
		
		Car a =new Car();
		Car b=new Car();
		Car c=new Car();
		
	    a.model=2015;
	    a.wheels=4;
	    
	    b.model=2020;
	    b.wheels=6;
	    
	    
	    c.model=5;
	    c.wheels=34;
		
		System.out.println("Before assigning the refferences");
		
		System.out.println(a.model);
		System.out.println(a.wheels);
		
		System.out.println(b.model);
		System.out.println(b.wheels);
		
		System.out.println(c.model);
		System.out.println(c.wheels);
		
		System.out.println("after assigning the refferences");
		
		a=b;
		b=c;
		c=a;
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(c.model);
				

	}

}
