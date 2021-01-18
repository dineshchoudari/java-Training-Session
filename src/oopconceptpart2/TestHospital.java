package oopconceptpart2;

public class TestHospital {

	public static void main(String[] args) {
		
		
		 Appolohospital ap=new Appolohospital();
		 
		
		 ap.cardiologst();
		 ap.Eyespecialist();
		 ap.Skinspecialt();
		 ap.neurology();
		 ap.NHSEngland();
		 ap.NHSWales();
		 ap.NHSScotland();
		 USMedical.emergenyservises();
		 ap.internship();
		 
		//System.out.println(ap.minfee); 
		System.out.println( USMedical.minfee);
		
		 
		 USMedical us=new Appolohospital();
		 
		 us.archilogy();
		 us.chemotherapy();
		 us.radiology();
		 
		 
		 UKMedical uk=new Appolohospital();
		 
		 uk.NHSEngland();
		 uk.NHSScotland();
		 uk.NHSWales();
		 
		 
		 
		 
		            

	}

}
