package homeworks.hw8stack;

public class MyStackMain {
    public static void main(String[] args) {

        MyStack<String> myStack = new MyStack<>(10);
        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }

}
