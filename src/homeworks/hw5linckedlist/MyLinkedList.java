package homeworks.hw5linckedlist;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null) {
            newNode.prevLink = null;
            newNode.nextLink = null;
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.nextLink = newNode;
            newNode.prevLink = lastNode;
            lastNode = newNode;
        }
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (firstNode == null || index == size) {
            add(value);
        } else {
            Node newNode = new Node(value);
            Node oldNode = firstNode;
            for (int i = 0; i < index; i++) {
                oldNode = oldNode.nextLink;
            }
            Node oldPrev = oldNode.prevLink;
            oldPrev.nextLink = newNode;
            oldNode.prevLink = newNode;
            newNode.prevLink = oldPrev;
            newNode.nextLink = oldNode;
            size++;
        }


    }

    @Override
    public void remove(T value) {
        Node removeNode = firstNode;
        if (firstNode.value == value) {
            Node oldNextNode = removeNode.nextLink;
            oldNextNode.prevLink = null;
            firstNode = oldNextNode;
            size--;
            return;
        }
        if (lastNode.value == value) {
            Node oldPrevNode = lastNode.prevLink;
            oldPrevNode.nextLink = null;
            lastNode = oldPrevNode;
            size--;
            return;
        } else {
            for (int i = 0; i < size - 1; i++) {
                removeNode = removeNode.nextLink;
                if (removeNode.value == value) {
                    break;
                }
            }
            if (removeNode.value != value) {
                throw new NullPointerException();
            }
            Node oldPrev = removeNode.prevLink;
            Node oldNext = removeNode.nextLink;
            oldPrev.nextLink = oldNext;
            oldNext.prevLink = oldPrev;
            size--;
            return;
        }


    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size - 1) {
            Node newLastNode = lastNode.prevLink;
            lastNode = newLastNode;
            lastNode.nextLink = null;
        } else {
            Node removeNode = firstNode;
            for (int i = 0; i <= index; i++) {
                removeNode = removeNode.nextLink;
            }
            Node oldPrev = removeNode.prevLink;
            Node oldNext = removeNode.nextLink;
            oldPrev.nextLink = oldNext;
            oldNext.prevLink = oldPrev;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node getNode = firstNode;
        for (int i = 0; i < index; i++) {
            getNode = getNode.nextLink;
        }
        return (T) getNode.value;
    }


    public String toString() {
        Node<T> saveNode = firstNode;
        if (firstNode == null) return "Нет элементов.";
        String str = firstNode.toString();
        while (firstNode.nextLink != null) {
            str = str + ", " + firstNode.nextLink.toString();
            firstNode = firstNode.nextLink;
        }
        firstNode = saveNode;
        return str;
    }


    private static class Node<T> {
        private Node<T> prevLink;
        private Node<T> nextLink;
        private T value;

        private Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return (String) value;
        }
    }


}
