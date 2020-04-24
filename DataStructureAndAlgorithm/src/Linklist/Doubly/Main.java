package Linklist.Doubly;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		System.out.println(list.isEmpty());

		list.addToHead(janeJones);
		list.addToHead(johnDoe);
		list.addToHead(marySmith);
		list.addToHead(mikeWilson);

		System.out.println(list.getSize());

		System.out.println(list.isEmpty());

		list.printList();

		list.removeFromFront();

		System.out.println(list.getSize());

		list.printList();

		Employee billEnd = new Employee("Bill", "End", 78);

		list.addToTail(billEnd);
		list.printList();
		System.out.println(list.getSize());

		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());

		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());

		list.addBefore(billEnd, janeJones);
		list.printList();
		System.out.println(list.getSize());

		list.addBefore(new Employee("Some", "One", 12), johnDoe);
		list.printList();
		System.out.println(list.getSize());

	}

}
