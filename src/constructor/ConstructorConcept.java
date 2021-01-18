package constructor;

    public class ConstructorConcept {
	
	String name;
	int age;
    public ConstructorConcept(){// 0 parameter constructor
    	System.out.println("Defult constructor ");
	   
  }
    public ConstructorConcept(int i){// 0 parameter constructor
    	System.out.println("1 parsmeter constructor ");
    	System.out.println(i);
	   
  }
    
    public ConstructorConcept(int i,int j ){// 0 parameter constructor
    	System.out.println("2 parameter  constructor ");
    	System.out.println("2 parameter constructor ");
	   
  }
    public ConstructorConcept(String name,int age){
    	this.name=name;
    	this.age=age;
    }
   
    
    
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("TOM",20);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		

	}

}
