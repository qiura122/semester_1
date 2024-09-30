import java.util.Scanner;

public class KuisMhs {

    public record recordMahasiswa(
            String nama,
            String nim,
            float nilai,
            char nilaihuruf) {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float totalNilai = 0, rata = 0, max = 0, min = 100;
        int indexMax = 0, indexMin = 0;

        System.out.println("Masukan jumlah mahasiswa: ");
        int n = input.nextInt();

        recordMahasiswa[] mhs = new recordMahasiswa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukan nama mahasiswa " + (i + 1) + ": ");
            String nama = input.next();

            System.out.println("Masukan nim mahasiswa " + (i + 1) + ": ");
            String nim = input.next();
        }
    }
}
