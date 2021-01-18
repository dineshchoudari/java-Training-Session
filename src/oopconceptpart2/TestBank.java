package oopconceptpart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USbank.min_balance);
		
		Barclays b=new Barclays();
		b.credit();
		b.debit();
		b.transfermoney();
		b.carloan();
		b.studentloan();
		
	    USbank u=new Barclays();
	    u.credit();
	    u.debit();
	    u.transfermoney();
	

	}

}
