package Polymorphizom;

public class OverLoading {

    public void add(int a, int b){
        System.out.println(a+b);
    }
public void add(float a, int b, int c){
    System.out.println(a+b+c);
    }
public void add(int a, int b,float c, int d){
    System.out.println(a+b+c+d);
    }


    public static void main(String[] args) {
        OverLoading P = new OverLoading();
        P.add(10,5,10.45f,22);
        P.add(4.00f,12,10);
        P.add(10,15);


    }
}
