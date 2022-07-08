package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.size());
		
		ar.add(50);
		ar.add(60);
		ar.add(70);
		ar.add(80);
		ar.add(12.33);
		ar.add("test");
		ar.add('a');
		ar.add(true);
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		
		ArrayList<String>ar2 = new ArrayList<>();
		ar2.add("test");
		ar2.add("selenium");
		
		ArrayList<E>ar3 = new ArrayList<>();
		
		Employee e1 = new Employee("satya",25,"QA");
		Employee e2 = new Employee("nani",27 ,"Dev");
		Employee e3 = new Employee("narayana",29,"Admin");
		
		ArrayList<Employee>ar4 = new ArrayList<>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator <Employee>it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			

		}
		
		System.out.println("-=-=-=-=");
		
		ArrayList<String>ar5 = new ArrayList<>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("qtp");
		
		ArrayList<String>ar6 = new ArrayList<>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		ar5.addAll(ar6);
		
		for(int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("----");
		
		ar5.removeAll(ar6);
		for(int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		ArrayList<String>ar7 = new ArrayList<>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("qtp");
		
		ArrayList<String>ar8 = new ArrayList<>();
		ar8.add("test");
		ar8.add("java");
		
		ar7.retainAll(ar8);
		
		for(int i =0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
