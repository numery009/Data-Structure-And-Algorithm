package stack.jdk.linkedlist;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee joneDoe = new Employee("Jone", "Doe", 4567);
		Employee marysmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		LinkedStack stack = new LinkedStack();

		stack.push(janeJones);
		stack.push(joneDoe);
		stack.push(marysmith);
		stack.push(mikeWilson);
		stack.push(billEnd);

		stack.printStack();
		
		
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack.peek());
		
		
	}

}
