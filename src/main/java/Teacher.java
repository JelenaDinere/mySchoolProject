public class Teacher {
    private int id;
    private String name;
    private int salary;
    Teacher(int id, String name,int salary){
        this.id =id;
        this.name = name;
        this.salary =salary;

    }
public void setSalary(int salary){
        this.salary = salary;

}
public String getName(){
        return name;
}
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

}
