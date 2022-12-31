package view;

import java.util.Scanner;

public class AppView {
    Scanner input = new Scanner(System.in);
    UserView pageuser = new UserView();
    AdminView pageAdmin = new AdminView();

    public AppView() {
        menu();
    }
    public void menu(){
        int pilih;
        do {
            System.out.println("""
                    1. Regist
                    2. Login
                    3. Exit
                    """);
            System.out.print("Masukkan Pilihan  = ");
            pilih = input.nextInt();
            switch (pilih){
                case 1 -> RegistUser();
                case 2 -> inputUser();
                case 3 -> System.out.println("exit");
                default -> System.out.println("Inputan Tidak Ada");
            }
        }
        while (pilih != 4);
    }

    private void RegistUser(){
        System.out.println("Masukkan Nama");
        String nama = input.nextLine();
        System.out.println("Masukkan Username");
        String username = input.nextLine();
        System.out.println("Masukkan Password");
        String password = input.nextLine();
        System.out.println("Masukkan Email");
        String email = input.nextLine();
    }
    private void inputUser(){
        System.out.print("Masukkan Username = ");
        String username = input.nextLine();
        System.out.print("Masukkan Password = ");
        String pass = input.nextLine();
    }
}
