# Implment Doubly Link List for Integer


## 1) In the first step we have to create a ListNode with the following implmentation--

public class ListNode {

	private int value;

	private ListNode next;

	private ListNode previous;

	public ListNode() {

	}

	public ListNode(int value) {

		this.value = value;

	}

	public ListNode(int value, ListNode next, ListNode previous) {

		this.value = value;

		this.next = next;

		this.previous = previous;

	}

	public int getValue() {

		return value;

	}

	public void setValue(int value) {

		this.value = value;

	}

	public ListNode getNext() {

		return next;

	}

	public void setNext(ListNode next) {

		this.next = next;

	}

	public ListNode getPrevious() {

		return previous;

	}

	public void setPrevious(ListNode previous) {

		this.previous = previous;

	}

	@Override

	public String toString() {

		return "ListNode [value=" + value + ", next=" + next + ", previous=" + previous + "]";

	}

}

## 2) In the second step we will Implement the LinkList class with the following methods--

      public class Linklist {

	private int size;

	private ListNode head;

	private ListNode tail;

	public void addToTheTop(int i) {

		ListNode newNode = new ListNode(i);

		if (head == null) {

			tail = newNode;

		} else {

			head.setPrevious(newNode);
			newNode.setNext(head);
		}
		head = newNode;
		size++;

	}

	public void addToTheBottom(int i) {
		ListNode newNode = new ListNode(i);

		if (tail == null) {

			head = newNode;

		} else {

			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}

		tail = newNode;

		size++;

	}

	public boolean addBefore(int i, int beforeNumber) {
		if (head == null) {
			return false;
		}

		ListNode current = head;
		while (current != null && current.getValue() != beforeNumber) {
			current = current.getNext();
		}

		if (current == null) {
			return false;
		}

		ListNode newNode = new ListNode(i);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);
		if (head == current) {
			head = newNode;
		} else {
			newNode.getPrevious().setNext(newNode);
		}
		size++;
		return true;

	}

	public boolean addafter(int i, int afterNumber) {
		if (head == null) {
			return false;
		}

		ListNode current = head;
		while (current != null && current.getValue() != afterNumber) {
			current = current.getNext();
		}

		if (current == null) {
			return false;
		}

		ListNode newNode = new ListNode(i);
		newNode.setNext(current.getNext());
		newNode.setPrevious(current);
		current.setNext(newNode);

		if (head == current) {
			head.setNext(newNode);

		} else {
			newNode.getPrevious().setNext(newNode);
		}

		size++;
		return true;

	}

	public boolean removeFromTop() {
		if (isEmpty()) {
			return false;
		}

		ListNode removeNode = head;
		head = removeNode.getNext();
		removeNode.setNext(null);
		size--;
		return true;

	}

	public boolean removeFromBottom() {
		if (isEmpty()) {
			return false;
		}

		ListNode removeNode = tail;
		tail = removeNode.getNext();
		removeNode.setNext(null);
		size--;
		return true;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public void printAll() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.getValue());
			System.out.print("->");
			current = current.getNext();
		}
		System.out.println("null");
	}
}

## 3) Lastly we have to implement the Main class with main method

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
