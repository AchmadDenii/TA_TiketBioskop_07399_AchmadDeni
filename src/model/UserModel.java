package model;

import entity.User;

import java.util.ArrayList;

public class UserModel implements InterfaceModel{
    private ArrayList<User> dataUser;
    public UserModel(){
        dataUser = new ArrayList<User>();
    }
    public void tambah(User usr){
        dataUser.add(usr);
    }
    public void tampil(){
        for(User usr : dataUser){
            System.out.println("Nama    :"+usr.getNama()+ "\n Username   :"+usr.getUsername()+"\n Password"+usr.getPassword());
        }
    }

    @Override
    public int cekdataAllUser(String Username, String password) {
        int i = 0;
        while (!dataUser.get(i).getUsername().equals(Username) && !dataUser.get(i).getPassword().equals(password)){
            i++;
        }
        return i;
    }
    public User getUserArray(int index){
        return dataUser.get(index);
    }
}
