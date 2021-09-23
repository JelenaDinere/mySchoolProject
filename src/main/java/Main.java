import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    School nyu = new School();
    Scanner scanner = new Scanner(System.in);
    //Create a method in the school class that return the balance of the school "getBalance"
    //in your main class create a menu that allows you to do the following
        /*
        1. get all students
        2. get all teachers
        3. Add a new teacher to the school //User inputs the values for the teachers id, name and salary
        4. Add a new student to the school //User inputs the values for the students id, name and grade
        5. Pay all the teachers salary
        6. get total money earned by the school
        7. Pay fees for a student with the students id
        8. get the school balance
         */
    public static void main(String[] args) {

        Main main = new Main();
        main.showMenu();

    }

    void showMenu() {

        String userInput = "";

        do {
            System.out.println("Welcome to the menu, please choose activity: ");
            System.out.println("1. View All Students");
            System.out.println("2. View All Teachers");
            System.out.println("3. Add a new teacher to the school");
            System.out.println("4. Add a new student to the school");
            System.out.println("5. Pay all the teachers salary");
            System.out.println("6. Get total money earned by the school");
            System.out.println("7. Pay fees for a student with the students id");
            System.out.println("8. Get school balance");
            System.out.println("");

            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit":
                case "QUIT":
                    System.out.println("Exiting Application...");
                    break;
                //get All students
                case "1":
                  getStudents();
                    break;
                case"2":
                    //getTeachers();
                    break;
                case "3":
                    //addTeacher();
                    break;
                case"4":
                    addStudent();
                    break;
                case"5":
                    //payTeachersSalary;
                    break;
                case"6":
                    //getTotalMoneyEarned;
                    break;
                case"7":
                    //getFeesPaid;
                    break;
                case"8":
                    //getBalance;

                default:
                    break;
            }
        } while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }

  //  I get all the students from the List of NYU school;
  //  This list we  created in School Class. With getStudents method we called it;
    void getStudents(){

        ArrayList<Student>allStudents= nyu.getStudents();
        for (Student student : allStudents) {
            Student jelena = new Student(103, "Jelena", 8);
            Student katrina = new Student(108, "katrina", 10);
            nyu.addStudent(jelena);
            nyu.addStudent(katrina);
            System.out.println("Student info\n" + student.getId() + "" +student.getName() + "" + student.getGrade());
}
    }
    void addStudent() {

        System.out.println("Add Student");
        Student student = new Student(scanner.nextInt(), scanner.nextLine(), scanner.nextInt());
        System.out.println("New student info\n: ");
        student.getId();
        student.getName();
        student.getGrade();
        nyu.addStudent(student);
    }
    }


//        System.out.println(karina.getGrade());
//        System.out.println(karina.getFeesPaid());
//        System.out.println("Total paid by karina  " + karina.getFeesPaid());
//karina.payFees(500);
//        System.out.println("Total paid by karina  " + karina.getFeesPaid());
//        karina.payFees(4000);
//        System.out.println("Total paid by karina  " + karina.getFeesPaid());
//        nyu.addStudent(karina);
//
//        for(Student student: nyu.getStudents()){
//            System.out.println("Student name\n" + student.getName());
//        }
//        System.out.println("Total amount earned NYU"+ nyu.getTotalMoneyEarned());
//    }







        //initializing am instance of school into the variable "nyu"
//        School nyu = new School();
//        School random = new School();
//        System.out.println(nyu.getTotalMoneyEarned());

        //Create some students
//        Student karina = new Student(101, "Karina", 6);
//        Student maija = new Student(102, "Maija", 10);

        //To use methods in a particular class, create an instance of that class and call the method from that instance.. e.g karina.getFeesPaid()
//        System.out.println("Total fees paid by karina: " + karina.getFeesPaid());
//
//        karina.payFees(5000);
//        karina.payFees(4000);
//
//        System.out.println("Total fees paid by karina: " + karina.getFeesPaid());
//
//        System.out.println("Total fees paid by Maija: " + maija.getFeesPaid());

        //Adds karina and Maija to the students in nyu
//        nyu.addStudent(karina);
//        nyu.addStudent(maija);

        //Loops through the arraylist of students returned from nyu.getStudents() and prints the student name to the console
//        for (Student student: nyu.getStudents()) {
//            System.out.println("Student name: " + student.getName());
//        }
//
//        maija.payFees(10000);
//
//        System.out.println("Total money earned by NYU is: " + nyu.getTotalMoneyEarned());


        //I am able to use this methods with the School class because they are static methods. because static methods belong to the type it self and not the instance
//        School.setMotto();
//        System.out.println(School.getMotto());
//
//        Teacher david = new Teacher(101, "David", 1000);
//        Teacher zino = new Teacher(102, "Zino", 1500);

//        System.out.println("Total salary received by David is: " + david.getSalaryEarned());
//        System.out.println("Total money spent by school: " + nyu.getTotalMoneySpent());
//
//        david.receiveSalary();
//        zino.receiveSalary();

//        System.out.println("Total salary received by David is: " + david.getSalaryEarned());
//        System.out.println("Total money spent by school: " + nyu.getTotalMoneySpent());
//
//
//        System.out.println("school balance is " + (nyu.getTotalMoneyEarned() - nyu.getTotalMoneySpent()));
//
//
//         */
