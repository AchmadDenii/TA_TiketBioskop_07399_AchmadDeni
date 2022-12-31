package model;

import entity.User;
import java.util.ArrayList;

public class UserModel {
    private ArrayList<User> Datauser;
    public UserModel(){
        Datauser = new ArrayList<>();
    }

    public ArrayList<User> getDatauser(){
        return Datauser;
    }
    public void tampil(){
    }
    public void tambah(Object acak){
        Datauser.add((User)acak);
    }
    public void hapus(int index){
        Datauser.remove(index);
    }
}
