package oopconceptpart2;

public class Appolohospital implements USMedical,UKMedical,IndiaMedical{

	public static void main(String[] args) {
		

	}

	@Override
	public void radiology() {
		System.out.println("Radiology>>>>>>>>>>>>>>>>>>>");
		
	}

	@Override
	public void chemotherapy() {
		System.out.println("Chemotherepy>>>>>>>>>>>>>>>>");
		
	}

	@Override
	public void archilogy() {
		System.out.println("Archiology>>>>>>>>>>>>>>>>>>");
		
	}

	@Override
	public void NHSEngland() {
		System.out.println("NHSEngland>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void NHSWales() {
		System.out.println("NHSWales>>>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void NHSScotland() {
		System.out.println("NHSScotland>>>>>>>>>>>>>>>>>");
		
	}

	@Override
	public void cardiologst() {
		
		System.out.println("cardiolgist>>>>>>>>>>>>>>>>>");
	}

	@Override
	public void Skinspecialt() {
		System.out.println("Skin specilist>>>>>>>>>>>>>>");
		
	}
	

	@Override
	public void Eyespecialist() {
		System.out.println("Eye specialist>>>>>>>>>>>>>");
		
	}
	
	//Non overidden methods
	public void neurology(){
		System.out.println("Neuroloy specialist>>>>>>>>>>>>>>");
	}
	
	public void operations(){
		System.out.println("operations>>>>>>>>>>>>>>");
	}

	@Override
	public void cardiology() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void polio() {
		// TODO Auto-generated method stub
		
	}

	

	

}
