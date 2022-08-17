package homeworks.hw11hashmap;

public class MainHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "Bob");
        myHashMap.put(2, "Ivan");
        myHashMap.put(2, "Vlad");
        myHashMap.put(null, "Tom");
        System.out.println(myHashMap);
        myHashMap.remove(2);
        System.out.println(myHashMap);
        System.out.println("Размер коллекции: " + myHashMap.getSize());
        myHashMap.clear();
        System.out.println(myHashMap.isEmpty());
        System.out.println(myHashMap);
        myHashMap.put(1,"Rob");
        System.out.println(myHashMap);
        System.out.println(myHashMap.getSize());
    }
}
