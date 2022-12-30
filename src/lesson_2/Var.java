package lesson_2;

import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";

        String hello = sc.nextLine();
        String name = sc.next();


        int a = sc.nextInt();
        double b = sc.nextDouble();

        //System.out.println(hello + " " + name);

        System.out.println("int: " + a);
        System.out.println("double: " + b);
        System.out.println("float: " + c);

        System.out.println(); // print + переход на след строку
        System.out.print(); // print
    }
}
