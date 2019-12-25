import Model.*;

public class Profile {
    private int profileID;
    private String name;
    private String password;
    private int age;
    private String email;
    private String address;
    private String status;
    private Team team;
    private double salary;

    public Profile() {
        profileID = 0;
        name = "";
        password = "";
        age = 0;
        email = "";
        address = "";
        status = "";
        team = null;
        salary = 0.0;
    }
    public Profile(int profileID, String name, String password, int age, String email, String address) {
        this.profileID = profileID;
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public void setSalary(double Salary) {
        this.salary = salary;
    }
    public int getProfileID() {
        return profileID;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getStatus() {
        return status;
    }
    public Team getTeam() {
        return team;
    }
    public double getSalar() {
        return salary;
    }
}
