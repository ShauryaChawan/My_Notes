public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        // Print initial stack
        System.out.print("Stack: ");
        myStack.printStack();

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());
    }
}

class Stack {
    char[] stack;
    int top;
    int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new char[capacity];
        this.top = -1;
    }

    public void push(char element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return stack[top--];
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

//Java