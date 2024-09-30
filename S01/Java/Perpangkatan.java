import java.util.Scanner;

public class Perpangkatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.print(a + "^" + n + " = ");

        for (int i = 1; i <= n - 1; i++) {
            System.out.print(a + " x ");
        }
        System.out.print(a);
        System.out.print(" = " + Math.pow(a, n));
    }
}