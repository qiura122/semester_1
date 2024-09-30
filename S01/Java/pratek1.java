import java.util.Scanner;

public class pratek1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("pilih menu : ");
            System.out.println("1. input data mahasiswa");
            System.out.println("2. input data dosen");
            System.out.println("3. exit");
            pilihan = inp.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("masukan data mahasiswa ");
                    dataMahasiswa(inp);
                    break;
                case 2:
                    System.out.println("maukan data dosen");
                    dataDosen(inp);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 3);
    }

    // progran untuk menginput dan menampilkan data mahasiswa

    public static void dataMahasiswa(Scanner inp) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {

            System.out.println("masukan jumlah data ");
            int jumlah = inp.nextInt();
            inp.nextLine();
            String[][] mahasiswa = new String[jumlah][2];
            for (int i = 0; i < jumlah; i++) {
                System.out.println("maha siswa ke " + (i + 1));

                System.out.print("masukan nama mahasiswa : ");
                mahasiswa[i][0] = inp.nextLine();

                System.out.print("masukan NIM mahasiswa : ");
                mahasiswa[i][1] = inp.nextLine();

            }
            outDataMahasiswa(mahasiswa, jumlah);
            System.out.println("ingin melanjutkan ? y/n");
            lanjut = inp.nextLine();

        }
    }

    // function untuk menampilkan data mahasiswa
    public static void outDataMahasiswa(String[][] mahasiswa, int jumlah) {
        System.out.println("\nData Mahasiswa:");
        System.out.println("-------------------------------------------------");
        System.out.println("| No. | Nama                 | NIM              |");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("| %-3d | %-20s | %-15s |\n", (i + 1), mahasiswa[i][0], mahasiswa[i][1]);
        }
        System.out.println("-------------------------------------------------");
    }

    // function unt menginput data dosen

    public static void dataDosen(Scanner inp) {
        String lanjut = "y";
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.println("masukan jumlah data ");
            int jumlah = inp.nextInt();
            inp.nextLine();
            String[][] dosen = new String[jumlah][2];
            for (int i = 0; i < jumlah; i++) {
                System.out.println("maha siswa ke " + (i + 1));

                System.out.print("masukan nama mahasiswa : ");
                dosen[i][0] = inp.nextLine();

                System.out.print("masukan NIM mahasiswa : ");
                dosen[i][1] = inp.nextLine();

            }
            outDataDosen(dosen, jumlah);
            System.out.println("ingin melanjutkan ? y/n");
            lanjut = inp.nextLine();
        }
    }

    // function menampilkan data dosen
    public static void outDataDosen(String[][] dosen, int jumlah) {
        System.out.println("\nData dosen:");
        System.out.println("-------------------------------------------------");
        System.out.println("| No. | Nama                 | NIP              |");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("| %-3d | %-20s | %-15s |\n", (i + 1), dosen[i][0], dosen[i][1]);
        }
        System.out.println("-------------------------------------------------");
    }

}