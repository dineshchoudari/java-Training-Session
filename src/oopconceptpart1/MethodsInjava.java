package oopconceptpart1;

public class MethodsInjava {

	public static void main(String[] args) {
		
		MethodsInjava  obj=new MethodsInjava();
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
		int d1=obj.divison(30, 10);
		System.out.println(d1);
		
	}
     // Non static methods 
	// void means it does not return a value
	
	public void test(){
		System.out.println("test method ");
	}
	public int pqr(){
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;	
	}
	public String qa(){
		System.out.println("qa method ");
		String s="Selenium";
		return s;	
	}
	//Input Arguments or parameters x,y
	
	public int divison(int x,int y){
		System.out.println("divison method ");
		int d=x/y;
		return d;
		
	}
}
