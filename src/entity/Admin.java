package entity;

public class Admin extends AllUser {
    private String kodeAdmin;

    public Admin(String nama, String username, String kodeAdmin) {
        super(nama, username);
        this.kodeAdmin = kodeAdmin;
    }
    public String getNama(){
        return this.nama;
    }
    public String getKodeAdmin() {
        return kodeAdmin;
    }
    public void setKodeAdmin(String kodeAdmin) {
        this.kodeAdmin = kodeAdmin;
    }
}
