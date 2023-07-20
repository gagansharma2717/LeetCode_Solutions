/*
    Time Complexity: O(N ^ 2)
    Space Complexity: O(N)

    Where N is the number of elements in Stack.
*/
import java.util.Stack;

public class Solution {

    // Function to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            // If the stack is empty, simply push the element
            stack.add(ele);
            return;
        }

        // If the stack is not empty, remove the top element
        int top = stack.pop();

        // Recursively call insertAtBottom to insert the element at the bottom
        insertAtBottom(stack, ele);

        // Push the removed top element back onto the stack
        stack.add(top);
    }

    // Function to reverse the elements of the stack
    static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            // Base case: If the stack is empty, no elements to reverse
            return;
        }

        // If the stack is not empty, remove the top element
        int top = stack.pop();

        // Recursively call reverseStack to reverse the remaining elements
        reverseStack(stack);

        // After reversing the remaining elements, insert the removed top element at the bottom
        insertAtBottom(stack, top);
    }
}