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
    JButton tombolKembali, tombolPilihFilm, tombolKonfirmasi;
    JLabel NamaBioskop, menuUser, dataStruk, menuFilm;
    JTextField updateFilm;

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
        dataStruk.setBounds(140, 250, 160,25);
        dataStruk.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        userMenu.add(dataStruk);
        strukFilm.setBounds(95,280,250,300);
        userMenu.add(strukFilm);

        menuFilm = new JLabel("DAFTAR FILM");
        menuFilm.setBounds(400,250,160,25);
        menuFilm.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        userMenu.add(menuFilm);
        daftarFilm.setBounds(400, 280, 160,25);
        userMenu.add(daftarFilm);

        tombolPilihFilm = new JButton("BELI");
        tombolPilihFilm.setBounds(380,325, 95,40);
        userMenu.add(tombolPilihFilm);

        tombolKembali = new JButton("KEMBALI");
        tombolKembali.setBounds(500,325, 95,40);
        userMenu.add(tombolKembali);

        tombolKonfirmasi = new JButton("UPDATE FILM");
        tombolKonfirmasi.setBounds(380,400,220,40);
        userMenu.add(tombolKonfirmasi);

        updateFilm = new JTextField();
        updateFilm.setBounds(450,450,95,40);
        userMenu.add(updateFilm);
        inputan();
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
                LoginView back = new LoginView();
            }
        });
        tombolKonfirmasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int updatefilm = daftarFilm.getSelectedIndex();
                AllObjectGUI.user.update(updateFilm.getText(), updatefilm);
                inputan();
            }
        });
    }

    void inputan(){
        updateFilm.setText(null);
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

