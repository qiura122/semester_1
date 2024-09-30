public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Menggunakan operator AND (&&)
        boolean resultAnd = a && b;
        System.out.print("a AND b = " + resultAnd);
        // Hasilnya akan false karena salah satu operandnya (b) adalah false

        // Menggunakan operator OR (||)
        boolean resultOr = a || b;
        System.out.print("a OR b = " + resultOr);
        // Hasilnya akan true karena salah satu operandnya (a) adalah true

        // Menggunakan operator NOT (!)
        boolean resultNotA = !a;
        System.out.print("a NOT b = " + resultNotA);
        // Hasilnya akan false karea a adalah true

    }
}
