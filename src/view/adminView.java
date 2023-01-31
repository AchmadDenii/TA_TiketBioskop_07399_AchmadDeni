package view;

import controller.AllObjectController;
import controller.UserController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminView {
    private  static UserController buyerdata = new UserController();

    JFrame admin = new JFrame();
    JTable datauser = new JTable();
    JScrollPane konfirmMenu = new JScrollPane(datauser);
    JButton kembali, konfimasi, hapus;
    JLabel Admintext, username, password;
    JTextField isiUsername, isiPassword;

    public adminView(){
        admin.setSize(700, 650);
        admin.setLayout(null);
        admin.getContentPane().setBackground(Color.getHSBColor(206,49,100));
        admin.setVisible(true);
        admin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        admin.setLocationRelativeTo(null);

        component();
        event();
    }
    private void component(){
        Admintext = new JLabel("MENU ADMIN");
        Admintext.setBounds(240,50,379,88);
        Admintext.setFont(new Font("Times New Roman", Font.ITALIC,40));
        admin.add(Admintext);

        konfirmMenu.setBounds(135,135,450,200);
        datauser.setModel(buyerdata.daftarBuyer());
        admin.add(konfirmMenu);

        username = new JLabel("Masukkan Username");
        username.setBounds(170,380,150,20);
        admin.add(username);
        isiUsername = new JTextField();
        isiUsername.setBounds(170,410,150,20);
        admin.add(isiUsername);

        password = new JLabel("Masukkan Password");
        password.setBounds(170,440,150,20);
        admin.add(password);
        isiPassword = new JTextField();
        isiPassword.setBounds(170,470,150,20);
        admin.add(isiPassword);

        konfimasi = new JButton("CONFIRM");
        konfimasi.setBounds(420,380,100,30);
        admin.add(konfimasi);

        kembali = new JButton("KEMBALI");
        kembali.setBounds(420,460,100,30);
        admin.add(kembali);

        hapus = new JButton("HAPUS");
        hapus.setBounds(420,420,100,30);
        admin.add(hapus);
    }
    private void event(){
        konfimasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = isiUsername.getText();
                String password = isiPassword.getText();
                int index = AllObjectController.bioskopModel.cekdataAllUser(username, password);
                AllObjectGUI.admin.verifUpdate(index, AllObjectGUI.user.tampilPembeli(index).getFilmIndex(), AllObjectGUI.user.tampilPembeli(index).getPembeli());
                datauser.setModel(buyerdata.daftarBuyer());
            }
        });

        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AllObjectGUI.user.hapusDataBuyer(0);
                datauser.setModel(buyerdata.daftarBuyer());
            }
        });

        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.dispose();
                LoginView login = new LoginView();
            }
        });
    }
}
