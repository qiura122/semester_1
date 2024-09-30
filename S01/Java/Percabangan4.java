import java.util.Scanner;

public class Percabangan4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Input Nilai      :");
            int nilai = input.nextInt();

            try (Scanner jav = new Scanner(System.in)) {
                System.out.printf("Masukan Password :");
                String karakter = jav.nextLine();

                if (karakter.equals("next") != (nilai == 100)) {
                    System.out.println("Correct Password");
                } else {
                    System.out.println("Wrong Password");
                }
            }
        }
    }
}
