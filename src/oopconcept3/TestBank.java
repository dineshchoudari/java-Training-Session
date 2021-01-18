package oopconcept3;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic=new ICICIBank();
		
		ic.Credit();
		ic.Debit();
		ic.TransferMoney();
		ic.NroAccount();
		
		ic.Carloan();
		ic.Educationloan();
		ic.HomeLoan();
		
		
		ic.NRIAccount();
		ic.MutualFunds();
		
		
		System.out.println(USBank.min_balance);

	}

}
