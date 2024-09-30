import java.util.*;

public class DataStructure {

    // Stack
    static class Stack {
        private int top;
        private final int[] stackArray;
        private final int maxSize;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == maxSize - 1);
        }

        public void push(int value) {
            if (!isFull()) {
                stackArray[++top] = value;
            } else {
                System.out.println("Stack is full.");
            }
        }

        public int pop() {
            if (!isEmpty()) {
                return stackArray[top--];
            } else {
                System.out.println("Stack is empty.");
                return -1;
            }
        }

        public void displayStack() {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Queue
    static class Queue {
        private final int[] queueArray;
        private int front, rear, size, maxSize;

        public Queue(int maxSize) {
            this.maxSize = maxSize;
            queueArray = new int[maxSize];
            front = size = 0;
            rear = maxSize - 1;
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public boolean isFull() {
            return (size == maxSize);
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }
            rear = (rear + 1) % maxSize;
            queueArray[rear] = item;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int item = queueArray[front];
            front = (front + 1) % maxSize;
            size--;
            return item;
        }

        public void displayQueue() {
            System.out.print("Queue (front to rear): ");
            int current = front;
            for (int i = 0; i < size; i++) {
                System.out.print(queueArray[current] + " ");
                current = (current + 1) % maxSize;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Create stack and queue objects
            Stack stack = new Stack(size);
            Queue queue = new Queue(size);

            System.out.println("Enter " + size + " integer values:");
            for (int i = 0; i < size; i++) {
                int value = scanner.nextInt();
                stack.push(value);
                queue.enqueue(value);
            }

            System.out.println("\nChoose an operation:");
            System.out.println("1. Display Stack");
            System.out.println("2. Display Reversed Stack");
            System.out.println("3. Display Queue");
            System.out.println("4. Display Reversed Queue");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stack.displayStack();
                    break;
                case 2:
                    displayReversedStack(stack);
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    displayReversedQueue(queue);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to exit from this program? [y/n]");
            String yourChoice = scanner.next();
            if (yourChoice.equalsIgnoreCase("y")) {
                System.out.println("Thankyou");
                System.exit(0);
            } else {
                System.out.println(" ");
            }
        } while (true);
    }

    // Method to display reversed stack
    public static void displayReversedStack(Stack stack) {
        Stack tempStack = new Stack(stack.maxSize);
        while (!stack.isEmpty()) {
            int value = stack.pop();
            tempStack.push(value);
        }
        tempStack.displayStack();
    }

    // Method to display reversed queue
    public static void displayReversedQueue(Queue queue) {
        Stack tempStack = new Stack(queue.maxSize);
        while (!queue.isEmpty()) {
            int value = queue.dequeue();
            tempStack.push(value);
        }
        tempStack.displayStack();
    }
}