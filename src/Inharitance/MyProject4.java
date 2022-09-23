package Inharitance;

public class MyProject4 {

int Total1=18;
static int b=5;


public void cousins1(){
    int bco = 4;
    int vco = 7;
    int me =2;
    int total= bco+vco+me-2;
        System.out.println("BCousins are : 3  , VCousins are : 6 , total= "  +  total);
}

    public static int division(int B, int V) {
        int T= B/V+b;
        return T;


    }


    public static void main(String[] args) {
        MyProject4 c = new MyProject4();
        c.cousins1();
        System.out.println(division(12,6));
MyProject4 F =new MyProject4();
System.out.println(F.Total1);
    }



}
