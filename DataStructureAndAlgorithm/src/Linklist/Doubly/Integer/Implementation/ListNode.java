package Linklist.Doubly.Integer.Implementation;

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
