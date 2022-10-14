import java.util.Scanner;

public class Test2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();

        System.out.println(deleniePoModulyu(a, b, number));
    }

    public static double deleniePoModulyu(int value, int stepen, int chislo) {
        double c = 0;
        if (value >= 0 && stepen >= 0) {
            c = Math.pow(value, stepen) % Math.abs(chislo);
        }
        return c;
    }
}


