package OOPSConcept;

public class StaticandNonStaticmethods {

	
	String name = "satya";//non static global var
	static int age = 25;//static global var
	
	public static void main(String[] args) {
		
		//how to call static methods and var
		//1.direct calling:
		sum();
		
		//2.calling by class name 
		StaticandNonStaticmethods.sum();
		
		System.out.println(age);
		
		System.out.println(StaticandNonStaticmethods .age);
		
		//how to call non static methods and var 
		
		StaticandNonStaticmethods obj = new StaticandNonStaticmethods ();
		
		obj.sendmail();
		System.out.println(obj.name);

		//can i access static methods by using objects  reference : yes
		
		obj.sum();
		
		
		
	}
	
	public void sendmail() {
		System.out.println("sendmail  method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}
	
	
	
	

}
