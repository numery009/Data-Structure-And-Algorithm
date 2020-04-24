package hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Challenge {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee joneDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		employeeList.add(janeJones);
		employeeList.add(joneDoe);
		employeeList.add(marySmith);
		employeeList.add(mikeWilson);
		employeeList.add(billEnd);
		employeeList.add(joneDoe);
		employeeList.add(marySmith);

		employeeList.forEach((employee) -> System.out.println(employee));

		HashMap<Integer, Employee> employeeTable = new HashMap<Integer, Employee>();

		for (Employee employee : employeeList) {
			if (!employeeTable.containsKey(employee.getId())) {
				employeeTable.put(employee.getId(), employee);
			}
		}

		System.out.println("------------------------------------------");

		employeeList.clear();

		for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
			// System.out.println(entry);
			employeeList.add(entry.getValue());
		}

		employeeList.forEach((employee) -> System.out.println(employee));

	}

}
