public class Teacher {
    private String name;
    private String subject;
    private int students;

    public void setName(String n) {this.name = n;}
    public void setSubject(String sub) {this.subject = sub;}
    public void setStudents(int stu) {this.students = stu;}

    public String getName() {return name;}
    public String getSubject() {return subject;}

    public int getStudents() {return students;}

    public static void main(String[] args) {
        Teacher jahidul = new Teacher();

        jahidul.setName("Nurul");
        jahidul.setSubject("Java");
        jahidul.setStudents(15);

        System.out.println(jahidul.getName() +" "+ "is learning" +" "+ jahidul.getSubject()
                +" " +"with"+" "+ jahidul.getStudents() +" "+"other students.");

    }
}
