package encapsulation;

public class EncapsulationResult {

    public static void main(String[] args) {
        EncapsulationPractice p= new EncapsulationPractice();
        p.setMyName("Pranajli");
        p.setMyNumber(890345678);
        p.setHouseNo(18);
        System.out.println(("My NAME:  ="+  p.getMyName()));
        System.out.println(("My number:  ="+  p.getMyNumber()));
        System.out.println(("My NAME:  ="+  p.getHouseNo()));
    }



}
