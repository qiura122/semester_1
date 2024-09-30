import java.util.Scanner;

public class AlgoArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang array
        System.out.print("Masukkan panjang array: ");
        int n = scanner.nextInt();

        // Input elemen array
        char[] HURUF = new char[n];
        System.out.println("Masukkan elemen array (karakter): ");
        for (int i = 0; i < n; i++) {
            HURUF[i] = scanner.next().charAt(0);
        }

        // Cek apakah kata palindrom
        if (isPalindrome(HURUF)) {
            System.out.println("Kata adalah palindrom.");
        } else {
            System.out.println("Kata bukan palindrom.");
        }
    }

    // Fungsi untuk mengecek apakah kata palindrom
    private static boolean isPalindrome(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Periksa karakter secara berpasangan dari depan dan belakang
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; // Jika ada perbedaan, bukan palindrom
            }
            start++;
            end--;
        }
        return true; // Jika tidak ada perbedaan, kata adalah palindrom
    }
}
