import java.util.Scanner;

public class Test2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();

        double c = Math.pow(a, b) % Math.abs(number);
        System.out.println(c);
    }
}


