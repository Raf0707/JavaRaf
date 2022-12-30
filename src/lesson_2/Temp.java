import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = sc.nextDouble(); // температура

        if (t > 28.7) {
            System.out.println("Жарко");
        } else if (t < 0) {
            System.out.println("Холодно");
        } else {
            System.out.println("Нормально");
        }
    }
}
