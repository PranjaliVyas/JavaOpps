package collectionPractice;

import java.util.LinkedList;

public class LinkList {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("peach");
        fruits.add("Mango");
        fruits.add(" ");
        fruits.add("Pear");
        fruits.add("Apple");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        fruits.remove("Peach");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        fruits.set(4, "Kiwi");
        System.out.println(fruits);


    }
}