import java.util.Scanner;

public class TugasAlgoritma {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Memperlihatkan List Kopi
            System.out.println("==========List Kopi==========");
            System.out.println("[1] Kopi Hitam");
            System.out.println("[2] Kopi Americano");
            System.out.println("[3] Kopi Capuchino");
            System.out.println("[4] Kopi Capuchino");
            System.out.println("=============================");
            System.out.println("Ketikan angka yang tertera di list untuk memesan!");
            System.out.print("Anda mau pesan kopi apa? : ");

            int pilihKopi = input.nextInt();

            if (pilihKopi == 1) {
                System.out.printf("Kopi Hitam");
            } else if (pilihKopi == 2) {
                System.out.printf("Kopi Americano");
            } else if (pilihKopi == 3) {
                System.out.printf("Kopi Capuchino");
            } else if (pilihKopi == 4) {
                System.out.printf("Kopi Mocachino");
            } else {
                System.out.println("Menu tidak Tersedia");
            }
        }

    }

}