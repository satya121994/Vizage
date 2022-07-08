package OOPSConcept1;

public class CallbyValueandCallbyRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallbyValueandCallbyRef obj = new CallbyValueandCallbyRef();
		int x = 10;
		int y = 20;
		
		obj.testsum(x, y);
		
		obj.p =290;
		obj.q = 397;
		
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);

		

	}

	public int testsum(int a ,int b) {
		a =30;
		b =40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallbyValueandCallbyRef t) {
		int temp;
		temp =t.p;
		t.p =t.q;
		t.q =temp;
	}
	
}
