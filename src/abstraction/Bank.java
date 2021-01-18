package abstraction;

public  abstract class Bank {
	
	public abstract void loan();
	
	public void debit(){
		System.out.println("Bank--Debit");
	}
	
	public void credit(){
		System.out.println("Bank---Credit");
	}

}
