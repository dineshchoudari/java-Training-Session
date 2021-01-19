package constructor;

public class Car {
	
	String Name;
	int price;
	String Engine;
	//Adding variables 
	public Car(String name,int price,String engine){
		
		this.Name=name;
		this.price=price;
		this.Engine=engine;	
	} 
	public static void main(String[] args) {
		
		Car c=new Car("BMW",20,"manual");
		Car c1=new Car("Hyundai",20,"Automatic");
		Car c2=new Car("V40",20,"manual");
		
		
        System.out.println(c.Name +" "+ c1.price +" "+ c1.Engine);
	}

}
