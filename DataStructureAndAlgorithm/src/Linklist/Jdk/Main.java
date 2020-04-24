package Linklist.Jdk;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marySmith);
		list.addFirst(mikeWilson);
		
		Iterator iter=list.iterator();
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<->");
		}
		System.out.print("Null");
		
		
		
		System.out.println();
		list.addLast(billEnd);
		System.out.println("After adding Bill");
		iter=list.iterator();
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<->");
		}
		System.out.print("Null");
		
		
		System.out.println();
		list.removeFirst();
		System.out.println("After removing First");
		iter=list.iterator();
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<->");
		}
		System.out.print("Null");
		
		
		System.out.println();
		list.removeLast();
		System.out.println("After removing last");
		iter=list.iterator();
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<->");
		}
		System.out.print("Null");
		
		
	}

}
