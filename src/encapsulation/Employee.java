package encapsulation;

public class Employee {

    private String Name;
    private int id;
    private int age;
    private double salary;

    public Employee(){
      this.Name = "Musa";
      this.age = 22;
      this.id = 11;
      this.salary=3000.00;

    }

    public Employee(String name, int id, int age, double salary) {
        Name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
