package homeworks.hw5linckedlist;

public interface MyLinkedListInterface<T> {
    void add(T value);

    void add(T value, int i);

    void remove(T value);

    int size();

    void clear();

    T get(int i);


}
