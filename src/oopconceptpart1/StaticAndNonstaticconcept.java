package oopconceptpart1;

public class StaticAndNonstaticconcept {
	
	String name="Kethan";
	static int age=89;

	public static void main(String[] args) {
		
		delete();
		StaticAndNonstaticconcept.delete();
		System.out.println(age);
		System.out.println(StaticAndNonstaticconcept.age);
		
		StaticAndNonstaticconcept obj=new StaticAndNonstaticconcept();
		obj.add();
		System.out.println(obj.name);
	}
	public void add(){
		System.out.println("add method");
	}
	public static void delete(){
		System.out.println("delete method ");
	}

}
