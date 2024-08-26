public class Student extends Member{

    private String course;

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public Student(String name, String cpf, int id, int yearOfBirth, String address, String gender, String email, String course) {
        super(name, cpf, id, yearOfBirth, address, gender, email);
        this.course = course;
    }
    @Override
    public void displayMemberType() {
        System.out.println("Type of Member: Student");
    }

    @Override
    public double calculateMembershipFee() {
        return 50;
    }


}
