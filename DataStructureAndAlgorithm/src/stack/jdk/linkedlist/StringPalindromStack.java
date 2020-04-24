package stack.jdk.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class StringPalindromStack {

	public static void main(String[] args) {

		System.out.println(checkForPalindrome("I did, did I?"));

		System.out.println(checkForPalindrome("Hello"));

		System.out.println(checkForPalindrome("aba"));

		System.out.println(checkForPalindrome("abccba"));
	}

	public static Boolean checkForPalindrome(String str) {

		LinkedList<Character> stack = new LinkedList<Character>();
		StringBuilder stringNoPuntuation = new StringBuilder(str.length());
		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				stringNoPuntuation.append(c);
				stack.push(c);
			}
		}

		StringBuilder reverseString = new StringBuilder(stack.size());
		while (!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}

		return reverseString.toString().equals(stringNoPuntuation.toString());
	}

}
