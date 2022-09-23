package Inharitance;

public class InheritanceMultiLevel2 extends InheritanceMultiLevel1 {

    public void myDivision(){
        int x= 25;
        int y=10;
        int z=x/y;
        System.out.println("Division of z : "  +  z);
    }


    public static void main(String[] args) {
        InheritanceMultiLevel2 P = new InheritanceMultiLevel2();
        P.myDivision();
        //static method through inheritance method and variable can access through current class as it require all the property from parent class
         // from parent class
         InheritanceMultiLevel2.addition();
        System.out.println("subtraction of c  :  "  + InheritanceMultiLevel2.subtraction());

    }
}



