package lesson_2;

import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc"; //объявление строки

        String hello = sc.nextLine(); //ввод строки с консоли
        String name = sc.next(); // ввод строки до первого пробела (одно слово)


        int a = sc.nextInt(); // ввод числа типа int
        double b = sc.nextDouble(); // ввод числа типа double

        System.out.println(hello + " " + name); // вывод и конкантенация строк

        System.out.println("int: " + a); // вывод и конкантенация строк
        System.out.println("double: " + b); // вывод и конкантенация строк

        // различие между print и println
        System.out.println(); // print + переход на след строку
        System.out.print(""); // print
    }
}
