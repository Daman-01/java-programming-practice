import java.util.Scanner;

public class InputCalculation {
    static void main() {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int add = a+b;
        int difference = a-b;
        float product = a*b;
        int quotient = a/b;
        int remainder = a%b;
        System.out.println(add);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
