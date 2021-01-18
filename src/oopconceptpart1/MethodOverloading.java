package oopconceptpart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
	MethodOverloading obj=new MethodOverloading();
	obj.sum();
	obj.sum(10);
	obj.sum(2, 7);

	}
	public void sum(){
		System.out.println("SUM method 0 parameters");
	}
	public void sum(int a){
		System.out.println("SUM method  1 parameter");
		System.out.println(a);
	}
	public void sum(int a,int b){
		System.out.println("SUM Method with 2 input parameter");
		System.out.println(a+b);
	}

}
