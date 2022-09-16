package Inharitance;

public class MyProject1 {


    int children = 2;
    //Number of children are 2
    static String familyName = "VyasFamily";


    public static int OurFamily() {
        int child = 2;
        int adult = 4;
        int total = 6;
        int t = total - child;
        return t;

    }

    public void familyMember(int adult, int child) {
        int Member = adult + child;
        System.out.println("Total familyMembers : " + Member);
    }


    public static void main(String[] args) {
        System.out.println(familyName);

        MyProject1 familyDetails = new MyProject1();
        familyDetails.familyMember(4, 2);
        System.out.println("Adult Members : " + OurFamily());
        MyProject1 familyDetail = new MyProject1();
        int y = familyDetail.children;
        System.out.println("ChildMembers  :" + y);
    }
}
