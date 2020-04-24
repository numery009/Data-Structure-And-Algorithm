package Chain.Hashtable;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee joneDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		ChainedHashtable ht = new ChainedHashtable();
		ht.put("Jones", janeJones);
		ht.put("Doe", joneDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);

		ht.printHashTable();

		System.out.println("Retrive Key Wilson " + ht.get("Wilson"));
		System.out.println("Retrive Key Smith " + ht.get("Smith"));

		ht.remove("Wilson");
		ht.remove("Jones");
		ht.printHashTable();

		System.out.println("Retrive Key Smith " + ht.get("Smith"));

	}

}
