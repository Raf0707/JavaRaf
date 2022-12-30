package lesson_2;
/**
 * @byte a; [-128 ; 127] {-2**7; 2**7-1} <8>
 * @short b; [-32768 ; 32767] {-2**15 ; 2**15-1} <16>
 * @int c; [-2147483648 ; 2147483647] {-2**31 ; 2**31-1} <32>
 * @long d; [-9223372036854775808 ; 9223372036854775807] {-2**63 ; 2**63-1} <64>
 * @double e; {4.9 * 10**(-324) ; 1.8 * 10**308} <64>
 * @float f; {1.4 * 10**(-45) ; 3.4 * 10**38} <32>
 * @char x = 88; //код символа X [0 ; 65536] <16>
 * @char y = 'Y'; [0 ; 65536] <16>
 * @boolean g = true; {true | false} <32>
 * @boolean u = false; {true | false} <32>

 * @Продвижение типов
 * @byte, char, short --> int
 * @int a = 2 * 2147483647 --> long
 * @int a * double b --> double
 * @int a * float --> float
*/

public class Prime {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double res = (f * b) + (i / c) - (d * c);

        System.out.println(res);

    }
}
