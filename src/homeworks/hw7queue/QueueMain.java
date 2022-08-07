package homeworks.hw7queue;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue);
        //myQueue.remove();
    }
}
