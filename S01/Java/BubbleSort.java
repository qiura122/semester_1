import java.util.Scanner;

public class BubbleSort {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Masukan jumlah angka: ");
      int jum = input.nextInt();

      int[] arr = new int[jum];

      System.out.println("Masukan" + jum + "angka: ");

      for (int i = 0; i < jum; i++) {
         arr[i] = input.nextInt();
      }

      bubleSort(arr);

      System.out.println("Hasil sudah diurutkan: ");
      for (int num : arr) {
         System.out.println(num + " ");
      }
   }

   public static void bubleSort(int[] arr) {
      int n = arr.length;

      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j+1]) {
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j] = temp;
            }
         }
      }
   }
}
