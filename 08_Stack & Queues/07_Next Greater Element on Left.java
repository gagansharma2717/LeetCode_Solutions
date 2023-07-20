
import java.util.*;

public class Solution {
    public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ans.add(0);
        }

        // Stack, to keep track of next greater element.
        Stack<Integer> s = new Stack<Integer>();

        // Traverse in reverse fashion in the array.
        for (int i = 0 ; i < n; i++) {

            /*
                current element is greater than stack's top element, we can pop it since now
                it will never get picked as the next greater, because current element is
                greater and appear earlier.
            */
            while (!s.empty() && s.peek() <= arr.get(i)) {

                s.pop();
            }

            /*
                If stack is not empty, stack's top element is the next greater element, else
                there is none.
            */
            if (!s.empty()) {

                ans.set(i, s.peek());
            }

            else {

                ans.set(i, -1);
            }

            // Push current element onto stack.
            s.push(arr.get(i));
        }

        return ans;
    }
}