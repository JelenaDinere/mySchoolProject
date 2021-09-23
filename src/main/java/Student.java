import java.util.UUID;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    //To create a new student object with the provided values when initializing
    //Each students school fees is 30,000 usd
    Student(int id,String name,int grade){
this.id = id;
this.name =name;
this.grade = grade;
feesPaid = 0;
totalFees = 30000;
    }

    public void setGrade(int grade) {
       this.grade = grade;

}


    //Add fees to the total amount of fees paid every time the method is called.
//    //"this" keyword refers to the current object
    public void payFees(int feeToPay){
        this.feesPaid = feesPaid+feeToPay;


    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    //returns the total fees paid by current student
    public int getFeesPaid() {
        return feesPaid;
    }

    public int getGrade() {
        return grade;
    }

    public int getTotalFees() {
        return totalFees;
    }
}
//    private int id;
//    private String name;
//    private int grade;
//    private int feesPaid;
//    private int totalFees;


//    Student(int id, String name, int grade) {
//        this.id = id;
//        this.name = name;
//        this.grade = grade;
//        feesPaid = 0;
//        totalFees = 30000;
//    }

//

//    //Add fees to the total amount of fees paid every time the method is called.
//    //"this" keyword refers to the current object
//    public void payFees(int feeToPay) {
//        this.feesPaid += feeToPay;
//        School.updateTotalMoneyEarned(feeToPay);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }

    //returns the total fees paid by current student
//    public int getFeesPaid() {
//        return feesPaid;
//    }
//
//    public int getTotalFees() {
//        return totalFees;
//    }


    //    public static void main(String[] args) {
//        int num = 4;
//
//        num += 4;
//
//        System.out.println(num);
//    }
//}
