import java.util.Scanner;

public class Test3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();

        if(a * x == b % Math.abs(number)){
            System.out.println("Toshdestvo verno");
        } else {
            System.out.println("Toshdestvo ne verno");
        }
    }
}
