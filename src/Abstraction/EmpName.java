package Abstraction;

class EmpName extends EmpInfo {
    String EmpDetail() {
        return ("pranjali");
    }
}

class  EmpNo extends EmpInfo{
    String EmpDetail(){
return ("1245");
    }
}
class EmpNi extends EmpInfo{
    String EmpDetail(){
        return("1256733222");
    }
}
class EmpSalary extends EmpInfo {
    String EmpDetail() {
        return ("15550");
    }


    public static void main(String[] args) {
        EmpName x = new EmpName();  // needs to call method with variable
        System.out.println(x.EmpDetail());
      EmpNo y = new EmpNo();
        System.out.println(y.EmpDetail());
      EmpNi Z = new EmpNi();
        System.out.println(Z.EmpDetail());
       EmpSalary A = new EmpSalary();
        System.out.println(A.EmpDetail());
    }
}




