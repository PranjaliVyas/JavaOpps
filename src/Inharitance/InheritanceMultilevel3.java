package Inharitance;

public class InheritanceMultilevel3 extends InheritanceMultiLevel2 {
 int a= 10;

 public void Subtraction(float a, int b, int c){
  System.out.println(a-b-c);




 }

 public static void main(String[] args) {
  InheritanceMultilevel3 MyInheritance = new InheritanceMultilevel3();
  MyInheritance.Subtraction(45.09f,25,10);
  // non-static though inheritance method create object of current class it will acquire all the property of parent class
  InheritanceMultilevel3 X = new InheritanceMultilevel3();
  X.myDivision();


 }


}
