import javax.swing.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №8");
        System.out.println("Массивы. Урок 1");
        int taskNumberRun;
        try {
            taskNumberRun = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Какое задание нужно выполнить? (1-10)"));
        } catch (Exception e) {
            taskNumberRun = 0;
            //e.printStackTrace(); // Выводит сообщение об ошибке
        }
        switch (taskNumberRun) {
            case 1 -> task1();    //Задание 1
            case 2 -> task2();    //Задание 2
            case 3 -> task3();    //Задание 3
//            case 4 -> task4();    //Задание 4
//            case 5 -> task5();    //Задание 5
//            case 6 -> task6();    //Задание 6
//            case 7 -> task7();    //Задание 7
//            case 8 -> task8();    //Задание 8
//            case 9 -> task9();    //Задание 9
//            case 10 -> task10();    //Задание 10
//            case 11 -> task11();
            default -> System.out.println("Вы не выбрали задание!?: " + taskNumberRun);
        }
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task3() {
        System.out.println("Задание 3");
        // Расчитать даты сдаци еженедельных отчетоа, каждую пчтницу..
        // Вывести результат: «Сегодня пятница, ...-е число. Необходимо подготовить отчет»
        // первая пятница dedLine=1..7
        // #00:35-01:05
        //Инициализация
        int[] arreyOne = {1,2,3};
        float[] arreyTwo = {1.57F, 7.654F, 9.986F};
        int[] arreyFree = new int[10];
        String[] strOut = {"","",""};

        //Решение
        for (int i = arreyOne.length-1; i >= 0; i--) {
            strOut[0] = strOut[0]+arreyOne[i]+"\t";
        }
        for (int i = arreyTwo.length-1; i >= 0 ; i--) {
            strOut[1] = strOut[1]+arreyTwo[i]+"\t";
        }
        for (int i = arreyFree.length-1; i >= 0 ; i--) {
            strOut[2] = strOut[2]+arreyFree[i]+"\t";
        }
        System.out.println(strOut[0]);
        System.out.println(strOut[1]);
        System.out.println(strOut[2]);
    }

    private static void task2() {
        System.out.println("Задание 2");
        // Расчитать даты сдаци еженедельных отчетоа, каждую пчтницу..
        // Вывести результат: «Сегодня пятница, ...-е число. Необходимо подготовить отчет»
        // первая пятница dedLine=1..7
        // #00:15-00:25
        //Инициализация
        int[] arreyOne = {1,2,3};
        float[] arreyTwo = {1.57F, 7.654F, 9.986F};
        int[] arreyFree = new int[10];
        System.out.println(Arrays.toString(arreyOne));
        System.out.println(Arrays.toString(arreyTwo));
        System.out.println(Arrays.toString(arreyFree));
    }

    private static void task1() {
        System.out.println("Задание 1");
        // Расчитать даты сдаци еженедельных отчетоа, каждую пчтницу..
        // Вывести результат: «Сегодня пятница, ...-е число. Необходимо подготовить отчет»
        // первая пятница dedLine=1..7
        // #18:28-18:33
        //Инициализация
        int[] arreyOne = {1,2,3};
        float[] arreyTwo = {1.57F, 7.654F, 9.986F};
        int[] arreyFree = new int[10];
        System.out.println("Инициализированны 3 массива, вывод смотрите в задаче №2");
    }

}