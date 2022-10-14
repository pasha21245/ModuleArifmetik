import java.util.Scanner;

public class Test1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");

        int a = sc.nextInt();
        int number = sc.nextInt();

        double x = a % Math.abs(number);

        System.out.println(x);
    }
}
