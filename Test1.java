import java.util.Scanner;

public class Test1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int number = sc.nextInt();

        System.out.println(deleniePoModulyu(a, number));
    }

    public static double deleniePoModulyu(int value, int chislo) {
        double x = 0;
        if (value >= 0) {
            x = value % Math.abs(chislo);
        }
        return x;
    }
}
