package queue;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee joneDoe = new Employee("Jone", "Doe", 4567);
		Employee marysmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		ArrayQueue queue=new ArrayQueue(2);
		
		queue.add(janeJones);
		queue.add(joneDoe);
		queue.add(marysmith);		
		queue.add(mikeWilson);
		queue.add(billEnd);
		
		//queue.printQueue();
		
		//queue.remove();
		//queue.remove();
		
		//queue.printQueue();
		
		//System.out.println(queue.peek());
		
		//queue.printQueue();
		
		//queue.remove();
		//queue.remove();
		//queue.remove();
		//queue.remove();
		
		//queue.add(billEnd);
		
		System.out.println("----------------------------------------------");
		
		queue.printQueue();
	}

}
