package OOPSConcept1;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank ();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		//child class object can be referred by parent interface reference var
		
		USBank b = new HSBCBank ();
		b.credit();
		b.debit();
		b.transfermoney();
		
		System.out.println(USBank.min);
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
