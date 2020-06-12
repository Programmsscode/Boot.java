package com.company;

import java.io.IOException;
import java.time.LocalTime;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.io.File;
public class GUI1 extends JFrame{




    private JButton button3 = new JButton("<html><h2><font color=\"red\">Запуск");
    private JButton button4 = new JButton("<html><h2><font color=\"red\">Команды");


    private String Scannermain;
    public void setScannermain(String Scannermain2){

        Scannermain = Scannermain2;

    }

    public String getName(){
        return Scannermain;
    }

    public GUI1() {

        super("                                                                                                                                                                                                            BotSystemTest");
        this.setBounds(500,500,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container6 = this.getContentPane();
        container6.setLayout(new GridLayout(2,1,2,1));
        button3.addActionListener(new ButtonEventListener5());
        container6.add(button3);
        button3.setBackground(Color.white);

        Container container5 = this.getContentPane();
        container5.setLayout(new GridLayout(2,1,2,1));
        button4.addActionListener(new ButtonEventListener3());
        container5.add(button4);
        button4.setBackground(Color.white);
    }


    class ButtonEventListener5 implements ActionListener{


        public void actionPerformed(ActionEvent k) {

            if(true) {



//Основа готова
                    switch(Scannermain) {
                        case "Включи музыку":

                            try {
                                Desktop.getDesktop().open(new File("D:/Музыка/FaderX - Verlaine.mp3"));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                        case "Выйти":
                            System.exit(0);
                        case "Какое сейчас время?":
LocalTime current_time = LocalTime.now();
JOptionPane.showMessageDialog(null,"Время сейчас:"+current_time);
                            break;
                        case "Твоя любимая игра":

                            JOptionPane.showMessageDialog(null,"Моя любимая игра это Damascus sword","     bot ",JOptionPane.PLAIN_MESSAGE);
                            break;
                        case "Сложная угадайка":

                            JOptionPane.showMessageDialog(null,"Моя любимая игра это Damascus sword","     bot ",JOptionPane.PLAIN_MESSAGE);

                            int numGuesses2 = 0;
                            int randomNumber2 = new Random().nextInt(100)+1;
                            JOptionPane.showMessageDialog(null,"************\n"+"Добро пожаловать в игру!\n"+"\"************\n"+"\n","     bot ",JOptionPane.PLAIN_MESSAGE);
                            int inputNumber2 = Integer.parseInt
                                    (JOptionPane.showInputDialog("Введите число от 1 до 100:\n"));

                            numGuesses2++;
                            while(inputNumber2 != randomNumber2){

                                if(inputNumber2 < randomNumber2){

                                    JOptionPane.showMessageDialog(null,"Попытайтесь ввести болшее число...","     bot ",JOptionPane.PLAIN_MESSAGE);
                                }else{
                                    JOptionPane.showMessageDialog(null,"Попытайтесь ввести меньшее число...","     bot ",JOptionPane.PLAIN_MESSAGE);

                                }	 inputNumber2 = Integer.parseInt
                                        (JOptionPane.showInputDialog("Введите число от 1 до 100:\n"));

                                numGuesses2++;
                            }
                            JOptionPane.showMessageDialog(null,"Вы угадали после \n"+numGuesses2+" попыток.","     bot ",JOptionPane.PLAIN_MESSAGE);
                            break;
                        case "Кто тебя создал?":

                            JOptionPane.showMessageDialog(null,"Меня создал создатель, вы и сами знаете кто он.","     bot ",JOptionPane.PLAIN_MESSAGE);
                            break;

                        case"Привет":


                            JOptionPane.showMessageDialog(null,"Привет","    bot ",JOptionPane.PLAIN_MESSAGE);
                            break;


                        case"Пока":

                            JOptionPane.showMessageDialog(null,"Пока","    bot ",JOptionPane.PLAIN_MESSAGE);
                            break;

                        case"Калькулятор":

                            String fg =
                                    JOptionPane.showInputDialog(" Введите знак +;-;*;:.");


                            switch  (fg) {
                                case "+":
                                    double x = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 1 число:"));
                                    double h = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 2 число:"));

                                    double xh = x + h;
                                    JOptionPane.showMessageDialog(null,"Ответ:\n"+xh,"",JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case "-":
                                    double l = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 1 число:"));
                                    double m = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 2 число:"));
                                    double lm = l - m;
                                    JOptionPane.showMessageDialog(null,"Ответ:\n"+lm,"     bot ",JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case "*":
                                    double j = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 1 число:"));
                                    double b = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 2 число:"));
                                    double jb = j * b;
                                    JOptionPane.showMessageDialog(null,"Ответ:\n"+jb,"     bot ",JOptionPane.PLAIN_MESSAGE);
                                    break;
                                case ":":
                                    double n = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 1 число:"));
                                    double c = Double.parseDouble
                                            (JOptionPane.showInputDialog("Введите 2 число:"));
                                    double nc = n / c;
                                    JOptionPane.showMessageDialog(null,"Ответ:\n"+nc,"     bot ",JOptionPane.PLAIN_MESSAGE);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Не рассчитало :/\n","     bot ",JOptionPane.PLAIN_MESSAGE);
                                    break;
                            }
                            break;

                        case"Угадайка":
                            int numGuesses = 0;
                            int randomNumber = new Random().nextInt(10)+1;
                            JOptionPane.showMessageDialog(null,"************\n"+"Добро пожаловать в игру!\n"+"\"************\n"+"\n","     bot ",JOptionPane.PLAIN_MESSAGE);

                            int inputNumber = Integer.parseInt
                                    (JOptionPane.showInputDialog("Введите число от 1 до 10:\n"));

                            numGuesses++;
                            while(inputNumber != randomNumber) {
                                JOptionPane.showMessageDialog(null,"Попытайтесь еще раз...\n","      bot",JOptionPane.PLAIN_MESSAGE);

                                inputNumber = Integer.parseInt
                                        (JOptionPane.showInputDialog("Введите число от 1 до 10:\n"));
                                numGuesses++;
                            }
                            JOptionPane.showMessageDialog(null,"Вы угадали после \n"+numGuesses+" "+"попыток.","     bot",JOptionPane.PLAIN_MESSAGE);
                            break;

                        case"Сказка":


                            String message2 = "";
                            message2+="В некотором царстве,в некотором государстве жила-была прекрасная принцесса. \n";
                            message2 += "Когда ей исполнилось 25 лет (оптимальный возраст для реализации желаний),ее отец,добрый король,подарил\n"
                                    + "ей хрустальную шкатулку в позолоченной обертке.\n"
                                    + "Желая побыстрее увидеть,что находится в шкатулке,принцесса разорвала позолоченную обертку(ей не хватило терпения разорвать\n"
                                    + "бантик-и ахнула!В шкатулке было то,о чем она мечтала всю свою жизнь:компьютерная программа,которая всегда работает правильно.\n"
                                    + "Программа может сделать все,чего пожелает принцесса,причем точно так,как ей нужно.Принцесса была счастлива,и поэтому\n"
                                    + "счастлив был ее отец,добрый король.\n"
                                    + "Шли годы,а компьютерная программа по-прежнему не совершала ни единой ошибки.\n"
                                    + "Время шло,принцесса постарела,а вместе с ней состарилась и программа.\n"
                                    + "Однажды зимним вечером,сидя у камина принцесса задала программе давно мучивший ее коварный вопрос:\n"
                                    + "Как тебе удается делать все это?Почему твои ответы всегда правильные?\n"
                                    + "\"Причина в том,- ответила программа,- что я постоянно держу себя в форме и виду здоровый образ \n"
                                    + "жизни.Я запускаю двадцать приложений ежедневно,применяю C++ для отпугивания вирусов,избегаю\n"
                                    + "рекурсивных алгоритмов и никогда не записываю в пул больше задач,чем могу обработать\".\n"
                                    + "Принцесса молча посмотрела и уснула.\n"
                                    + "Конец\n";


                            JOptionPane.showMessageDialog(null,message2,"     bot",JOptionPane.PLAIN_MESSAGE);
break;
                        default:

                            JOptionPane.showMessageDialog(null,"Я вас не понял :/\n","     bot",JOptionPane.PLAIN_MESSAGE);

break;
                    }}
            }

        }

    }


class ButtonEventListener3 implements ActionListener{


    public void actionPerformed(ActionEvent p) {




        if(true) {
            String message = "\n";
            message +="                                                            "  ;
            message +="Фразы:\n"+"Привет,Пока,Кто тебя создал?,Твоя любимая игра.\n";
            message +="Задачи:\n"+"Калькулятор,Какое сейчас время?,Выйти\n";
            message +="Игры:\n"+"Угадайка,Сложная угадайка,Сказка.\n";

            JOptionPane.showMessageDialog(null,message,"     bot ",JOptionPane.INFORMATION_MESSAGE);







//Ezhel Andrey



        }
    }
}
