import java.util.Scanner;

public class dataSearching {
   private static String[] data;
   private static int dataSize = 0;

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Masukan jumlah data: ");
      int jumlahData = input.nextInt();
      input.nextLine();

      data = new String[jumlahData];

      while (true) {
         System.out.println("=========Menu=========");
         System.out.println("1) Menginputkan data");
         System.out.println("2) Pencarian data");
         System.out.println("3) Reset Data");
         System.out.println("4) Exit");
         System.out.println("======================");
         System.out.print("Pilih Menu: ");
         String pilih = input.nextLine();

         switch (pilih) {
            case "1":
               inputData(input);
               break;
            case "2":
               searchData(input);
               break;
            case "3":
               resetData();
               break;
            case "4":
               System.out.println("Terima kasih");
               System.exit(0);
               break;
            default:
               System.out.println("Inputan tidak valid, silahkan coba lagi!");
               break;
         }
      }
   }

   private static void inputData(Scanner input) {
      if (dataSize < data.length) {
         System.out.print("Masukan data: ");
         String newData = input.nextLine();

         data[dataSize] = newData;
         dataSize++;
         System.out.println("Data sukses terinput!");
      } else {
         System.out.println("Maaf, sudah mencapai batas!");
      }
   }

   private static void searchData(Scanner input) {
      System.out.println("Masukan data yang dicari: ");
      String searchData = input.nextLine();

      boolean found = false;
      for (int i = 0; i < dataSize; i++) {
         if (data[i].equalsIgnoreCase(searchData)) {
            System.out.println("Data ditemukan pada indeks ke-" + (i + 1));
            found = true;
            break;
         }
      }
      if (!found) {
         System.out.println("404 not found");
      }
   }

   private static void resetData() {
      dataSize = 0;
      System.out.println("Data direset!");
   }
}