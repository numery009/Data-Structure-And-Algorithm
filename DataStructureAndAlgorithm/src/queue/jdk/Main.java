package queue.jdk;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		System.out.println(checkForPalindrome("dad"));
		System.out.println(checkForPalindrome("Hello"));
		System.out.println(checkForPalindrome("I did, did I?"));
	}

	public static boolean checkForPalindrome(String str) {

		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();

		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				stack.push(c);
				queue.addLast(c);
			}
		}

		while (!stack.isEmpty()) {
			if (!stack.pop().equals(queue.removeFirst())) {
				return false;
			}
		}

		return true;
	}

}
