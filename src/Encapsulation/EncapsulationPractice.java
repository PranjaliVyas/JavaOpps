package Encapsulation;
// idea behind encapsulation is to hide the implimentation details from users. If data member is private it means it can only be accessed within the same class.
// No outside CLASS Can access private data member(variable) of other class.
//In object oriented programming, encapsulation is define as binding togather the data and the functions that manipulates them.
// consider areal life example of encapsulation, in a company there are
//different sections like the accounts section, finance section , sales section etc.
public class EncapsulationPractice {
    private  String myName;

    private  long MyNumber;

    private  int HouseNo;
    // hiding the variable of a class from other classes and giving access to them only through methods (SETTER AND GETTER). Hance, encapsulation in java language means binding the data (variables)
    //with the code(methods settr and getter)
    // getter amd setter Methods

    public  long getMyNumber() {
        return  MyNumber;
    }

    public  String getMyName(){
        return myName;
    }
    public int getHouseNo(int ){
      return  HouseNo;
    }

    public void setMyName(String name) {
        myName = name;
    }
public void setMyNumber(long number){
        MyNumber= number;
    }
public void setHouseNo(int houseNo){
        HouseNo= HouseNo;

}
}
