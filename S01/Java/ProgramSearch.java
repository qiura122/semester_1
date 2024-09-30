import java.util.Scanner;

public class ProgramSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            int[] array = { 1, 7, 2, 3, 8, 9, 0, 4, 5, 6 };
            String text = "ini adalah contoh text pencarian";
            int target = 0;
            int result = 0;

            System.out.println("=======Pilih Menu======");
            System.out.println("1. Linear Search\n2. Binary Search\n3. Search tipe String\n4. exit");
            System.out.println("=======================");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    target = 8;
                    result = LinearSearch(array, target);
                    if (result != -1) {
                        System.out.println("Elemen ditemukan di indeks: " + result);
                    } else {
                        System.out.println("Elemen tidak ditemukan dalam array.");
                    }
                    break;
                case 2:
                    target = 5;
                    result = BinarySearch(array, target);
                    if (result != -1) {
                        System.out.println("Elemen ditemukan di indeks: " + result);
                    } else {
                        System.out.println("Elemen tidak ditemukan dalam array.");
                    }
                    break;
                case 3:
                    String searchTerm = "contoh";
                    boolean found = SearchString(text, searchTerm);

                    if (found) {
                        System.out.println("Kata ditemukan dalam teks");
                    } else {
                        System.out.println("Kata tidak ditemukan dalam teks");
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    System.exit(0);
                default:
                    System.out.println("Pilihlah opsi yang tertera dalam menu!");
                    System.out.println("");
                    break;
            }
        } while (true);
    }

    public static int LinearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        System.out.println("");
        return -1;
    }

    public static int BinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else { // Jika nilai target lebih besar, cari di bagian kanan array
                right = mid - 1;
            }
        }
        return -1;
    }

    public static boolean SearchString(String text, String searchTerm) {

        return text.contains(searchTerm);

    }
}