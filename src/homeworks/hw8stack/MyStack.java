package homeworks.hw8stack;

public class MyStack<T> {
    private T[] stackArray;
    private int maxSize;
    private int top;

    public MyStack(int maxSize) {
        this.stackArray = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
        this.top = -1;
    }

    public void push(T element) {
        stackArray[++top] = element;
    }

    public T pop() {
        return stackArray[top--];
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
