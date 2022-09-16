package Inharitance;

public class MyProject3 {
static int family= 13;

    String familyName = "B Family";



public int familyMembers() {
    int B = 2;
    int H = 2;
    int R = 2;
    int P = 2;

    return B + H + P + R;


}

public static int children(){
    int t= 3;
    int v= 2;
    int a=8;
    int b = family-a;
    return b;

}

    public static void main(String[] args) {
    MyProject3 a = new MyProject3();
    System.out.println(a.familyName);
        MyProject3 F = new MyProject3();
        System.out.println("AdultMember  : " + F.familyMembers());
        System.out.println("childrenMember  :  "  + children());
        System.out.println(family);


    }



}
