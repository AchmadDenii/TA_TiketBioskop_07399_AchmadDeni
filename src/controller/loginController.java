package controller;
import entity.Admin;
import view.AppView;
import model.BioskopModel;

import java.util.ArrayList;

public class loginController {
    public Admin LoginAdmin;
    public void keDashboard() {
        new AppView();
    }
    public Admin adminLogin() {
        return LoginAdmin;
    }
    public boolean login(String username, String kodeAdmin){
        ArrayList<Admin> listAdmin = BioskopModel.allAdmin();
        for(Admin admin : listAdmin){
            if(((Admin.getUsername().equals(username)))&&(Admin.getKodeAdmin().equals(kodeAdmin))){
                LoginAdmin = admin;
                return true;
            }
        }
        return false;
    }


}
