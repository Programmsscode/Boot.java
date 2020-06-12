package com.company;


import java.io.IOException;
import java.time.LocalTime;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.io.File;
public class GUIregestration extends JFrame{




    private JButton button7 = new JButton("<html><h2><font color=\"green\">Зарегистрироваться");
    private JButton button6 = new JButton("<html><h2><font color=\"green\">Войти в аккаунт");







    public GUIregestration() {

        super("                                                                                                                                                                                                            BotSystemTest");
        this.setBounds(500,500,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container6 = this.getContentPane();
        container6.setLayout(new GridLayout(2,1,2,1));
        button7.addActionListener(new ButtonEventListener9());
        container6.add(button7);
        button7.setBackground(Color.white);

        Container container5 = this.getContentPane();
        container5.setLayout(new GridLayout(2,1,2,1));
        button6.addActionListener(new ButtonEventListener7());
        container5.add(button6);
        button6.setBackground(Color.white);




    }


    class ButtonEventListener9 implements ActionListener{


        public void actionPerformed(ActionEvent k) {

            if(true) {
                GUIregestration1 GUIregestration1 = new GUIregestration1();
                GUIregestration1.setVisible(true);





            }}

}


class ButtonEventListener7 implements ActionListener{


    public void actionPerformed(ActionEvent p) {



        GUIregestration2 GUIregestration2 = new GUIregestration2();
        GUIregestration2.setVisible(true);

        if(true) {






//Ezhel Andrey




    }}}}
