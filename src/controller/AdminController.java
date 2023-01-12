package controller;

import entity.Admin;
import entity.Pembeli;
import entity.User;

import java.util.ArrayList;

public class AdminController implements InterfaceController{
    int loginIndex = 0;
    public void dataAdmin(){
        String nama[] = {"Achmad","deni", "putra"};
        String Username[] = {"Ersa", "Denutt", "Putra"};
        String KodeAdmin [] = {"07399", "07399", "07399"};
        for(int i = 0; i<Username.length; i++){
            AllObjectController.AdminApp.tambahAdmin(new Admin(nama[i], Username[i], KodeAdmin[i]));
        }
    }
    public void lihatAdmin(){
        AllObjectController.AdminApp.tampil();
    }
    public void listBuyer(){
        AllObjectController.bioskopModel.tampil();
    }
    @Override
    public void login(String Username, String password) {
        loginIndex = AllObjectController.AdminApp.cekdataAllUser(Username, password);
    }
    public Admin staff(){
        return AllObjectController.AdminApp.tampilDataAdmin(loginIndex);
    }
    public void verifUpdate(int index, int filmIndex, User entityUser){
        AllObjectController.bioskopModel.verifUpdate(index, new Pembeli(entityUser, true, filmIndex));
    }
    public ArrayList<Pembeli> cekModel(){
        return AllObjectController.bioskopModel.getDataBuyer();
    }
}
