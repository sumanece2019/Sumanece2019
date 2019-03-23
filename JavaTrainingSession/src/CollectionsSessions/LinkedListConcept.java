package CollectionsSessions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList <String> ll = new LinkedList <String> ();
		
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("size of ln:"+ll.size());
		System.out.println("contents of ln"+ll);
		
		ll.addFirst("FirstElement");
		ll.addLast("LastElement");
		
		System.out.println("contents of ln"+ll);
		
		//get
		System.out.println(ll.get(3));
		
		//set
		ll.set(3, "New value");
		ll.set(ll.size()-1, "Last value");
		
		System.out.println("contents of ln"+ll);
		
		System.out.println("size of ln:"+ll.size());
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("contents of ln"+ll);
		
		System.out.println("-----");
		ll.remove(2);
		
		System.out.println("contents of ln"+ll);
		
		//print all the values of LinkedList:
		//for loop
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("value :"+ll.get(i));
		}
		System.out.println("-----");
		
		//advance for loop
		for(String str: ll)
		{
			System.out.println("Adv For Loop:"+str);
		}
		
		//iterator
		System.out.println("-----");
		
		Iterator <String> itr = ll.iterator();
		//String str;
		
		while(itr.hasNext())
		{
			//str=itr.next();		
			System.out.println("Iterator:"+itr.next());
		}
		
		//while loop
		int cnt = 0;
		while(cnt<ll.size())
		{
			System.out.println("While Loop:"+ll.get(cnt));
			cnt++;
		}
		
	}

}
