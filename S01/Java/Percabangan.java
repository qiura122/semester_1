import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("input nilai: ");
            int nilai = input.nextInt();

            if (nilai > 75) {
                System.out.println("Sempurna");
            } else if (nilai == 75) {
                System.out.println("Bagus");
            } else {
                System.out.println("belajar lagi");
            }
        }
    }
}