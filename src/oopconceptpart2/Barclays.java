package oopconceptpart2;

public class Barclays implements USbank,LoydsBank{
	
	public void debit(){
		System.out.println("Barclays  debit ----------");
	}
	public void credit(){
		System.out.println("Barclays  credit ------------");
	}
	public void transfermoney(){
		
		System.out.println("Barclays  transfer money ");
	}
	public void studentloan(){
		System.out.println("Barclays student loan ");
	}
	public void carloan(){
		System.out.println("Barclays  car loan");
	}

	public void mortgage() {
	    System.out.println("mortgage -----------");
		
	}

}
