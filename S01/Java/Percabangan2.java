import java.util.Scanner;

public class Percabangan2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.printf("apakah kamu suka apel: ");
            String nilai = input.nextLine();

            if (nilai.equals("suka")) {
                System.out.println("Nice");
            }else if (nilai.equals("biasa aja")) {
                System.out.println("oke");
            } else {
                System.out.println("Bruh");
            }
        }
    }
}