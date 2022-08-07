package homeworks.hw7queue;
import java.util.Arrays;

public class MyQueue<T> {
    private T[] queueArray;

    private int front;
    private int back;
    private int size;

    private int capacity;

    public MyQueue() {
        this.queueArray = (T[]) new Object[1];
        this.size = 0;
        this.front = 0;
        this.back = 0;

    }

    public void add(T element) {
        if (size == 0) {
            queueArray[0] = element;
        } else {
            queueArray = Arrays.copyOf(queueArray, size + 1);
            queueArray[size] = element;
            back++;
        }
        size++;
    }

    public T element() throws QueueException {
        if (size == 0) {
            throw new QueueException();
        } else {
            return queueArray[front];
        }
    }

    public T peek() {
        return queueArray[front];
    }

    public T poll() {
        T returnFront = queueArray[front];
        if (size > 0) {
            T[] queueArrayPoll = (T[]) new Object[size - 1];
            System.arraycopy(queueArray, 1, queueArrayPoll, 0, size - 1);
            queueArray = queueArrayPoll;
            back--;
        }
        return returnFront;
    }

    public T remove() throws QueueException {
        T returnRemove = queueArray[front];
        if (size == 0) { throw new QueueException(); }
        else{
            T[] queueArrayRemove = (T[]) new Object[queueArray.length - 1];
            System.arraycopy(queueArray, 1, queueArrayRemove, 0, size - 1);
            queueArray = queueArrayRemove;
            back--;
            return returnRemove;
        }

    }

    @Override
    public String toString() {
        return  Arrays.toString(queueArray);
    }
}


