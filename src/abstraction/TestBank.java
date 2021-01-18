package abstraction;

public class TestBank {

	public static void main(String[] args) {
	
		HDFCBank HB=new HDFCBank();
		  
		HB.credit();
		HB.debit();
		HB.loan();
		
		Bank b= new HDFCBank();
		b.credit();
		b.debit();
		b.loan();

	}

}
