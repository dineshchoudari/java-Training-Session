package oopconceptpart1;

public class LocalvsGlobalVariables {
	
	String name ="kethan";
	int age=35;

	public static void main(String[] args) {
		
		int i=20;
		System.out.println(i);
		 LocalvsGlobalVariables obj =new  LocalvsGlobalVariables();
		 System.out.println(obj.name);
		 System.out.println(obj.age); 
		
	}
	public void sum(){
		int a=40;
		int b=20;
		int age=20;
		
	}

}
