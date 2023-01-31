package controller;

import entity.Pembeli;
import entity.User;

import javax.swing.table.DefaultTableModel;

public class UserController implements InterfaceController {
    public int loginIndex = 0;

    public User getUserData(){
        return AllObjectController.userApp.getUserArray(loginIndex);
    }
    public void filmData(int dataFilm, User dataUser, boolean verifikasi){
        AllObjectController.bioskopModel.tambahData(new Pembeli(dataUser, verifikasi, dataFilm));
    }

    @Override
    public void login(String Username, String password) {
        loginIndex = AllObjectController.userApp.cekdataAllUser(Username, password);
    }
    public void tambah(String nama, String Username, String Password){
        AllObjectController.userApp.tambah(new User(nama,Username,Password));
    }
    public User entityUser(){
        return AllObjectController.userApp.getUserArray(loginIndex);

    }
    public int cekUser(String Username){
        int cek = AllObjectController.bioskopModel.cekdataAllUser(Username, null);
        return  cek;
    }
    public Pembeli tampilPembeli(int index){
        return AllObjectController.bioskopModel.tampilDataPembeli(index);
    }
    public void update(String Film, int updateFilm){
        AllObjectController.bioskopModel.update(Film, updateFilm);
    }
    public void hapusDataBuyer(int index){
        AllObjectController.bioskopModel.hapusDataBuyer(index);
    }
    public DefaultTableModel daftarBuyer(){
        DefaultTableModel tabelBuyer = new DefaultTableModel();
        Object[] kolom = {"nama","Username","Password", "status"};
        tabelBuyer.setColumnIdentifiers(kolom);
        int size = AllObjectController.bioskopModel.allDataBuyer().size();
        String verifikasi = null;
        for(int i=0; i<size; i++){
            if(AllObjectController.bioskopModel.allDataBuyer().get(i).isLegit() ==false){
                verifikasi = "no";
            }
            else{
                verifikasi = "done";
            }
            Object[] user = new Object[10];
            user[0] = AllObjectController.bioskopModel.allDataBuyer().get(i).getPembeli().getNama();
            user[1] = AllObjectController.bioskopModel.allDataBuyer().get(i).getPembeli().getUsername();
            user[2] = AllObjectController.bioskopModel.allDataBuyer().get(i).getPembeli().getPassword();
            user[3] = verifikasi;
            tabelBuyer.addRow(user);
        }
        return tabelBuyer;
    }
}
