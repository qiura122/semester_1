public class Rekursif {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(faktorial(n));
    }

    public static int faktorial(int n) {
        if (n < 1) {
            return -1;
        } else if (n > 1) {
            System.out.println(n + "*" + (n - 1) + "=");
            return n * faktorial(n - 1);
        } else {
            return 1;
        }
    }

    public static int FaktorialBiasa(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }
}