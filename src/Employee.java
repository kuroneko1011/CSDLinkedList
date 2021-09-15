package Employee;
public class Employee {
    private String code, name;
    private int salary;

    public Employee() {

    }

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean equals(Employee e) {
        return e.getCode().equals(this.getCode()) && 
        e.getName().equals(this.getName()) && e.getSalary() == this.getSalary();
    }

    public String toString() {
        return code + "\t" + name + "\t" + salary;
    }
}   
