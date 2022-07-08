package OOPSConcept;

public class Methodoverloading {

	public static void main(String[] args) {
		
	Methodoverloading obj = new Methodoverloading();
	
	obj.sum();
	obj.sum(10);
	obj.sum(10,5);

		
	//method over loading :when the method name is same with different arguments or input parameters within the same class 
	//we can overload main method also
	//you can not create a method inside a method 
	//duplicate methods --- i.e,same method name with same number of argument are not allowed 
	}

	public void sum() {
		System.out.println("sum method ---zero param");
	}
	
	public void sum(int i) {
		System.out.println("sum method ---1 input param");
		System.out.println(i);
	}
	
	public void sum(int k ,int l) {
		System.out.println("sum method ---2 input param");
		System.out.println(k+l);
	}
	
}
