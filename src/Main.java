package com.company;

import java.util.Scanner;

import java.io.IOException;
import java.io.File;
import javax.swing.*;
public class Main {

    public static void main(String[] args) throws IOException {


        /**
         *
         * @author andrey
         */



        GUIregestration GUIregestration = new GUIregestration();
        GUIregestration.setVisible(true);


        String else1 =
                JOptionPane.showInputDialog("Хотите ли вы пробный режим(Да/Нет): ");

        if(else1.equals("Да")){

            JOptionPane.showMessageDialog(null,"Зайдите в окно window в файле Boot","     bot ",JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"Нажмите на кнопку команды посмотрите их и в файле window2 "+"Напишите на первой строке какую либо на русском языке и нажмите\n"+"Enter и сохраните файл","     bot ",JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,"Нажмите на кнопку Запуск и дальше нажмите OK","     bot ",JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"Чтобы дать следующую команду закройте все вкладки и запустите программу снова\n"+"но сотрите прошлые слова и напишите слово или слова","     bot ",JOptionPane.PLAIN_MESSAGE);
            GUI1 app2 = new GUI1();

            app2.setVisible(true);

            Scanner mainScanner4 = new Scanner(new File("C:\\Users\\user\\Desktop\\window.txt"));


            app2.setScannermain(mainScanner4.next());
        }else if(else1.equals("Нет")){



            GUI2 app = new GUI2();
            app.setVisible(true);


        }else{
            JOptionPane.showMessageDialog(null,"Я вас не понял :/","     bot ",JOptionPane.PLAIN_MESSAGE);
        }}




}
