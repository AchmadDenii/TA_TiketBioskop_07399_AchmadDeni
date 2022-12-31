package entity;

public class User extends Regist{
    public String password;

    public User(String nama, String username, String password){
        super(nama, username);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void tampilUser(){
        System.out.println("Nama        :"+nama);
        System.out.println("Username    :"+username);
        System.out.println("Password    :"+password);

    }
    public void coba(){

    }
}
