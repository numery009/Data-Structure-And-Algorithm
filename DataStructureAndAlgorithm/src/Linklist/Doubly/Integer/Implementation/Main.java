package Linklist.Doubly.Integer.Implementation;

public class Main {

	public static void main(String[] args) {
		Linklist list = new Linklist();

		list.addToTheTop(5);

		list.addToTheBottom(1);

		list.addToTheTop(4);

		list.addToTheTop(2);

		list.addToTheBottom(100);

		list.printAll();

		list.addBefore(500, 4);

		list.printAll();

		list.addBefore(5000, 2);

		list.printAll();

		list.addBefore(50, 2);

		list.printAll();

		list.addBefore(5000000, 100);

		list.printAll();

		list.addafter(19, 100);

		list.printAll();

		list.addafter(20, 2);

		list.printAll();

		list.addafter(200, 5000);

		list.printAll();

		list.addBefore(222, 200);

		list.printAll();

		list.addafter(221, 200);

		list.printAll();

		list.addafter(221, 222);

		list.printAll();

		list.addBefore(110, 5000);

		list.printAll();

		list.addafter(13, 110);

		list.printAll();

		list.addafter(19, 5000);

		list.printAll();

		list.addafter(21, 19);

		list.printAll();

		list.addBefore(21, 19);
		list.printAll();
	}

}
