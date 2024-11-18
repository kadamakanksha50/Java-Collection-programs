import java.util.*;
class stack{
	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		System.out.println("Stack: "+stack);
		System.out.println("Stack is Empty?: "+stack.isEmpty());

		stack.push("Red");stack.push("green");stack.push("Blue");stack.push("Black");stack.push("Orange");stack.push("Pink");stack.push("Yellow");stack.push("White");
		
		System.out.println("Stack after push(): "+stack);
		System.out.println("Stack after peek(): "+stack.peek());
		stack.pop();
		System.out.println("Stack after pop(): "+stack);
		System.out.println("Stack is Empty?: "+stack.isEmpty());
		stack.clear();
		System.out.println("Stack after clear(): "+stack);

	}
}