// Nama  : I Komang Emo Wijaya Kusuma
// NIM   : 2315354082
// Kelas : 1B / TRPL

import java.util.Arrays;
import java.util.Scanner;

public class UAS_Algoritma {

    // Program utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean outProgram = false;
        UnionQueueStack menu = new UnionQueueStack();

        while (true) {
            System.out.println("===============\nPilih Menu:");
            System.out.println(
                    "1. Binary Search \n2. Insertion Sort Ascending \n3. Insertion Sort Descending \n4. Stack \n5. Queue \n6. Exit \n===============");

            System.out.print("Input Menu! (1-6) : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Input nomor Queue yang dicari! : ");
                    int cariQueue = input.nextInt();
                    menu.binarySearch(cariQueue);
                    break;
                case 2:
                    if (menu.size() == 0) {
                        System.out.println("Tidak ada Queue/Stack");
                    } else {
                        menu.insertionSortAscending();
                    }
                    break;
                case 3:
                    if (menu.size() == 0) {
                        System.out.println("Tidak ada Queue/Stack");
                    } else {
                        menu.insertionSortDescending();
                    }
                    break;
                case 4:
                    outProgram = false;
                    while (!outProgram) {
                        System.out.println("===============");
                        System.out.println(
                                "Pilih Menu Stack: \n1. Push \n2. Pop \n3. isEmpty \n4. isFull \n5. Reverse Stack \n6. Kembali ke Menu Utama");
                        System.out.println("===============");

                        System.out.print("Input Menu! (1-6): ");
                        int pilihan = input.nextInt();

                        // Switch case untuk memproses pilihan menu stack
                        switch (pilihan) {
                            case 1:
                                System.out.print("Input nomor Stack untuk ditambahkan! : ");
                                int elemenTambah = input.nextInt();
                                menu.push(elemenTambah);
                                break;
                            case 2:
                                menu.pop();
                                break;
                            case 3:
                                System.out.println("isEmpty: " + "\n" + menu.isEmpty());
                                break;
                            case 4:
                                System.out.println("isFull : " + "\n" + menu.isFull());
                                break;
                            case 5:
                                menu.reverse();
                                break;
                            case 6:
                                outProgram = true;
                                break;
                            default:
                                System.out.println("404 (Not Found) \nInput pilihan yang tertera di Menu!");
                        }
                    }
                    break;
                case 5:
                    outProgram = false;
                    while (!outProgram) {
                        System.out.println("===============\nPilih Menu Queue:");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. isEmpty");
                        System.out.println("4. isFull");
                        System.out.println("5. Reverse Queue");
                        System.out.println("6. Kembali ke Menu Utama\n===============");

                        System.out.print("Input Menu! (1-6) : ");
                        int pilihan1 = input.nextInt();

                        switch (pilihan1) {
                            case 1:
                                System.out.print("Input nomor Queue untuk ditambahkan! : ");
                                int elemenMasuk = input.nextInt();
                                menu.enqueue(elemenMasuk);
                                break;
                            case 2:
                                menu.dequeue();
                                break;
                            case 3:
                                System.out.println("isEmpty: " + "\n" + menu.isEmpty());
                                break;
                            case 4:
                                System.out.println("isFull : " + "\n" + menu.isFull());
                                break;
                            case 5:
                                menu.reverse();
                                break;
                            case 6:
                                outProgram = true;
                                break;
                            default:
                                System.out.println("404 (not found)\n Input pilihan yang tertera di Menu!");
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program \nTerimakasih");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("404 (not found) \nInput pilihan yang tertera di Menu!");
                    break;
            }
        }
    }

    // Kelas yang menggabungkan operasi Stack dan Queue
    public static class UnionQueueStack {
        private int[] array;
        private int front, rear, count;

        private static final int MAX_SIZE = 5;

        // Konstruktor untuk menginisialisasi Queue
        public UnionQueueStack() {
            array = new int[MAX_SIZE];
            front = 0;
            rear = -1;
            count = 0;
        }

        // Subprogram untuk Enqueue
        public void enqueue(int queue) {
            if (isFull()) {
                System.out.println("Queue sudah penuh!\n Tidak bisa menambahkan Queue lagi!.");
                System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return;
            }
            rear = (rear + 1) % MAX_SIZE;
            array[rear] = queue;
            count++;
            System.out.println("Queue nomor " + queue + " ditambahkan.");
            System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        // Subprogram untuk Dequeue
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue tidak ada \nTidak bisa mengeluarkan Queue lagi!.");
                System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return;
            }
            int dequeuedAntrian = array[front];
            front = (front + 1) % MAX_SIZE;
            count--;
            System.out.println("Queue nomor " + dequeuedAntrian + " dikeluarkan.");
            System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        // Subprogram untuk menambahkan nomor ke dalam stack
        public void push(int stack) {
            if (isFull()) {
                System.out.println("Stack Penuh! \nTidak dapat menambah Stack lagi! " + stack + ".");
            } else {
                array[++rear] = stack;
                count++;
                System.out.println("Stack nomor " + stack + " ditambahkan.");
            }
            System.out.println("Jumlah stack saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        // Subprogram untuk mengeluarkan nomor dari stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack sudah kosong \nTidak bisa mengeluarkan Stack lagi!.");
                System.out.println("Jumlah Stack saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return -1;
            }
            int popStack = array[rear--];
            count--;
            System.out.println("Stack nomor " + popStack + " dikeluarkan.");
            System.out.println("Jumlah Stack: \n(max: " + MAX_SIZE + "): " + count);
            return popStack;
        }

        // Subprogram untuk mendapatkan ukuran dari Queue
        public int size() {
            return count;
        }

        // Subprogram untuk memeriksa apakah Queue kosong
        public boolean isEmpty() {
            return size() == 0;
        }

        // Subprogram untuk memeriksa apakah Queue penuh
        public boolean isFull() {
            return size() == MAX_SIZE;
        }

        // Subprogram untuk membalikkan Queue
        public void reverse() {
            System.out.println("Array sebelum direverse" + Arrays.toString(array));
            if (count > 0) {
                int start = front;
                int end = rear;

                while (start < end) {
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;

                    start++;
                    end--;
                }

                System.out.println("Queue/Stack berhasil dibalik.");
                System.out.println("Jumlah Queue/Stack: \n(max: " + MAX_SIZE + "): " + count);
                System.out.println("Array sesudah direverse" + Arrays.toString(array));
            } else {
                System.out.println("Queue kosong. Tidak dapat membalikkan Queue/Stack");
                System.out.println("Jumlah Queue/Stack: \n(max: " + MAX_SIZE + "): " + count);
            }
        }

        // Subprogram untuk mencari nomer antrian dan menampilkan indeksnya
        public int binarySearch(int nomer) {
            Arrays.sort(array); // Mengurutkan array sebelum melakukan binary search

            int low = 0;
            int high = count - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int midValue = array[mid];

                if (midValue == nomer) {
                    System.out.println("Antrian nomor " + nomer + " ditemukan pada indeks " + mid + ".");
                    return mid;
                } else if (midValue < nomer) {
                    low = mid + 1; // Search di setengah kanan
                } else {
                    high = mid - 1; // Search di setengah kiri
                }
            }

            System.out.println("404 (Antrian nomor " + nomer + " tidak ditemukan)");
            return -1;
        }

        // Subprogram sorting Queue dengan cara insertion sort ascending
        public void insertionSortAscending() {
            int n = count;

            for (int i = 1; i < n; ++i) {
                int nomor = array[i];
                int j = i - 1;

                while (j >= 0 && nomor < array[j]) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }

                array[j + 1] = nomor;

                System.out.print("Langkah " + i + ": ");
                printArrayA();
            }

            System.out.println("Nomor Queue setelah diurutkan");
            printArrayA();
        }

        public void printArrayA() {
            for (int i = 0; i < count; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Subprogram sorting Queue dengan cara insertion sort descending
        public void insertionSortDescending() {
            int n = count;

            for (int i = 1; i < n; ++i) {
                int nomor = array[i];
                int j = i - 1;

                while (j >= 0 && array[j] < nomor) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }

                array[j + 1] = nomor;

                System.out.print("Langkah " + i + ": ");
                printArrayD();
            }

            System.out.println("Nomor Queue/Stack setelah diurutkan");
            printArrayD();
        }

        // Subprogram untuk mencetak nomor Queue yang sudah di Sorting
        public void printArrayD() {
            for (int i = 0; i < count; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}