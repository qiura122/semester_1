import java.util.Scanner;

public class array2Dmhs {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Elemen Array 4 x 3");
            Object[][] array2D = new Object[4][3];

            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");

                    if (key.hasNextInt()) {
                        array2D[i][j] = key.nextInt();
                    } else {
                        array2D[i][j] = key.next();
                    }
                }
            }
            key.nextLine();

            System.out.println("Data Nilai Mahasiswa: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array2D[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Apakah anda ingin lanjut? (Y/T)");
            String jawaban = key.nextLine();

            if (jawaban.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }
        key.close();
    }
}