import java.util.Scanner;

public class Percabangan3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.printf("Input nilai UAS: ");
            int nilai = input.nextInt();

            if (nilai == 100) {
                System.out.println("S");
            } else if (nilai > 90 ) {
                System.out.println("A");
            } else if (nilai > 80) {
                System.out.println("B");
            } else if (nilai > 75){
                System.out.println("C");
            } else if (nilai > 60){
                System.out.println("E");
            } else {
                System.out.println("D");
            }
        }
    }
}