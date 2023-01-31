package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AppView{
    JFrame BioskopView = new JFrame();
    JLabel NamaBioskop, Registrasi;
    JLabel registNama, regisUsername, registPassword;
    JTextField isiRegistNama, isiRegistUsername;
    JPasswordField isiRegistPassword;
    JButton tombolRegis, tombolMasuk;

    public AppView() {
        BioskopView.setSize(700, 650);
        BioskopView.setLayout(null);
        BioskopView.setVisible(true);
        BioskopView.getContentPane().setBackground(Color.WHITE);
        BioskopView.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BioskopView.setLocationRelativeTo(null);

        component();
        event();
    }
    private void component(){
        NamaBioskop = new JLabel("BIOSKOP");
        NamaBioskop.setBounds(269,50,379,88);
        NamaBioskop.setFont(new Font("Times New Roman", Font.ITALIC,40));
        NamaBioskop.setVisible(true);
        BioskopView.add(NamaBioskop);

        Registrasi = new JLabel("REGISTRASI");
        Registrasi.setBounds(100, 150, 200, 50);
        Registrasi.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 28));
        Registrasi.setVisible(true);
        BioskopView.add(Registrasi);

        registNama = new JLabel("MASUKKAN NAMA");
        registNama.setBounds(100,200,357,62);
        registNama.setFont(new Font("Times New Roman",Font.CENTER_BASELINE, 12));
        registNama.setVisible(true);
        BioskopView.add(registNama);
        isiRegistNama = new JTextField();
        isiRegistNama.setBounds(100,240 ,200,30);
        isiRegistNama.setVisible(true);
        BioskopView.add(isiRegistNama);

        regisUsername = new JLabel("MASUKKAN USERNAME");
        regisUsername.setBounds(100,260,357,62);
        regisUsername.setFont(new Font("Times New Roman",Font.CENTER_BASELINE, 12));
        regisUsername.setVisible(true);
        BioskopView.add(regisUsername);
        isiRegistUsername = new JTextField();
        isiRegistUsername.setBounds(100,300,200,30);
        isiRegistUsername.setVisible(true);
        BioskopView.add(isiRegistUsername);

        registPassword = new JLabel("MASUKKAN PASSWORD");
        registPassword.setBounds(100,320,357,62);
        registPassword.setFont(new Font("Times New Roman",Font.CENTER_BASELINE, 12));
        registPassword.setVisible(true);
        BioskopView.add(registPassword);
        isiRegistPassword = new JPasswordField();
        isiRegistPassword.setBounds(100,360,200,30);
        isiRegistPassword.setVisible(true);
        BioskopView.add(isiRegistPassword);

        tombolRegis = new JButton("Registrasi");
        tombolRegis.setBounds(100,400,200,25);
        tombolRegis.setBackground(Color.gray);
        tombolRegis.setVisible(true);
        BioskopView.add(tombolRegis);

        tombolMasuk = new JButton("Login");
        tombolMasuk.setBounds(100,430,200,25);
        tombolMasuk.setBackground(Color.gray);
        tombolMasuk.setVisible(true);
        BioskopView.add(tombolMasuk);
    }
    private void event(){
        tombolRegis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String Nama = isiRegistNama.getText();
                String Username = isiRegistUsername.getText();
                String Password = isiRegistPassword.getText();
                if(Nama.equals("")){
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    AllObjectGUI.user.tambah(Nama, Username, Password);
                    JOptionPane.showMessageDialog(null, "DAFTAR BERHASIL", "informasi", JOptionPane.INFORMATION_MESSAGE);
                    inputan();
                }
            }
        });
        tombolMasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BioskopView.dispose();
                LoginView login = new LoginView();
            }
        });
    }

    void inputan(){
        isiRegistNama.setText(null);
        isiRegistUsername.setText(null);
        isiRegistPassword.setText(null);
    }
}
