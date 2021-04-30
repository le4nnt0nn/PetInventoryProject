package beans;

public class User {

	private int idUser;
    private String username;
    private String password;
    private String role;
    private String name;
    private String lastname;
    private String address;
    private String birth;
    private int phone;

    public User(){}

    public User(int idUser, String username, String password, String role, String name, String lastname, String address, String birth, int phone) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.birth = birth;
        this.phone = phone;
    }
    
    public User(String username, String password, String role, String name, String lastname, String address, String birth, int phone) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.birth = birth;
        this.phone = phone;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
