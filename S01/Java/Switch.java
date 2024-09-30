import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner key_input = new Scanner(System.in)) {
            System.out.print("Inputkan Angka (1-7) : ");
            int angka = 0;
            angka = key_input.nextInt();
            System.out.println("=============================");

            switch (angka) {
                case 1:
                    System.out.println("Hari Senin");
                    break;
                case 2:
                    System.out.println("Hari Selasa");
                    break;
                case 3:
                    System.out.println("Hari Rabu");
                    break;
                case 4:
                    System.out.println("Hari Kamis");
                    break;
                case 5:
                    System.out.println("Hari Jumat");
                    break;
                case 6:
                    System.out.println("Hari Sabtu");
                    break;
                case 7:
                    System.out.println("Hari Minggu");
                    break;
                default:
                    System.out.println("Hari Tidak Ada");
                    break;
            }
        }
    }
}
