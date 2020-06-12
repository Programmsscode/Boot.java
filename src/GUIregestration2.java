package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalTime;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class GUIregestration2 extends JFrame{

    public String Name2 ;
    public String Password2;

    public String Name2scan ;
    public String Password2scan;

    private JButton button7 = new JButton("<html><h2><font color=\"blue\">Зайти в аккаунт");
    private JTextField jtextfield3 = new JTextField(5);
    private JTextField jtextfield4 = new JTextField(5);
    private JLabel jlabelname2 = new JLabel("<html><h2><font color=\"blue\">Имя:");
    private JLabel jlabelpassword2 = new JLabel("<html><h2><font color=\"blue\">Пароль:");


    public GUIregestration2() {

        super("                                                                                                                                                                                                            Регистрация");
        this.setBounds(400,400,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container5 = this.getContentPane();
        container5.setLayout(new GridLayout(3,1,2,1));
        container5.add(jlabelname2);
        container5.add(jtextfield3);
        container5.add(jlabelpassword2);
        container5.add(jtextfield4);
        container5.add(button7);
        button7.addActionListener(new ButtonEventListener23());
        container5.add(button7);
        button7.setBackground(Color.white);

        container5.setBackground(Color.CYAN);

    } class ButtonEventListener23 implements ActionListener{


        public void actionPerformed(ActionEvent k) {

            if(true) {
                Name2 = jtextfield3.getText() ;
                Password2 = jtextfield4.getText() ;
                try {
                    Scanner Namescan = new Scanner(new File("C:/Users/user/Documents/Name.txt"));
                    Scanner Passwordscan = new Scanner(new File("C:/Users/user/Documents/Password.txt"));
                  Name2scan =Namescan.nextLine();
                    Password2scan =Passwordscan.nextLine();
                    if(Name2.equals(Name2scan) && Password2.equals(Password2scan)){
                        JOptionPane.showMessageDialog(null,"Вы успешно зашли в аккаунт","     bot ",JOptionPane.INFORMATION_MESSAGE);

                        GUI2 app = new GUI2();
                        app.setVisible(true);

                    }else{
                        JOptionPane.showMessageDialog(null,"Что то пошло не так, попробуйте ввести другое имя или пароль или зарегистрировать аккаунт если нет","     bot ",JOptionPane.INFORMATION_MESSAGE);
                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                setVisible(false);
                dispose();




            }
        }}


}
