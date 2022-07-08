package OOPSConcept;

public class FunctionsinJava {

	//main method    ---starting point of execution 
	public static void main(String[] args) {
		
		//one object will be created ,obj is the reference variable ,referring to this object.
		//after creating the object the copy of all non -static methods will be given to this object.
		FunctionsinJava obj = new FunctionsinJava();
		
		obj.test();
		
		int l =obj.pqr();
		System.out.println(l);
		
		String s =obj.qa();
		System.out.println(s);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		//main method is void because will never write return statement inside the main method
		//main method is void ---never return a value 
		//return means come out of some output
		
		
	}

	//non static methods 
	
	//void does not return any value 
	//return type ---void 
	public void test() {
		System.out.println("test method");
	}
	
	//return type ---int
	public int pqr () {
		System.out.println("pqr method ");
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//return type ---String
	public String qa () {
		System.out.println("qa method");
		
		String s = "Hello";
		String s1 = "Hi this is satya";
		
		return s;
	}
	
	//x,y --->input parameters/arguments 
	public int division(int x, int y) {
		System.out.println("division method ");
		
		int d = x/y;
		return d;
	}

	
}
