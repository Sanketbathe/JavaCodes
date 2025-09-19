
import java.util.*;

public class StackDemo2 {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display stack
        System.out.println("Stack: " + stack);

        // Peek (get top element)
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after pop: " + stack);

    }
}
