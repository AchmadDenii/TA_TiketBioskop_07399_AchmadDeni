package model;

import entity.DaftarFilm;
import entity.Pembeli;

import java.util.ArrayList;

public class BioskopModel implements InterfaceModel{
    private ArrayList<Pembeli> dataBuyer;

    public BioskopModel(){
        dataBuyer = new ArrayList<Pembeli>();
    }
    public void tambahData(Pembeli buyer){
        dataBuyer.add(buyer);
    }
    public ArrayList<Pembeli>getDataBuyer(){
        return dataBuyer;
    }
    public int size(){
        return dataBuyer.size();
    }

    @Override
    public void tampil() {
        for(Pembeli data : dataBuyer){
            System.out.println("Nama :"+data.getPembeli().getNama()+"Username"+data.getPembeli().getUsername()+"Password"+data.getPembeli().getPassword()+"Film"+ DaftarFilm.film[data.getFilmIndex()]+ "VERIFIKASI");
            if(data.isLegit()==false){
                System.out.println("BELUM DI VERIFIKASI");
            }
            else{
                System.out.println("TERVERIFIKASI");
            }
        }
    }

    @Override
    public int cekdataAllUser(String Username, String password) {
        int a = 0;
        if(dataBuyer.size() == 0){
            a = -1;
        }
        else {
            for(int i=0; i<dataBuyer.size(); i++){
                if(dataBuyer.get(i).getPembeli().getUsername().equals(Username)){
                    a = i;
                    break;
                }
                else{
                    a =-2;
                }
            }
        }
        return a;
    }
    public Pembeli tampilDataPembeli(int index){
        return dataBuyer.get(index);
    }
    public void verifUpdate(int index, Pembeli daftarBuyer){
        dataBuyer.set(index, daftarBuyer);
    }
    public void hapusDataBuyer(int index){
        dataBuyer.remove(dataBuyer.get(index));
    }
    public ArrayList<Pembeli> allDataBuyer(){
        return dataBuyer;
    }
    private int caridataBuyer(String nama){
        int index = -1;
        for(int i=0; i<dataBuyer.size(); i++){
            if(nama.equals(dataBuyer.get(i).getPembeli().getNama()))
                index = i;
        }
        return index;
    }
    public void update(String nama, int updateFilm){
        int data;
        if(caridataBuyer(nama) !=1){
            dataBuyer.get(caridataBuyer(nama)).setFilmIndex(updateFilm);
            data = 1;
        }
        else{
            data = 0;
        }
    }
}
