public class Mas {
    public static void main(String[] args) {
        //int mass = new int[10];

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
