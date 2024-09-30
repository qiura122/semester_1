import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array = {20,25,30,35,40,45,50,55};

        System.out.println("Nilai berapa yang ingin dicari?");
        int nilaisc = input.nextInt();
        
        //Binary Search
        int low = 0;
        int high = array.length-1;
        
        do {
            
            int mid = (low + high) / 2;
            System.out.println("low " + low);
            System.out.println(" ");
            System.out.println("high " + high);
            System.out.println(" ");
            System.out.println("mid " + mid);
            if (mid == nilaisc) {
                System.out.println("Nilai ditemukan");
            }
            else if (mid > nilaisc) {
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        } while (high >= low);
    }
    public static void linearSearch (int[] array, int nilaisc) {

        // Linear Search
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inputan pengguna " + nilaisc + " dicocokan dengan " + array[i]);
            if (nilaisc == array[i]) {
                System.out.println("Data ditemukan pada " + (i+1));
            } else {
                System.out.println("Data tidak ditemukan (404)");
                break;
            }
        }
    }
}