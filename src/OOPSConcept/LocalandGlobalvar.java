package OOPSConcept;

public class LocalandGlobalvar {
	
	//global vars ---class variable 
	String name = "satya";
	int age = 25;
	

	public static void main(String[] args) {
		
		 
		int i =10;
		System.out.println(i);
		
		
		LocalandGlobalvar obj = new LocalandGlobalvar ();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void sum() {
		int i =10;
		int j = 20;
		int age = 25;
	}
	
	
	
	
}
