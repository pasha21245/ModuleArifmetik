import java.util.Scanner;

public class Test4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        randomChislo(a, b, m);
    }

    public static void randomChislo(int min, int max, int m) {
        int i, flag = 0;
        int d = (int) ((Math.random() * (max - min)) + min);
        if (d == 0 || d == 1 || d <= 0) {
            System.out.println(d + " не является простым числом");
        } else {
            for (i = 2; i <= m; i++) {
                if (d % i == 0) {
                    System.out.println(d + " не является простым числом");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(d + " простое числом");
            }
        }
    }
}
