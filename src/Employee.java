public class Employee {
    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setId(int id) {
        if(id>50) {
            this.id = 0;
        }
        else {
            this.id = id;
        }

    }

    public void setSalary(float salary) {this.salary = salary;}

    public String getName() {return name;}

    public String getEmail() {return email;}

    public int getId() {return id;}

    public void getSalary() {

        if(salary<5000 || salary>10000) {
            System.out.println("It is not a good manner to ask someone's salary");
        }
        else {
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("NA");
        emp.setEmail("NA0MIA100@gmail.com");
        emp.setId(10);
        emp.setSalary(9000);
  //      emp.getSalary();

        System.out.println(emp.getName());
        System.out.println(emp.getEmail());
        System.out.println(emp.getId());

        emp.getSalary();
    }
}
