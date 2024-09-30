import java.util.Scanner;

public class RekursifPangkat {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int p = input.nextInt();
            System.out.println(pangkat(n, p));
        }
    }

    public static int pangkat(int n, int p) {
        if (p < 0) {
            return 1;
        } else if (p > 0) {
            return n * pangkat(n, p - 1);
        } else {
            return 1;
        }
    }
}