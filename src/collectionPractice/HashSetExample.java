package collectionPractice;

import java.util.HashSet;

public class HashSetExample {


    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        //add value to the set
        numbers.add(4);
        numbers.add(10);
        numbers.add(10);
        numbers.add(9);
        numbers.add(5);
        numbers.add(7);
        System.out.println(numbers);
        HashSet<String> name = new HashSet<String>();


// show which number contain 1 to 10 is found
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + "value is not found");
            } else {
                System.out.println(i + "value is not not found");
            }

        }
    }
}