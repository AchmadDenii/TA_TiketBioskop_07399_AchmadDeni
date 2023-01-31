package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    JFrame loginPage = new JFrame();
    JLabel NamaBioskop, Login;
    JLabel Username, Password;
    JTextField isiUsername, isiPassword;
    JButton tombolMasuk, tombolKembali, tombollogAdmin;

    private boolean verifikasi = false;
    public LoginView(){
        loginPage.setSize(700,650);
        loginPage.setLayout(null);
        loginPage.getContentPane().setBackground(Color.getHSBColor(206,49,100));
        loginPage.setVisible(true);
        loginPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginPage.setLocationRelativeTo(null);

        component();
        event();
    }
    private void component(){
        NamaBioskop = new JLabel("BIOSKOP");
        NamaBioskop.setBounds(269,50,379,88);
        NamaBioskop.setFont(new Font("Times New Roman", Font.ITALIC,40));
        NamaBioskop.setBackground(Color.cyan);
        loginPage.add(NamaBioskop);

        Login = new JLabel("LOGIN MENU");
        Login.setBounds(100,150,200,50);
        Login.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,28));
        loginPage.add(Login);

        Username = new JLabel("MASUKKAN USERNAME");
        Username.setBounds(100,180,200,50);
        Username.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,12));
        loginPage.add(Username);
        isiUsername = new JTextField();
        isiUsername.setBounds(100,220,200,30);
        loginPage.add(isiUsername);

        Password = new JLabel("MASUKKAN PASSWORD");
        Password.setBounds(100, 250,200,50);
        Password.setFont(new Font("Times New Roman",Font.CENTER_BASELINE, 12));
        loginPage.add(Password);
        isiPassword = new JPasswordField();
        isiPassword.setBounds(100,290,200,30);
        loginPage.add(isiPassword);

        tombolMasuk = new JButton("Login");
        tombolMasuk.setBounds(210,400,90,25);
        tombolMasuk.setBackground(Color.gray);
        tombolMasuk.setVisible(true);
        loginPage.add(tombolMasuk);

        tombolKembali = new JButton("KEMBALI");
        tombolKembali.setBounds(100,400,90,25);
        tombolKembali.setBackground(Color.gray);
        loginPage.add(tombolKembali);

        tombollogAdmin = new JButton("LOGIN AS ADMIN");
        tombollogAdmin.setBounds(100,350,200,25);
        tombollogAdmin.setBackground(Color.gray);
        loginPage.add(tombollogAdmin);

    }
    private void event(){

        tombolMasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verifikasi == false){
                    try {

                        AllObjectGUI.user.login(isiUsername.getText(), isiPassword.getText());
                        String nama = AllObjectGUI.user.entityUser().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        userView Umenu = new userView();
                        loginPage.dispose();
                    } catch (Exception eception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        inputan();
                    }
                }
                else{
                    inputan();
                }

            }
        });
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage.dispose();
                AppView Register = new AppView();
            }
        });
        tombollogAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPage.dispose();
                LoginAdmin AdminMenu = new LoginAdmin();
            }
        });
    }

    void inputan() {
        isiUsername.setText(null);
        isiPassword.setText(null);
    }
}
