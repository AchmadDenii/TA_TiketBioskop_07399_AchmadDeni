package entity;

public class Regist {
    protected String nama;
    protected static String username;

    public Regist(String nama, String username){
        this.nama = nama;
        this.username = username;
    }

    public Regist(String Username, String username, String password, String pass) {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
