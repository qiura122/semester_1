import java.util.Scanner;

public class AlgoArray1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int N = key.nextInt();
        int ujian[] = new int[100];
        String indeks[] = new String[100];
        int i = 1;
        while (i <= N) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            ujian[i] = key.nextInt();
            if (ujian[i] >= 80) {
                indeks[i] = "A";
            } else if (ujian[i] < 80 && ujian[i] >= 70) {
                indeks[i] = "B";
            } else if (ujian[i] < 70 && ujian[i] >= 55) {
                indeks[i] = "C";
            } else if (ujian[i] < 55 && ujian[i] >= 45) {
                indeks[i] = "D";
            } else {
                indeks[i] = "E";
            }
            i++;
        }
        System.out.println();
        System.out.println("Data yang sudah dimasukkan adalah : ");
        System.out.println("i     Nilai     Indeks");
        System.out.println("      Ujian      Nilai");
        System.out.println("======================");
        i = 1;
        while (i <= N) {
            System.out.println(i + "       " + ujian[i] + "        " + indeks[i]);
            // System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + ujian[i]);
            // System.out.println("Grade: " + indeks[i]);
            i++;
        }
        System.out.println("======================");
    }
}
