package homeworks.hw11hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

class MyHashMap<K, V> implements HashMapInterface<K, V> {

    private Entry[] map;
    private int size;
    private final int DEFAULT_CAPACITY = 16;
    private final double LOAD_HASHMAP = 0.75;

    public void put(K key, V value) {
        Entry entry = new Entry<>(key, value);
        grow();
        if (map[getIndexOfHash(key)] == null) {
            map[getIndexOfHash(key)] = entry;
        } else {
            Entry tempEntry = map[getIndexOfHash(key)];
            while (tempEntry.getNextEntry() != null) {
                if (Objects.equals(tempEntry.getKey(), key)) {
                    tempEntry.setValue(value);
                    return;
                }
                tempEntry = tempEntry.getNextEntry();
            }
            if (Objects.equals(tempEntry.getKey(), key)) {

                tempEntry.setValue(value);
                return;
            }
            tempEntry.setNextEntry(entry);
        }
        size++;

    }

    public boolean remove(K key) {
        int index = getIndexOfHash(key);
        if (map[index] == null) {
            return false;
        }
        Entry deleteEntry = map[index];
        deleteEntry.setNextEntry(map[index].nextLink);
        deleteEntry = null;
        map[index] = deleteEntry;
        size--;
        return true;

    }

    public int getSize() {
        return size;
    }

    public void clear() {
        map = new Entry[0];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private int getIndexOfHash(K hash) {
        if (hash == null) {
            return 0;
        } else {
            return hash.hashCode() % map.length;
        }

    }

    private void grow() {
        if (map == null || map.length == 0) {
            map = new Entry[DEFAULT_CAPACITY];
        } else if ((double) size >= map.length * LOAD_HASHMAP) {
            Entry[] tempEntry = map;
            map = new Entry[tempEntry.length << 1];
            size = 0;
            for (Entry entry : tempEntry) {
                if (entry != null) {
                    put((K) entry.getKey(), (V) entry.getValue());
                }
            }
        }


    }


    public V get(K key) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Entry entry : map) {
            if (entry != null) {
                result.append(entry);
                result.append("\n");
            }
        }
        return result.toString();
    }

    class Entry<K, V> {
        private K key;
        private V value;

        private Entry nextLink = null;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry getNextEntry() {
            return nextLink;
        }

        public void setNextEntry(Entry next) {
            this.nextLink = nextLink;
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }
}


