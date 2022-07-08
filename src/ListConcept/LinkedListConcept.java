package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String>ll = new LinkedList<>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("rpa");
		ll.add("rft");
		
		System.out.println("Content of linkedlis :"+ll);
		
		ll.addFirst("nani");
		ll.addLast("automation");
		
		System.out.println("Content of linkedlis :"+ll);
		
		System.out.println(ll.get(0));
		
		ll.set(0 , "satya");
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linkedlis :"+ll);
		
		ll.remove(2);
		System.out.println("Content of linkedlis :"+ll);
		
		for(int n =0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		
		for(String str :ll) {
			System.out.println(str);
		}
		
		Iterator<String>it = ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		int num =0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num ++;
		}
		
		
		
		
		
		
		
		
	}

}
