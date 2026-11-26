public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){
        this.id= id;
        this.name=name;
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
        else {
            System.out.println("salary must be greater then zero");
        }
    }
  public  void display() {
      System.out.println(id + " " + name + " " + salary);
    }


    public static void main(String[] args) {
        Employee e = new Employee(1,"Atul",-66666);
        e.display();

    }
}
