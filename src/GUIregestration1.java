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
public class GUIregestration1 extends JFrame{

public String Name ;
public String Password;


    private JButton button7 = new JButton("<html><h2><font color=\"green\">Завершить регистрацию");
    private JTextField jtextfield1 = new JTextField(5);
    private JTextField jtextfield2 = new JTextField(5);
    private JLabel jlabelname = new JLabel("<html><h2><font color=\"green\">Имя:");
    private JLabel jlabelpassword = new JLabel("<html><h2><font color=\"green\">Пароль:");



    public GUIregestration1() {

        super("                                                                                                                                                                                                            Регистрация");
        this.setBounds(400,400,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container5 = this.getContentPane();
        container5.setLayout(new GridLayout(3,1,2,1));
container5.add(jlabelname);
container5.add(jtextfield1);
container5.add(jlabelpassword);
        container5.add(jtextfield2);
container5.add(button7);
        button7.addActionListener(new ButtonEventListener23());
        container5.add(button7);
        button7.setBackground(Color.white);
    } class ButtonEventListener23 implements ActionListener{


        public void actionPerformed(ActionEvent k) {

            if(true) {

                Name = jtextfield1.getText() ;
                Password =jtextfield2.getText() ;
                try {
                    PrintStream printStream1 =new PrintStream("Name.txt");
                    PrintStream printStream2 =new PrintStream("Password.txt");
                    printStream1.println(Name);
                    printStream2.println(Password);
                    printStream1.close();
                    printStream2.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                setVisible(false);
               dispose();

                JOptionPane.showMessageDialog(null,"Вы успешно зарегистриовались"+" "+"ваше имя "+Name+" "+"ваш пароль"+" "+Password,"     bot ",JOptionPane.INFORMATION_MESSAGE);



            }
        }}


    }
