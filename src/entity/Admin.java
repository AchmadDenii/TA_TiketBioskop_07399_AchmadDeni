package entity;
public class Admin extends Regist{
    protected static String KodeAdmin;

    public Admin(String nama, String username, String KodeAdmin){
        super(nama, username);
        this.KodeAdmin = KodeAdmin;
    }

    public static String getKodeAdmin() { //HARUS STATIS ???
        return KodeAdmin;
    }

    public void setKodeAdmin(String kodeAdmin) {
        KodeAdmin = kodeAdmin;
    }
}
