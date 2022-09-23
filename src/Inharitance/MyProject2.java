package Inharitance;

public class MyProject2 extends MyProject1{
    int t = 9;
static int BCousins = 3;



public void myCousins(){
    int J= 2;
    int H=2;
    int M =2;
    int c = J+H+M-t;
    System.out.println("allBCousins  : "  +  c);
}

    static int vyasCousins(int M, int  h, int m) {
        return  M+m+h;
    }




    public static void main(String[] args) {
      MyProject2 C =new MyProject2();
      C.myCousins();
        System.out.println("VyasCousins   :"  +  vyasCousins(2,2,2));
        System.out.println("BCousins  : " + BCousins);
        // non-static method and variable of parent class can be accessed by object creation from current class and other class
        MyProject1 obj1 =new MyProject1();
        obj1.familyMember(4,2);
          MyProject1.ourFamily();// static method and variable can access by class name from other and current class
// nonstatic method through inheritance method and variable can access by object of current class as it acquire all property from parent class
        MyProject2 fDetail =new MyProject2();
        //from parent class MyProject1
        fDetail.familyMember(10,8);
        System.out.println(fDetail.children);
        //from current class
        fDetail.myCousins();
        System.out.println(fDetail.t);
//static method through inheritance method and variable can access through current class as it require all the property from parent class
      // from parent class
        MyProject2.ourFamily();
        System.out.println(MyProject2.familyName);
vyasCousins(2,2,2);
        System.out.println(BCousins);
}
}
