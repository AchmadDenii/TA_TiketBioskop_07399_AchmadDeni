package entity;

public class AllUser {
    String nama;
    String Username;

    public AllUser(String nama, String username) {
        this.nama = nama;
        Username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
