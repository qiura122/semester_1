import java.util.Scanner;

// I Komang Emo Wijaya Kusuma
// 2315354082
// 1B/TRPL

// Data-data Mobil & Motor
public class utsAlgoritma {
    // Program Utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("y")) {

            System.out.println("===========Pilih Menu==========");
            System.out.println("1. Input Data Mobil");
            System.out.println("2. Input Data Motor");
            System.out.println("3. Keluar Program");
            System.out.println("===============================");
            int pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Data Mobil : ");
                    dataMobil(input);
                    break;
                case 2:
                    System.out.println("Data Motor : ");
                    dataMotor(input);
                    break;

                case 3:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Maaf Pilihan Menu Tidak Valid");
                    break;
            }

            System.out.println("apakah anda ingin masuk ke program utama lagi? [Y/N]: ");
            pilihan = input.nextLine();

        }
    }

    // Sub-Program Data Mobil
    public static void dataMobil(Scanner input) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {

            System.out.println("Masukan Jumlah Data Mobil! : ");
            int jmlMobil = input.nextInt();
            input.nextLine();
            String[][] mobil = new String[jmlMobil][3];
            for (int i = 0; i < jmlMobil; i++) {
                System.out.println("Mobil ke-" + (i + 1) + ": ");

                System.out.println("Masukan Nama Mobil: ");
                mobil[i][0] = input.nextLine();

                System.out.println("Masukan Warna Mobil: ");
                mobil[i][1] = input.nextLine();

                System.out.println("Masukan Harga Mobil: ");
                mobil[i][2] = input.nextLine();
            }
            soutDataMobil(mobil, jmlMobil);
            System.out.println("Apakah Anda Ingin Melanjutkan Program? [Y/N]: ");
            lanjut = input.nextLine();
        }
    }

    // Function untuk menampilkan data Mobil
    public static void soutDataMobil(String[][] mobil, int jmlMobil) {
        System.out.println("\nData Mobil:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| No. | Nama            | Warna           | Harga           |");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < jmlMobil; i++) {
            System.out.printf("| %-3d | %-15s | %-15s | %-15s |\n", (i + 1), mobil[i][0], mobil[i][1], mobil[i][2]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    // Sub-Program Data Motor
    public static void dataMotor(Scanner input) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.println("Masukan Jumlah Data Motor! : ");
            int jmlMotor = input.nextInt();
            input.nextLine();
            String[][] motor = new String[jmlMotor][3];
            for (int i = 0; i < jmlMotor; i++) {
                System.out.println("Motor ke-" + (i + 1) + ": ");

                System.out.print("Masukan Nama Motor : ");
                motor[i][0] = input.nextLine();

                System.out.print("Masukan Warna Motor : ");
                motor[i][1] = input.nextLine();

                System.out.println("Masukan Harga Motor: ");
                motor[i][2] = input.nextLine();

            }
            soutDataMobil(motor, jmlMotor);
            System.out.println("Apakah Anda Ingin Melanjutkan Program? [Y/N]: ");
            lanjut = input.nextLine();
        }
    }

    // Function untuk menampilkan data Motor
    public static void soutDataMotor(String[][] motor, int jmlMotor) {
        System.out.println("\nData Motor:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| No. | Nama            | Warna           | Harga           |");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < jmlMotor; i++) {
            System.out.printf("| %-3d | %-15s | %-15s | %-15s |\n", (i + 1), motor[i][0], motor[i][1], motor[i][2]);
        }
        System.out.println("-------------------------------------------------------------");
    }

}