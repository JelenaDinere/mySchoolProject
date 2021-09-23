import java.util.ArrayList;

public class School {
    private ArrayList<Teacher>teachers;
    private ArrayList<Student>students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;
    private static int balance;

    School(){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
        balance = totalMoneyEarned-totalMoneySpent;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        School.updateTotalMoneyEarned(totalMoneyEarned);
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static int getBalance() {
        return balance;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public static void updateTotalMoneyEarned(int moneyEarned){
    totalMoneyEarned += moneyEarned;
    }
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent +=moneySpent;
    }
}
