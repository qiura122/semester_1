import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println(celcius + " derajat Celcius sama dengan " + fahrenheit + " derajat Fahrenheit.");

        input.close();
    }
}