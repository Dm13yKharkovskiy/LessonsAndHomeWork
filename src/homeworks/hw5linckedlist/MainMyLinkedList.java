package homeworks.hw5linckedlist;

public class MainMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        System.out.println(myLinkedList);
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        System.out.println(myLinkedList);
        myLinkedList.add("after second", 2);
        System.out.println(myLinkedList);
        myLinkedList.add("after third", 4);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList);
        myLinkedList.remove(4);
        System.out.println(myLinkedList);
        myLinkedList.remove("third");
        System.out.println(myLinkedList);
        myLinkedList.remove("first");
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList.isEmpty());
    }
}
