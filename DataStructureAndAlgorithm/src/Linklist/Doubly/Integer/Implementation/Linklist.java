package Linklist.Doubly.Integer.Implementation;

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
