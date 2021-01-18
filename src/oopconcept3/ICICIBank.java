package oopconcept3;

public class ICICIBank implements USBank,RBIBank {

	@Override
	public void Educationloan() {
		System.out.println("Educationloan......");
	}

	@Override
	public void Carloan() {
		System.out.println("Carloan.........");
		
	}

	@Override
	public void HomeLoan() {
		System.out.println("HomeLoan..........");
		
	}

	@Override
	public void Debit() {
      System.out.println("deb........");
		
	}

	@Override
	public void Credit() {
		 System.out.println("credit........");
		
	}

	@Override
	public void TransferMoney() {
		 System.out.println("Transfermoney........");
		
	}
	//Non overidden methods 
	
	public void NRIAccount(){
		System.out.println("NRI account");
	}
	
	public void MutualFunds(){
		System.out.println("Mutual funds ");
	}

	@Override
	public void NroAccount() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
