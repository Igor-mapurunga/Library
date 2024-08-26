public class Member {
    private String name;
    private String cpf;
    private int id;
    private int yearOfBirth;
    private String address;
    private String gender;
    private String email;

    public Member(){

    }
    public Member(String name, String cpf, int id, int yearOfBirth, String address, String gender, String email) {
        this.name = name;
        this.cpf = cpf;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
