package Linklist.Singly;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		
		
		EmployeeLinkedList list = new EmployeeLinkedList();
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
	}

}
