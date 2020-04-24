package queue.circular;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee joneDoe = new Employee("Jone", "Doe", 4567);
		Employee marysmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		ArrayQueue queue=new ArrayQueue(5);
		
		queue.add(janeJones);
		queue.add(joneDoe);
		queue.remove();
		queue.add(marysmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(billEnd);
		queue.add(mikeWilson);
		queue.add(billEnd);
		queue.add(mikeWilson);
		
		System.out.println("----------------------------------------------");
		
		queue.printQueue();
	}

}
