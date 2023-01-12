package entity;

public class User extends AllUser {
    private String password;

    public User(String nama, String username, String password) {
        super(nama, username);
        this.password = password;
    }

    public String getUsername(){
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
