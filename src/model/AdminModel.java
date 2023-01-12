package model;

import entity.Admin;
import entity.Pembeli;

import java.util.ArrayList;

public class AdminModel implements InterfaceModel {
    private ArrayList<Admin> dataAdmin;
    public AdminModel(){
        dataAdmin = new ArrayList<Admin>();
    }
    public void tambahAdmin(Admin staff){
        dataAdmin.add(staff);
    }
    public void tampil(){
        for(Admin dataStaff : dataAdmin){
            System.out.println(dataStaff.getNama());
            System.out.println(dataStaff.getUsername());
            System.out.println(dataStaff.getKodeAdmin());
        }
    }

    @Override
    public int cekdataAllUser(String Username, String KodeAdmin) {
        int x = 0;
        for(Admin dataStaff : dataAdmin){
            if(dataStaff.getUsername().equals(Username) && dataStaff.getKodeAdmin().equals(KodeAdmin)){
                break;
            }
            else{
                x++;
            }
        }
        return x;
    }
    public Admin tampilDataAdmin(int index){
        return dataAdmin.get(index);
    }
}