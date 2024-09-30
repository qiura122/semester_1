public class Search {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks elemen jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Periksa apakah nilai target berada di tengah
            if (arr[mid] == target) {
                return mid;
            }

            // Jika nilai target lebih kecil, cari di bagian kiri array
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // Jika nilai target lebih besar, cari di bagian kanan array
                right = mid - 1;
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60 };
        int target = 40;
        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Elemen ditemukan di indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }
    }
}