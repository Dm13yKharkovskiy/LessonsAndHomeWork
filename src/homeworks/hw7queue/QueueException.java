package homeworks.hw7queue;

class QueueException extends Exception {

    public QueueException() {
        super("\u001B[31m" + "NoSuchElementException" + "\u001B[0m");
    }
}
