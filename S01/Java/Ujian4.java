import java.util.Scanner;

//I Komang Emo Wijaya Kusuma
//2315354082
//TRPL B
public class Ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean perulangan = true;
        while (perulangan) {
            System.out.println("Masukan jumlah data: ");
            int jumlahData = input.nextInt();
            for (int i = 0; i < jumlahData; i++) {

                String[] nama = new String[10];
                String[] jabatan = new String[10];
                int[] jmlhariKerja = new int[10];
                int[] upahPerhari = new int[10];
                double[] gajiPokok = new double[10];
                String myName;
                String myJabatan;
                int myjmlhariKerja;
                int myupahPerhari;
                double mygajiPokok;

                System.out.print("Masukan Nama: ");
                myName = input.next();
                nama[0] = myName;
                System.out.print("Masukan Jabatan: ");
                myJabatan = input.next();
                jabatan[0] = myJabatan;
                System.out.print("Masukan jumlah hari kerja: ");
                myjmlhariKerja = input.nextInt();
                jmlhariKerja[0] = myjmlhariKerja;
                System.out.print("Masukan upah per hari: ");
                myupahPerhari = input.nextInt();
                upahPerhari[0] = myupahPerhari;
                System.out.print("Masukan gaji pokok: ");
                mygajiPokok = input.nextDouble();
                gajiPokok[0] = mygajiPokok;

                input.nextLine();
                tampilkan_data(myName, myJabatan, myjmlhariKerja, myupahPerhari, mygajiPokok);
                System.out.println(take_home_pay(myJabatan, myjmlhariKerja, myupahPerhari, mygajiPokok));
                System.out.println("================================================================================");

            }
            System.out.println("apakah ingin melanjutkan program? ");
            String pilihan = input.nextLine();
            if (pilihan.equals("n")) {
                break;
            }
        }
    }

    public static double take_home_pay(String myJabatan, int myjmlhariKerja, int myupahPerhari, double mygajiPokok) {

        double gajiBersih = 0.0;
        if (myJabatan.equals("manager")) {
            gajiBersih = 200000 + mygajiPokok + (myjmlhariKerja * myupahPerhari);
        } else if (myJabatan.equals("supervisor")) {
            gajiBersih = 50000 + mygajiPokok + (myjmlhariKerja * myupahPerhari);
        } else if (myJabatan.equals("staf")) {
            gajiBersih = 20000 + mygajiPokok + (myjmlhariKerja * myupahPerhari);
        }
        double p = gajiBersih;
        return p;
    }

    public static void tampilkan_data(String nama, String jabatan, int jmlhariKerja, int upahPerhari,
            double gajiPokok) {
        System.out.println("================================");
        System.out.println("nama: " + nama);
        System.out.println("jabatan: " + jabatan);
        System.out.println("jumlah hari kerja: " + jmlhariKerja);
        System.out.println("upah per hari: " + upahPerhari);
        System.out.println("gaji pokok: " + gajiPokok);
        System.out.print("gaji bersih: ");
    }
}
