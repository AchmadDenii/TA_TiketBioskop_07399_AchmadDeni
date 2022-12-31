package view;

import controller.loginController;
import entity.DaftarFilm;
import model.BioskopModel;

import java.util.Scanner;

public class AdminView {
    loginController Verifikasi = new loginController();

    Scanner input = new Scanner(System.in);
//menu awal
    public void halamanAdmin(){
        int pilih;
        do{
            System.out.println("---Menu Admin---"+
                    "1. Registrasi" +
                    "2. Daftar Film"+
                    "3. Menu");
            System.out.println("Input Pilihan   :");
            pilih = input.nextInt();
            input.nextLine();
            System.out.println();
            switch (pilih){
                case 1 -> MenuAdmin();
                case 2 -> loginMenu();
            }
        }while(pilih!=3);
    }
//menu registrasi admin
    private void RegisterAdmin(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Username       :");
        String username = input.nextLine();
        System.out.println("KodeAdmin               :");
        String KodeAdmin = input.nextLine();
        BioskopModel.tambahAdmin(username, KodeAdmin);
        System.out.println("Admin Ditambah");
    }
//menu login admin
    private void MenuAdmin(){
        String username, kodeAdmin;
        boolean status = false;
        System.out.println("Login Admin");
        System.out.println("Username    :");
        username = input.nextLine();
        System.out.println("Kode Admin  :");
        kodeAdmin = input.nextLine();
        status = Verifikasi.login(username,kodeAdmin);
        if(status){
            System.out.println();
            RegisterAdmin();
            System.out.println();
        }
        else{
            gagalLogin();
            MenuAdmin();
        }
    }
    private void gagalLogin(){
        System.out.println("Username atau Kode Admin Salah");
    }
    private void loginMenu(){
        MenuAdmin();
        loginAdmin();
    }
//verifikasi login accepted
    public void loginAdmin(){
        String username, kodeAdmin;
        boolean status = false;
        System.out.println("Login Admin");
        System.out.println("Username    :");
        username = input.nextLine();
        System.out.println("Kode Admin  :");
        kodeAdmin = input.nextLine();
        status = Verifikasi.login(username, kodeAdmin);
        if(status){
            System.out.println("WELCOME "+Verifikasi.adminLogin().getUsername());
            System.out.println();
        }
        else{
            gagalLogin();
            System.out.println();
            loginAdmin();
        }
    }
// halaman page admin
    private void AdminPage(){
        int pilihan;
        do{
            System.out.println("MENU ADMIN");
            System.out.println("1. TAMBAH FILM");
            System.out.println("2. HAPUS FILM");
            System.out.println("3. EDIT FILM");
            System.out.println("4. LIHAT FILM");
            System.out.println("5. Menu");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1 -> menuTambahFilm();
                case 2 -> menuHapusFilm();
                case 3 -> BioskopModel.lihatDataFilm();
                }
            System.out.println();
            }while(pilihan !=4);
        }

    private void menuTambahFilm() {
        String judulFilm;
        int kodeFilm;
        boolean status = true;
        System.out.println("JUDUL FILM");
        judulFilm = input.nextLine();
        System.out.println("KODE FILM");
        kodeFilm = input.nextInt();
        input.nextLine();
        System.out.println("BERHASIL MENAMBAH FILM");
        BioskopModel.tambahFilm(judulFilm, kodeFilm);
    }
    private void menuHapusFilm(){
        String filmName;
        System.out.println("HAPUS FILM");
        System.out.println();
        System.out.println("MASUKKAN KODE FILM YANG AKAN DIHAPUS:");
        filmName = input.nextLine();
        DaftarFilm cariFilm = BioskopModel.cariDataFilm(filmName);
        if(cariFilm != null){
            BioskopModel.hapusDataFilm(cariFilm);
            System.out.println(" FILM"+cariFilm.getJudulFilm()+"DI HAPUS");
            System.out.println();
            }
        else{
            System.out.println("FILM TIDAK DITEMUKAN");
        }
    }
    private void menuEditFilm(){
        Scanner input = new Scanner(System.in);
        String gantiJudulFilm;
        double gantiHarga;
        boolean status = true;
        System.out.println("EDIT DATA FILM");
        System.out.println();
        System.out.println("INPUT JUDUL YANG AKAN DIGANTI");
        gantiJudulFilm = input.nextLine();
        DaftarFilm findFilm = BioskopModel.cariDataFilm(gantiJudulFilm);
        if(findFilm.getJudulFilm() == false){
            System.out.println("FILM DITEMUKAN");
        }
        else{
            if(findFilm !=null){
                System.out.println("MASUKKAN JUDUL BARU");
                gantiJudulFilm = input.nextLine();
                System.out.println("MASUKKAN HARGA BARU");
                gantiHarga = input.nextInt();
                input.nextLine();
                findFilm.setJudulFilm(gantiJudulFilm);
                findFilm.setHargaTiket(gantiHarga);
                BioskopModel.editDataFilm(findFilm);
                System.out.println("FILM"+findFilm.getJudulFilm()+"DIUBAH");
            }
            else{
                System.out.println("FILM TIDAK ADA");
            }
        }
    }
}

