public class Professor extends Member{

    private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Professor(String name, String cpf, int id, int yearOfBirth, String address, String gender, String email, String department) {
        super(name, cpf, id, yearOfBirth, address, gender, email);
        this.department = department;
    }
    @Override
    public void displayMemberType() {
        System.out.println("Type of Member: Professor");
    }
    @Override
    public double calculateMembershipFee() {
        return 25;
    }
}
