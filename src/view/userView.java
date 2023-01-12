package view;

import entity.DaftarFilm;
import entity.User;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userView {
    JFrame userMenu = new JFrame();
    JTextArea strukFilm = new JTextArea();
    JComboBox daftarFilm = new JComboBox(DaftarFilm.film);
    JButton tombolKembali, tombolPilihFilm;
    JLabel NamaBioskop, menuUser, dataStruk, menuFilm;
    int cek = AllObjectGUI.user.cekUser(AllObjectGUI.user.getUserData().getUsername());

    public userView() {
        userMenu.setSize(700,650);
        userMenu.setLayout(null);
        userMenu.getContentPane().setBackground(Color.getHSBColor(206,49,100));
        userMenu.setVisible(true);
        userMenu.getContentPane().setBackground(Color.getHSBColor(206,49,100));
        userMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        userMenu.setLocationRelativeTo(null);

        component();
        event();
    }
    private void component(){
        NamaBioskop = new JLabel("BIOSKOP");
        NamaBioskop.setBounds(269,50,379,88);
        NamaBioskop.setFont(new Font("Times New Roman", Font.ITALIC,40));
        NamaBioskop.setBackground(Color.cyan);
        NamaBioskop.setVisible(true);
        userMenu.add(NamaBioskop);

        menuUser = new JLabel("MENU USER");
        menuUser.setBounds(269,150, 200, 50);
        menuUser.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 28));
        userMenu.add(menuUser);

        dataStruk = new JLabel("STRUCK PEMBELIAN");
        dataStruk.setBounds(100, 200, 160,25);
        dataStruk.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 12));
        userMenu.add(dataStruk);
        strukFilm.setBounds(80,210,100,100);
        userMenu.add(strukFilm);

        menuFilm = new JLabel("DAFTAR FILM");
        menuFilm.setBounds(300,190,300,200);
        menuFilm.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        userMenu.add(menuFilm);

        tombolPilihFilm = new JButton("BELI");
        tombolPilihFilm.setBounds(400,600, 200,100);
        userMenu.add(tombolPilihFilm);

        tombolKembali = new JButton("KEMBALI");
        tombolKembali.setBounds(600,600, 200,100);
        userMenu.add(tombolKembali);
    }
    private void event(){
        tombolPilihFilm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int datafilm = daftarFilm.getSelectedIndex();
                AllObjectGUI.user.filmData(datafilm, AllObjectGUI.user.getUserData(), false);
                strukFilm.setText(dataUser());
            }
        });

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userMenu.dispose();
            }
        });
    }

    private String dataUser() {
        int cek = AllObjectGUI.user.cekUser(AllObjectGUI.user.getUserData().getUsername());
        String Confirm;
        if(AllObjectGUI.user.tampilPembeli(cek).isLegit() == false){
            Confirm = "BELUM DIKONFIRMASI";
        }
        else{
            Confirm = "SUDAH DIKONFIRMASI";
        }
        String text = "Username =" + AllObjectGUI.user.tampilPembeli(cek).getPembeli().getNama()+"\n"
                +"Username =" + AllObjectGUI.user.tampilPembeli(cek).getPembeli().getUsername()+"\n"
                +"KONFIRMASI PEMBELIAN =" + Confirm + "\n"
                + "FILM =" + DaftarFilm.film[AllObjectGUI.user.tampilPembeli(cek).getFilmIndex()];
        return text;
    }


}

