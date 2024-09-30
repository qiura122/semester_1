public class InsertionSortAscending {

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        insertionSortAscending(array);

        System.out.println("\nArray setelah diurutkan secara ascending:");
        printArray(array);
    }

    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}