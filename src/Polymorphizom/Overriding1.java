package Polymorphizom;


public class Overriding1 extends OverRiding {
    static int f = 13;

    public static void Subtraction() {
        int p = 3;
        int q = 2;
        int r = 8;
        int s = f - r;
        System.out.println(s);
    }
    public static void addition() {
        int a = 2;
        int b = 2;
        int c = 5;
        int d = 2;
      int addition = a+b+c+d;
        System.out.println(addition);

    }


    public static void main(String[] args) {
        addition();
        Subtraction();
    }






}