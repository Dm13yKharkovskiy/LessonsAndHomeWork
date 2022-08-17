package homeworks.hw11hashmap;

public interface HashMapInterface<K, V> {

    public void put(K key, V value);

    public boolean remove(K key);

    public int getSize();

    public void clear();

    public boolean isEmpty();
}
