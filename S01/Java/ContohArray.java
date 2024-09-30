import java.util.Scanner;

public class ContohArray {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahNamaSiswa = 2;
        String[] namaSiswa = bacaLarik(jumlahNamaSiswa);
        tulisLarik(namaSiswa);
    }

    public static String[] bacaLarik(int jumlahNamaSiswa) {
        String[] namaSiswa = new String[jumlahNamaSiswa];
        for (int i = 0; i < jumlahNamaSiswa; i++) {
            namaSiswa[i] = String.valueOf(i + 1) + ". " + scan.nextLine();
        }
        return namaSiswa;
    }

    public static void tulisLarik(String[] namaSiswa) {
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println(namaSiswa[i]);
        }
    }
}