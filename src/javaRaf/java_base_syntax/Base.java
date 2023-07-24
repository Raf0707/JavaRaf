import java.util.Scanner;

// Основы Java - однострочный комментарий

/*
Основы Java
1. Примитивы, строки
2. if/else, swich/case, тернарный оператор
3. while, do-while, for, for-each, break, continue
4. Массивы
 - многострочный комментарий
 */
public class Base {
    public static void main(String[] args) {

        // Примитивы, строки

        /*
            byte a; [-128 ; 127] {-2**7; 2**7-1} <8>
            short b; [-32768 ; 32767] {-2**15 ; 2**15-1} <16>
            int c; [-2147483648 ; 2147483647] {-2**31 ; 2**31-1} <32>
            long d; [-9223372036854775808 ; 9223372036854775807] {-2**63 ; 2**63-1} <64>
            double e; {4.9 * 10**(-324) ; 1.8 * 10**308} <64>
            float f; {1.4 * 10**(-45) ; 3.4 * 10**38} <32>
            char x = 88; //код символа X [0 ; 65536] <16>
            char y = 'Y'; [0 ; 65536] <16>
            boolean g = true; {true | false} <32>
            boolean u = false; {true | false} <32>

            Продвижение типов
            byte, char, short --> int
            int a = 2 * 2147483647 --> long
            int a * double b --> double
            int a * float --> float
        */

        {
            byte b = 42;
            char c = 'a';
            short sh = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = 0.1234;

            double res = (f * b) + (i / c) - (d * c);

            System.out.println(res);

            String str = "qwerty";
            System.out.println(b + str + "end");


            // считывание с консоли

            Scanner sc = new Scanner(System.in);
            String s = "abc";

            String hello = sc.nextLine();
            String name = sc.next();


            int a = sc.nextInt();
            double bt = sc.nextDouble();

            //System.out.println(hello + " " + name);

            System.out.println("int: " + a);
            System.out.println("double: " + bt);
            System.out.println("float: " + c);

            System.out.println(); // print + переход на след строку
            System.out.print(""); // print

        }

        // if/else, swich/case, тернарный оператор

        {
            Scanner scan = new Scanner(System.in);
            double temperature = scan.nextDouble(); // температура

            // if/else
            if (temperature > 28.7) {
                System.out.println("Жарко");
            } else if (temperature < 0) {
                System.out.println("Холодно");
            } else {
                System.out.println("Нормально");
            }

            // swich-case
            int num = scan.nextInt();
            switch (num) {
                case -10:
                    System.out.println("отрицательное число");
                case 0:
                    System.out.println("число равно нулю");
                case 10:
                    System.out.println("положительное число");
            }

            //тернарный оператор
            int n = 10;
            // (условие) ? [выражение если true] : [выражение если false]
            System.out.println((n > 0) ? "EEE" : "fff");
        }

        // while, do-while, for, for-each, break, continue
        {
            // for
            int n = 10;
            for (int i = 0; i < n; ++i) {
                System.out.println("Hello, World!");
            }

            //while

            int m = 0;
            while (m < 10) {
                System.out.println(m);
                m++;
            }

            //do-while
            int k = 10;

            do {
                System.out.println("EEEEEEEEEEEEEE");
            } while (--k > 0);

        }

        // break и continue
        {
            int n = 0;
            while (n < 10) {
                if (n == 3) continue; // не выполнять действие на этой итерации и перейти к следующей
                if (n == 8) break; // не выполнять действие на этой итерации и выйти из цикла досрочно

                System.out.println(n);
                n--;
            }
        }
        
        // массивы
        {
            int[] mas = new int[10];

            int mass[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            // for
            for (int i = 0; i < mass.length; ++i) {
                System.out.println(mass[i]);

                if (i == 3) {
                    continue;
                }

                if (i == 5) {
                    break;
                }
            }

            //for-each
            for (int x : mass) {
                System.out.println(x);
            }
        }
    }
}
