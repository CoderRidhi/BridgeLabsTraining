import java.util.Stack;
class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> minStack;
    public MinStack() {
        stack1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        stack1.push(value);
        if(minStack.isEmpty()||value<=minStack.peek())
        {
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(stack1.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
public class Main {
    public static void main(String[] args) {

        MinStack stack = new MinStack();

        stack.push(5);
        System.out.println("Pushed: 5");
        System.out.println("Minimum: " + stack.getMin());

        stack.push(3);
        System.out.println("Pushed: 3");
        System.out.println("Minimum: " + stack.getMin());

        stack.push(7);
        System.out.println("Pushed: 7");
        System.out.println("Minimum: " + stack.getMin());

        stack.push(2);
        System.out.println("Pushed: 2");
        System.out.println("Minimum: " + stack.getMin());

        stack.push(2);
        System.out.println("Pushed: 2");
        System.out.println("Minimum: " + stack.getMin());

        System.out.println("\nTop Element: " + stack.top());

        stack.pop();
        System.out.println("\nAfter Pop");
        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());

        stack.pop();
        System.out.println("\nAfter Pop");
        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());

        stack.pop();
        System.out.println("\nAfter Pop");
        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());
    }
}