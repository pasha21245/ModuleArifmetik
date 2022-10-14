import java.util.Scanner;

public class Test3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();

        deleniePoModulyu(a, x, b, number);
    }

    public static void deleniePoModulyu(int value, int value2, int value3, int chislo) {
        double c = 0;
        if (value >= 0 && value2 >= 0 && value3 >= 0 && (value * value2 == value3 % Math.abs(chislo))) {
            System.out.println("Toshdestvo verno");
        } else {
            System.out.println("Toshdestvo ne verno");
        }
    }
}
