import java.util.Scanner;

public class nilaimahasiswa2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("masukan jumlah mahasiswa : ");
        int jumlahMah = inp.nextInt();
        System.out.println("masukan jumlah mata kulia ");
        int jumMatKul = inp.nextInt();
        float[][] nilai = new float[jumlahMah][jumMatKul];
        String[] nama = new String[jumlahMah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("masukan nama mahasiswa ke " + (i + 1) + " : ");
            nama[i] = inp.next();
            for (int j = 0; j < nilai[i].length; j++) {

                System.out.println("masukan nilai " + nama[i] + " untuk mk " + (j + 1));
                nilai[i][j] = inp.nextFloat();

            }
        }
        // header

        System.out.print(String.format("|%-10s", "nama"));
        for (int i = 0; i < jumMatKul; i++) {
            System.out.print(String.format("|%-10s", "mk " + (i + 1)));
        }
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {

                System.out.print("\t" + nilai[i][j] + " \t");
            }
            System.out.println();
        }
    }
}