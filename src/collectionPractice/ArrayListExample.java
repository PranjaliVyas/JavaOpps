package collectionPractice;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("peach");
        fruits.add("Mango");
        fruits.add("Pear");
        fruits.add("Apple");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        fruits.remove("Peach");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        fruits.set(4,"Kiwi");
        System.out.println(fruits);
        System.out.println(fruits.contains("Pear"));


    }
}
