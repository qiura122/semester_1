import java.util.Scanner;

public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        input.close();

        long hasil = hitungFaktorial(n);

        System.out.println(n + "! = " + hasil);
    }

    public static long hitungFaktorial(int n) {
        if (n < 0) {
            System.out.println("Faktorial tidak didefinisikan untuk bilangan bulat negatif.");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            return faktorial;
        }
    }
}