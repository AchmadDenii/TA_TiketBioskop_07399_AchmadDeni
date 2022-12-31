package view;
import entity.DaftarFilm;
import model.BioskopModel;

import java.util.Scanner;

public class UserView {
    public void pageUser(){
        AdminView login = new AdminView();
        login.loginAdmin();
        menuUser();
    }

    Scanner input = new Scanner(System.in);
    private void menuUser(){
        int pilih;
        do{
            System.out.println("MENU USER");
            System.out.println("1. REGISTRASI");
            System.out.println("2. LOGIN");
            System.out.println("MASUKKAN PILIHAN    :");
            pilih = input.nextInt();
            System.out.println();
            switch(pilih){
                case 1 -> RegisterUser();
                case 2 -> loginUser();
            }
        }
        while(pilih !=3);
    }
    private void RegisterUser(){
        System.out.println();
        System.out.println("NAMA LENGKAP");
        String Reg_namauser = input.nextLine();
        System.out.println("USERNAME        :");
        String Reg_username = input.nextLine();
        System.out.println("PASSWORD        :");
        String Reg_password = input.nextLine();
        System.out.println("");
        BioskopModel.tambahUser();
    }

    private void loginUser(){
        System.out.println();
        System.out.println("USERNAME        :");
        String Reg_username = input.nextLine();
        System.out.println("PASSWORD        :");
        String Reg_password = input.nextLine();
        System.out.println();
        BioskopModel.tambahUser();
        System.out.println("Pilih Film");
        String namaFilm = input.nextLine();
        DaftarFilm findFilm = BioskopModel.cariDataFilm(namaFilm);
        if(findFilm != null){
            if(findFilm.getJudulFilm() == false){
                System.out.println("");
            }
        }
    }
}