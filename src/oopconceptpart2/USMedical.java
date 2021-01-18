package oopconceptpart2;

public interface USMedical extends WHO{
	
	int minfee=10;
	
	public  void radiology();
	
	public void chemotherapy();
	
	public void archilogy();
	
	public void cardiology();
	
	
	
	public static void emergenyservises(){
		System.out.println("US emergency services");
		
	}
	
	default void internship(){
		System.out.println("US ..........Internship method");
	}

}
