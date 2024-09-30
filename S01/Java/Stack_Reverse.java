public class Stack_Reverse {
    private static final int MAX_SIZE = 6;
    private static int[] stack = new int[MAX_SIZE];
    private static int top = -1;

    public static void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = element;
        }
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static boolean isFull() {
        return (top == MAX_SIZE - 1);
    }

    public static void main(String[] args) {
        // Push data into the stack (2-6-9-1-4-8)
        push(2);
        push(6);
        push(9);
        push(1);
        push(4);
        push(8);

        // Reverse the stack into a new stack
        int[] reversedStack = new int[MAX_SIZE];
        int reversedTop = -1;

        while (!isEmpty()) {
            int element = pop();
            reversedStack[++reversedTop] = element;
        }

        // Display the reversed stack
        System.out.println("Reversed Stack elements: ");
        while (reversedTop != -1) {
            System.out.println(reversedStack[reversedTop--]);
        }
    }
}