package model;

import entity.*;

import java.util.ArrayList;

public class BioskopModel {
    public static ArrayList<Admin> arrayAdmin = new ArrayList<>();
    public static ArrayList<User> arrayUser = new ArrayList<>();
    public static ArrayList<DaftarFilm> arrayFilm = new ArrayList<>();
    public static void initialData(){
        dataAdmin();
        dataFilm();
    }

//  Admin
    public static void dataAdmin(){
        Admin data_Admin = new Admin("deni", "denut", "ADP");
        arrayAdmin.add(data_Admin);
    }
    public static ArrayList<Admin> allAdmin(){
        return arrayAdmin;
    }
//  User
    public static void initialUser(){
        User data_User = new User("Ersa", "Ersa", "123");
        arrayUser.add(data_User);
    }
    public static ArrayList<User> allUser(){
        return arrayUser;
    }
    public static void tambahAdmin(String username, String kodeAdmin) {
    }
//  Pesan Tiket
    public static void dataFilm(){
        DaftarFilm koleksiFilm = new DaftarFilm("Avatar", 1984, 12.00, 999, 35.000);
        arrayFilm.add(koleksiFilm);
    }
    public static void viewdaftarFilm(){
        for(DaftarFilm dataFilm : BioskopModel.arrayFilm){
            System.out.println("Judul Film          :"+dataFilm.getJudulFilm());
            System.out.println("Kode Film           :"+dataFilm.getKodeFilm());
            System.out.println("Jam Tayang          :"+dataFilm.getJamTayang());
            System.out.println("Jumlah Pembelian    :"+dataFilm.getJumlahTiket());
            System.out.println("Total Harga         :"+dataFilm.getHargaTiket());
        }
    }
    public static void lihatDataFilm(){
        for(DaftarFilm datafilm : BioskopModel.arrayFilm){
            System.out.println("Judul Film      :"+ datafilm.getJudulFilm());
            System.out.println("Kode Film       :"+ datafilm.getKodeFilm());
            System.out.println("Pilih Jam Tayang:"+ datafilm.getJamTayang());
            System.out.println("Jumlah Pembelian:"+ datafilm.getJumlahTiket());
            System.out.println("Total Harga     :"+ datafilm.getHargaTiket());
        }
    }
// Data Tiket
    public static void tambahFilm(String judulFilm, int kodeFilm, double jamTayang, int jumlahTiket, double hargaTiket) {
        DaftarFilm addFilm = new DaftarFilm(judulFilm, kodeFilm, jamTayang, jumlahTiket, hargaTiket);
        BioskopModel.arrayFilm.add(addFilm);
        
    }

    public static DaftarFilm cariDataFilm(String filmName) {
        for(DaftarFilm Filmdata : BioskopModel.arrayFilm){
            if(Filmdata.getKodeFilm().equals(filmName)){
                return Filmdata;
            }
        }
        return null;
    }

    public static void hapusDataFilm(DaftarFilm cariFilm) {
    }

    public static void tambahFilm(String judulFilm, int kodeFilm) {
    }

    public static void editDataFilm(DaftarFilm findFilm) {
    }
// Tambah User
    public static void tambahUser() {
    }
}
