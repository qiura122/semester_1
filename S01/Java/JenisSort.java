import java.util.Scanner;

public class JenisSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean perulangan = true;

        while (perulangan) {

            int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

            System.out.println("=======Pilih Menu=======");
            System.out.println("1) Bubble Sort");
            System.out.println("2) Selection Sort");
            System.out.println("3) Insertion Sort");
            System.out.println("========================");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    bubbleSort(arr);
                    break;

                case 2:
                    selectionSort(arr);
                    break;

                case 3:
                    insertionSort(arr);
                    break;

                default:
                    break;
            }

            System.out.println("\nArray sesudah diurutkan");
            printArr(arr);

            System.out.println("Apakah anda ingin mengulangi program [y/t] ?");
            String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                perulangan = true;
            } else {
                perulangan = false;
                System.out.println("Anda keluar dari program!");
            }

        }
        input.close();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            System.out.println("");
            System.out.println("langkah " + i + ": ");
            printArr(arr);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            System.out.println("");
            System.out.println("langkah " + (i + 1) + ": ");
            printArr(arr);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("");
                System.out.println("Langkah " + (i * (n - 1) + j + 1) + ": ");
                printArr(arr);
            }
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
