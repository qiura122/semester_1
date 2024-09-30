import java.util.Arrays;
import java.util.Scanner;

public class UAS_AlgoritmaTest {

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
                        System.out.println("Tidak ada Queue");
                    } else {
                        menu.insertionSortAscending();
                    }
                    break;
                case 3:
                    if (menu.size() == 0) {
                        System.out.println("Tidak ada Queue");
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

                        switch (pilihan) {
                            case 1:
                                System.out.print("Input nomor Queue untuk ditambahkan! : ");
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

    public static class UnionQueueStack {
        private int[] data;
        private int front, rear, count;

        private static final int MAX_SIZE = 5;

        public UnionQueueStack() {
            data = new int[MAX_SIZE];
            front = 0;
            rear = -1;
            count = 0;
        }

        public void enqueue(int queue) {
            if (isFull()) {
                System.out.println("Queue sudah penuh!\n Tidak bisa menambahkan Queue lagi!.");
                System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return;
            }
            rear = (rear + 1) % MAX_SIZE;
            data[rear] = queue;
            count++;
            System.out.println("Queue nomor " + queue + " ditambahkan.");
            System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue tidak ada \nTidak bisa mengeluarkan Queue lagi!.");
                System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return;
            }
            int dequeuedAntrian = data[front];
            front = (front + 1) % MAX_SIZE;
            count--;
            System.out.println("Queue nomor " + dequeuedAntrian + " dikeluarkan.");
            System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        public void push(int queue) {
            if (isFull()) {
                System.out.println("Queue Penuh! \nTidak dapat menambah Queue lagi! " + queue + ".");
            } else {
                data[++rear] = queue;
                count++;
                System.out.println("Queue nomor " + queue + " ditambahkan.");
            }
            System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Queue sudah kosong \nTidak bisa mengeluarkan Queue lagi!.");
                System.out.println("Jumlah Queue saat ini: \n(max: " + MAX_SIZE + "): " + count);
                return -1;
            }
            int popQueue = data[rear--];
            count--;
            System.out.println("Antrian nomer " + popQueue + " dikeluarkan.");
            System.out.println("Jumlah antrian (max: " + MAX_SIZE + "): " + count);
            return popQueue;
        }

        public int size() {
            return count;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public boolean isFull() {
            return size() == MAX_SIZE;
        }

        public void reverse() {
            if (count > 0) {
                int start = front;
                int end = rear;

                while (start < end) {
                    int temp = data[start];
                    data[start] = data[end];
                    data[end] = temp;

                    start++;
                    end--;
                }

                System.out.println("Queue berhasil dibalik.");
                System.out.println("Jumlah Queue: \n(max: " + MAX_SIZE + "): " + count);
            } else {
                System.out.println("Queue kosong. Tidak dapat membalikkan Queue");
                System.out.println("Jumlah Queue: \n(max: " + MAX_SIZE + "): " + count);
            }
        }

        public int binarySearch(int nomer) {
            Arrays.sort(data);

            int low = 0;
            int high = count - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int midValue = data[mid];

                if (midValue == nomer) {
                    System.out.println("Antrian nomer " + nomer + " ditemukan pada indeks " + mid + ".");
                    return mid;
                } else if (midValue < nomer) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println("404 (Queue nomer " + nomer + " tidak ditemukan)");
            return -1;
        }

        public void insertionSortAscending() {
            int n = count;

            for (int i = 1; i < n; ++i) {
                int nomor = data[i];
                int j = i - 1;

                while (j >= 0 && nomor < data[j]) {
                    data[j + 1] = data[j];
                    j = j - 1;
                }

                data[j + 1] = nomor;

                System.out.print("Langkah " + i + ": ");
                printArrayA();
            }
        }

        public void printArrayA() {
            for (int i = 0; i < count; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        public void insertionSortDescending() {
            int n = count;

            for (int i = 1; i < n; ++i) {
                int nomor = data[i];
                int j = i - 1;

                while (j >= 0 && data[j] < nomor) {
                    data[j + 1] = data[j];
                    j = j - 1;
                }

                data[j + 1] = nomor;

                System.out.print("Langkah " + i + ": ");
                printArrayD();
            }

            System.out.println("Nomor Queue setelah diurutkan");
            printArrayD();
        }

        public void printArrayD() {
            for (int i = 0; i < count; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}