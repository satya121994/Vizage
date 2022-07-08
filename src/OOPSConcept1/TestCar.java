package OOPSConcept1;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW ();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("-------------");
		
		Car c = new Car();;
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("----------");
		
		Car c1 = new BMW ();
//child class object can be referred by parent class reference variable --dynamic polymporphism--run time polymporphism		
		c1.start();
		c1.stop();
		c1.refuel();
		
		BMW b1 = (BMW) new Car();
		
		//
		
		
		
		
		
	}

}
