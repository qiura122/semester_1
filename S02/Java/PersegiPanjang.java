import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan panjang   : ");
        int p = input.nextInt();
        System.out.println("masukan lebar     : ");
        int l = input.nextInt();

        int luas = p * l;
        int kll = (p + l) * 2;

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling            : " + kll);
    }
    
}