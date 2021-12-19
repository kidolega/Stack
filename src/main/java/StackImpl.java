import java.util.Stack;

public class StackImpl {

    private final Stack<Integer> mainStack = new Stack<>();
    private final Stack<Integer> auxStack = new Stack<>();

    void push(int value) {
        if (mainStack.isEmpty()) {
            auxStack.push(value);
        } else {
            if (auxStack.peek() >= value) {
                auxStack.push(value);
            }
        }
        mainStack.push(value);
    }

    int pop() {
        if (auxStack.peek().equals(mainStack.peek())) {
            auxStack.pop();
        }

        return mainStack.pop();
    }

    int peekMin() {
        return auxStack.peek();
    }
}
