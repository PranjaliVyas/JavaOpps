package Excaption;

public class ExampleOfException extends Throwable {
    public static void main(String[] args) {
        int[] familyNumber= new int[1];
        String[] myFamily = new String['p'];
        try {
        familyNumber = new int[]{4,3,2,1};
            myFamily = new String[]{"Devanshi", "Dhanvi", "ram", "pranjali"};
            System.out.println(myFamily[7]);
            System.out.println(myFamily[2]);
            System.out.println(familyNumber[1]);
        } catch (Exception e) {
            System.out.println("Out of number");
            System.out.println(myFamily[2]);
            System.out.println(familyNumber[1]);
            System.out.println(myFamily[4]);
        }
    finally {
            System.out.println("The try catch is finished");
            System.out.println(familyNumber[2]);
            System.out.println(familyNumber[3]);
        }
        System.out.println(familyNumber[2]);
    }
}