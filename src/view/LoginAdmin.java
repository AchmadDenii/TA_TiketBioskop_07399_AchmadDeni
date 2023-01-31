package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdmin {
    JFrame adminPage = new JFrame();
    JLabel NamaBioskop, Login;
    JLabel Username, kodeadmin;
    JTextField isiUsername, isiPassword;
    JButton tombolMasuk, tombolKembali;

    private boolean verifikasi = false;
    public LoginAdmin(){
        adminPage.setSize(700,650);
        adminPage.setLayout(null);
        adminPage.getContentPane().setBackground(Color.getHSBColor(206,49,100));
        adminPage.setVisible(true);
        adminPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        adminPage.setLocationRelativeTo(null);

        component();
        event();
    }
    private void component(){
        NamaBioskop = new JLabel("BIOSKOP");
        NamaBioskop.setBounds(269,50,379,88);
        NamaBioskop.setFont(new Font("Times New Roman", Font.ITALIC,40));
        NamaBioskop.setBackground(Color.cyan);
        adminPage.add(NamaBioskop);

        Login = new JLabel("ADMIN MENU");
        Login.setBounds(100,150,200,50);
        Login.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,28));
        adminPage.add(Login);

        Username = new JLabel("MASUKKAN USERNAME");
        Username.setBounds(100,180,357,62);
        Username.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,12));
        adminPage.add(Login);
        isiUsername = new JTextField();
        isiUsername.setBounds(100,220,200,30);
        adminPage.add(isiUsername);

        kodeadmin = new JLabel("MASUKKAN KODEADMIN");
        kodeadmin.setBounds(100, 250,200,50);
        kodeadmin.setFont(new Font("Times New Roman",Font.CENTER_BASELINE, 12));
        adminPage.add(kodeadmin);
        isiPassword = new JPasswordField();
        isiPassword.setBounds(100,290,200,30);
        adminPage.add(isiPassword);

        tombolMasuk = new JButton("Login");
        tombolMasuk.setBounds(200,400,90,25);
        tombolMasuk.setBackground(Color.gray);
        tombolMasuk.setVisible(true);
        adminPage.add(tombolMasuk);

        tombolKembali = new JButton("KEMBALI");
        tombolKembali.setBounds(100,400,90,25);
        tombolKembali.setBackground(Color.gray);
        adminPage.add(tombolKembali);
    }
    private void event(){
        tombolMasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verifikasi == true){
                    try {
                        AllObjectGUI.admin.dataAdmin();
                        AllObjectGUI.admin.login(Username.getText(), kodeadmin.getText());
                        String nama = AllObjectGUI.admin.staff().getKodeAdmin();
                        adminPage.dispose();
                        userView buyer = new userView();
                    }
                    catch (Exception pengecualian){
                        JOptionPane.showMessageDialog(null, "USERNAME / PASSWORD SALAH", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    inputan();
                }
                else{
                    inputan();
                }
                adminView Umenu = new adminView();
                adminPage.dispose();

            }
        });
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminPage.dispose();
                LoginView Register = new LoginView();
            }
        });
    }

    void inputan() {
        isiUsername.setText(null);
        isiPassword.setText(null);
    }
}
