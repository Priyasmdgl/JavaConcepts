package java1;

import java.util.Stack;

public class ListStack {
	public void stack() {
		Stack<String> stack = new Stack<String>();
		//insertion
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		System.out.println(stack);
		//deletion
		System.out.println(stack.pop());
		System.out.println(stack);
		//to get the top of the element
		System.out.println(stack.peek());
		//search for an element
		System.out.println(stack.search("B"));
		//is empty
		System.out.println(stack.isEmpty());
	}

	public static void main(String[] args) {
		ListStack stack = new ListStack();
		stack.stack();
	}

}
